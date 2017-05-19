package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.io.PrintWriter;
import java.io.StringWriter;

import java.util.Properties;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;

public class EntityColsLabeller {
    private Properties prop = null;
    private final String propertyFilePath;
    private final String labelsFilePath;
    private final String entityFilePath;
    private final String entityColUpdtaedFilePath;

    public EntityColsLabeller(String propertyFilePath, String labelsFilePath,
                              String entityFile,
                              String entityColUpdtaedFilePath) {
        super();
        prop = new Properties();
        this.propertyFilePath = propertyFilePath;
        this.labelsFilePath = labelsFilePath;
        this.entityFilePath = entityFile;
        this.entityColUpdtaedFilePath = entityColUpdtaedFilePath;
    }

    private Boolean isFileExists(String filePath) {
        Boolean isExists = false;
        if (filePath != null) {
            File file = new File(filePath);
            if (file.exists() && file.isFile()) {
                isExists = true;
            }
        }
        return isExists;
    }

    private Boolean loadPropertyFile() {
        Boolean isLoaded = false;
        try {
            InputStream propInput = new FileInputStream(propertyFilePath);
            prop.load(propInput);
            isLoaded = true;
        } catch (FileNotFoundException foe) {
            foe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return isLoaded;
    }

    public String processAndUpdatePropFile() {
        String status = null;
        try {
            if (isFileExists(propertyFilePath)) {
                if (isFileExists(labelsFilePath)) {

                    OutputStream propOutput =
                        new FileOutputStream(propertyFilePath, true);

                    BufferedReader labelsReader =
                        new BufferedReader(new FileReader(labelsFilePath));

                    if (loadPropertyFile()) {
                        String label = null;
                        Properties newProperties = new Properties();
                        while ((label = labelsReader.readLine()) != null) {

                            if (label != null &&
                                prop.getProperty(label) == null) {
                                String[] labelFrgs = label.split("_");
                                String labelValue = null;

                                if (labelFrgs != null &&
                                    labelFrgs.length > 0) {
                                    for (String frg : labelFrgs) {
                                        labelValue =
                                                labelValue == null ? "" : labelValue +
                                                " ";
                                        labelValue =
                                                labelValue + Character.toUpperCase(frg.charAt(0)) +
                                                frg.substring(1).toLowerCase();
                                    }
                                    newProperties.setProperty(label,
                                                              labelValue);
                                }
                            }
                        }
                        if (newProperties != null &&
                            newProperties.size() > 0) {
                            newProperties.store(propOutput, null);
                        }
                        status = "properties successfully updated...";
                    }
                } else {
                    status = "Labels file not found.";
                }
            } else {
                status = "Property file not found.";
            }
        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return status;
    }

    public String mapEntityColumns() {
        String status = null;
        try {
            if (isFileExists(entityFilePath)) {
                if (isFileExists(entityColUpdtaedFilePath)) {
                    if (loadPropertyFile()) {
                        BufferedReader br =
                            new BufferedReader(new FileReader(entityFilePath));
                        BufferedWriter bw =
                            new BufferedWriter(new FileWriter(entityColUpdtaedFilePath));
                        String readLine = "";
                        Boolean skipPropFrg = false;
                        String columnName = null;
                        String colInPropFile = null;
                        while ((readLine = br.readLine()) != null) {
                            if (readLine.contains("ColumnName")) {
                                columnName = readLine.split("=")[1];
                                colInPropFile =
                                        columnName.substring(1, columnName.length() -
                                                             1);
                            }
                            if (readLine.contains("<Properties>")) {
                                skipPropFrg = true;
                            }
                            if (readLine.contains("</Attribute>")) {
                                if (!skipPropFrg &&
                                    prop.getProperty(colInPropFile) != null) {
                                    String frg = "<Properties>" + "\n" +
                                        "<SchemaBasedProperties>" + "\n" +
                                        " <LABEL" + "\n" +
                                        "ResId=" + columnName + "/>" + "\n" +
                                        "  </SchemaBasedProperties>" + "\n" +
                                        " </Properties>";
                                    bw.write(frg);
                                    bw.write("\n");
                                }
                                skipPropFrg = false;
                                columnName = null;
                                colInPropFile = null;
                            }
                            bw.write(readLine);
                            bw.write("\n");
                        }
                        if (br != null) {
                            br.close();
                        }
                        if (bw != null) {
                            bw.close();
                        }
                    }
                }
                else {
                    status = "Updated entity file not found.";
                }
            } else {
                status = "Entity file not found.";
            }
//            
        } catch (FileNotFoundException foe) {
            foe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static void main(String[] args) {
        EntityColsLabeller ps =
            new EntityColsLabeller("C:\\Users\\pradeep.n\\Desktop\\propertiesUpdate\\labelsProp.properties",
                                   "C:\\Users\\pradeep.n\\Desktop\\propertiesUpdate\\labels.txt",
                                   "C:\\Users\\pradeep.n\\Desktop\\propertiesUpdate\\entityFile.xml",
                                   "C:\\Users\\pradeep.n\\Desktop\\propertiesUpdate\\updatedEntityFile.xml");
        String statuc = ps.processAndUpdatePropFile();
       String mapStatus= ps.mapEntityColumns();
       System.out.println(statuc);
        System.out.println(mapStatus);
    }
}



//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.18 at 05:41:14 PM IST 
//


package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InheritPersonalization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBObjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BindingStyle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UseGlueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RowClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DesignTime">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Attr">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Properties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SchemaBasedProperties">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LABEL">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ResId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsNotNull" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SQLType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ColumnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xmlns",
    "name",
    "version",
    "inheritPersonalization",
    "dbObjectType",
    "dbObjectName",
    "aliasName",
    "bindingStyle",
    "useGlueCode",
    "rowClass",
    "attribute"
})
@XmlRootElement(name = "Entity")
public class Entity {

    @XmlElement(required = true)
    protected String xmlns;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "InheritPersonalization", required = true)
    protected String inheritPersonalization;
    @XmlElement(name = "DBObjectType", required = true)
    protected String dbObjectType;
    @XmlElement(name = "DBObjectName", required = true)
    protected String dbObjectName;
    @XmlElement(name = "AliasName", required = true)
    protected String aliasName;
    @XmlElement(name = "BindingStyle", required = true)
    protected String bindingStyle;
    @XmlElement(name = "UseGlueCode", required = true)
    protected String useGlueCode;
    @XmlElement(name = "RowClass", required = true)
    protected String rowClass;
    @XmlElement(name = "Attribute")
    protected List<Entity.Attribute> attribute;

    /**
     * Gets the value of the xmlns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * Sets the value of the xmlns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlns(String value) {
        this.xmlns = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the inheritPersonalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritPersonalization() {
        return inheritPersonalization;
    }

    /**
     * Sets the value of the inheritPersonalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritPersonalization(String value) {
        this.inheritPersonalization = value;
    }

    /**
     * Gets the value of the dbObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBObjectType() {
        return dbObjectType;
    }

    /**
     * Sets the value of the dbObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBObjectType(String value) {
        this.dbObjectType = value;
    }

    /**
     * Gets the value of the dbObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBObjectName() {
        return dbObjectName;
    }

    /**
     * Sets the value of the dbObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBObjectName(String value) {
        this.dbObjectName = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasName(String value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the bindingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingStyle() {
        return bindingStyle;
    }

    /**
     * Sets the value of the bindingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingStyle(String value) {
        this.bindingStyle = value;
    }

    /**
     * Gets the value of the useGlueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseGlueCode() {
        return useGlueCode;
    }

    /**
     * Sets the value of the useGlueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseGlueCode(String value) {
        this.useGlueCode = value;
    }

    /**
     * Gets the value of the rowClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowClass() {
        return rowClass;
    }

    /**
     * Sets the value of the rowClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowClass(String value) {
        this.rowClass = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entity.Attribute }
     * 
     * 
     */
    public List<Entity.Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Entity.Attribute>();
        }
        return this.attribute;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DesignTime">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Attr">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Properties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SchemaBasedProperties">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LABEL">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ResId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsNotNull" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SQLType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ColumnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "designTime",
        "properties",
        "name",
        "isNotNull",
        "precision",
        "columnName",
        "sqlType",
        "type",
        "columnType",
        "tableName",
        "primaryKey"
    })
    public static class Attribute {

        @XmlElement(name = "DesignTime", required = true)
        protected Entity.Attribute.DesignTime designTime;
        @XmlElement(name = "Properties")
        protected Entity.Attribute.Properties properties;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "IsNotNull", required = true)
        protected String isNotNull;
        @XmlElement(name = "Precision")
        protected int precision;
        @XmlElement(name = "ColumnName", required = true)
        protected String columnName;
        @XmlElement(name = "SQLType", required = true)
        protected String sqlType;
        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "ColumnType", required = true)
        protected String columnType;
        @XmlElement(name = "TableName", required = true)
        protected String tableName;
        @XmlElement(name = "PrimaryKey", required = true)
        protected String primaryKey;

        /**
         * Gets the value of the designTime property.
         * 
         * @return
         *     possible object is
         *     {@link Entity.Attribute.DesignTime }
         *     
         */
        public Entity.Attribute.DesignTime getDesignTime() {
            return designTime;
        }

        /**
         * Sets the value of the designTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Entity.Attribute.DesignTime }
         *     
         */
        public void setDesignTime(Entity.Attribute.DesignTime value) {
            this.designTime = value;
        }

        /**
         * Gets the value of the properties property.
         * 
         * @return
         *     possible object is
         *     {@link Entity.Attribute.Properties }
         *     
         */
        public Entity.Attribute.Properties getProperties() {
            return properties;
        }

        /**
         * Sets the value of the properties property.
         * 
         * @param value
         *     allowed object is
         *     {@link Entity.Attribute.Properties }
         *     
         */
        public void setProperties(Entity.Attribute.Properties value) {
            this.properties = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the isNotNull property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsNotNull() {
            return isNotNull;
        }

        /**
         * Sets the value of the isNotNull property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsNotNull(String value) {
            this.isNotNull = value;
        }

        /**
         * Gets the value of the precision property.
         * 
         */
        public int getPrecision() {
            return precision;
        }

        /**
         * Sets the value of the precision property.
         * 
         */
        public void setPrecision(int value) {
            this.precision = value;
        }

        /**
         * Gets the value of the columnName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnName() {
            return columnName;
        }

        /**
         * Sets the value of the columnName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnName(String value) {
            this.columnName = value;
        }

        /**
         * Gets the value of the sqlType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSQLType() {
            return sqlType;
        }

        /**
         * Sets the value of the sqlType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSQLType(String value) {
            this.sqlType = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the columnType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumnType() {
            return columnType;
        }

        /**
         * Sets the value of the columnType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumnType(String value) {
            this.columnType = value;
        }

        /**
         * Gets the value of the tableName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableName(String value) {
            this.tableName = value;
        }

        /**
         * Gets the value of the primaryKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryKey() {
            return primaryKey;
        }

        /**
         * Sets the value of the primaryKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryKey(String value) {
            this.primaryKey = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Attr">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "attr"
        })
        public static class DesignTime {

            @XmlElement(name = "Attr", required = true)
            protected Entity.Attribute.DesignTime.Attr attr;

            /**
             * Gets the value of the attr property.
             * 
             * @return
             *     possible object is
             *     {@link Entity.Attribute.DesignTime.Attr }
             *     
             */
            public Entity.Attribute.DesignTime.Attr getAttr() {
                return attr;
            }

            /**
             * Sets the value of the attr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Entity.Attribute.DesignTime.Attr }
             *     
             */
            public void setAttr(Entity.Attribute.DesignTime.Attr value) {
                this.attr = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attr {

                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "Value")
                protected Integer value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setValue(Integer value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SchemaBasedProperties">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LABEL">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ResId" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "schemaBasedProperties"
        })
        public static class Properties {

            @XmlElement(name = "SchemaBasedProperties", required = true)
            protected Entity.Attribute.Properties.SchemaBasedProperties schemaBasedProperties;

            /**
             * Gets the value of the schemaBasedProperties property.
             * 
             * @return
             *     possible object is
             *     {@link Entity.Attribute.Properties.SchemaBasedProperties }
             *     
             */
            public Entity.Attribute.Properties.SchemaBasedProperties getSchemaBasedProperties() {
                return schemaBasedProperties;
            }

            /**
             * Sets the value of the schemaBasedProperties property.
             * 
             * @param value
             *     allowed object is
             *     {@link Entity.Attribute.Properties.SchemaBasedProperties }
             *     
             */
            public void setSchemaBasedProperties(Entity.Attribute.Properties.SchemaBasedProperties value) {
                this.schemaBasedProperties = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LABEL">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ResId" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "label"
            })
            public static class SchemaBasedProperties {

                @XmlElement(name = "LABEL", required = true)
                protected Entity.Attribute.Properties.SchemaBasedProperties.LABEL label;

                /**
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Entity.Attribute.Properties.SchemaBasedProperties.LABEL }
                 *     
                 */
                public Entity.Attribute.Properties.SchemaBasedProperties.LABEL getLABEL() {
                    return label;
                }

                /**
                 * Sets the value of the label property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Entity.Attribute.Properties.SchemaBasedProperties.LABEL }
                 *     
                 */
                public void setLABEL(Entity.Attribute.Properties.SchemaBasedProperties.LABEL value) {
                    this.label = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ResId" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class LABEL {

                    @XmlAttribute(name = "ResId")
                    protected String resId;

                    /**
                     * Gets the value of the resId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getResId() {
                        return resId;
                    }

                    /**
                     * Sets the value of the resId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setResId(String value) {
                        this.resId = value;
                    }

                }

            }

        }

    }

}

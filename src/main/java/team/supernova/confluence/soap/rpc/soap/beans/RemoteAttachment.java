/**
 * RemoteAttachment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package team.supernova.confluence.soap.rpc.soap.beans;

public class RemoteAttachment  implements java.io.Serializable {
    private java.lang.String comment;

    private java.lang.String contentType;

    private java.util.Calendar created;

    private java.lang.String creator;

    private java.lang.String fileName;

    private long fileSize;

    private long id;

    private long pageId;

    private java.lang.String title;

    private java.lang.String url;

    public RemoteAttachment() {
    }

    public RemoteAttachment(
           java.lang.String comment,
           java.lang.String contentType,
           java.util.Calendar created,
           java.lang.String creator,
           java.lang.String fileName,
           long fileSize,
           long id,
           long pageId,
           java.lang.String title,
           java.lang.String url) {
           this.comment = comment;
           this.contentType = contentType;
           this.created = created;
           this.creator = creator;
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.id = id;
           this.pageId = pageId;
           this.title = title;
           this.url = url;
    }


    /**
     * Gets the comment value for this RemoteAttachment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RemoteAttachment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the contentType value for this RemoteAttachment.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this RemoteAttachment.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the created value for this RemoteAttachment.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this RemoteAttachment.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the creator value for this RemoteAttachment.
     * 
     * @return creator
     */
    public java.lang.String getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this RemoteAttachment.
     * 
     * @param creator
     */
    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }


    /**
     * Gets the fileName value for this RemoteAttachment.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this RemoteAttachment.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this RemoteAttachment.
     * 
     * @return fileSize
     */
    public long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this RemoteAttachment.
     * 
     * @param fileSize
     */
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the id value for this RemoteAttachment.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this RemoteAttachment.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the pageId value for this RemoteAttachment.
     * 
     * @return pageId
     */
    public long getPageId() {
        return pageId;
    }


    /**
     * Sets the pageId value for this RemoteAttachment.
     * 
     * @param pageId
     */
    public void setPageId(long pageId) {
        this.pageId = pageId;
    }


    /**
     * Gets the title value for this RemoteAttachment.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RemoteAttachment.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the url value for this RemoteAttachment.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this RemoteAttachment.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteAttachment)) return false;
        RemoteAttachment other = (RemoteAttachment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              this.creator.equals(other.getCreator()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.fileSize == other.getFileSize() &&
            this.id == other.getId() &&
            this.pageId == other.getPageId() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreator() != null) {
            _hashCode += getCreator().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += new Long(getFileSize()).hashCode();
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Long(getPageId()).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteAttachment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.soap.rpc.confluence.atlassian.com", "RemoteAttachment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

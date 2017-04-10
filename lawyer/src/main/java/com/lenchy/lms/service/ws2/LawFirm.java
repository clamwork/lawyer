/**
 * LawFirm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lenchy.lms.service.ws2;

public class LawFirm  implements java.io.Serializable {
    private java.lang.String address;

    private java.util.Calendar approveDate;

    private com.lenchy.lms.service.ws2.LawFirmAttributesEntry[] attributes;

    private java.util.Calendar createDate;

    private java.lang.String director;

    private java.lang.String directorId;

    private java.lang.String email;

    private java.lang.String fax;

    private java.lang.String id;

    private java.lang.String justiceBureau;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String lawFirmType;

    private java.lang.String licenseNumber;

    private java.lang.String name;

    private java.lang.String personId;

    private java.lang.String phone;

    private java.lang.String postcode;

    private java.lang.String practiceStatus;

    private java.lang.String registeredCapital;

    private java.lang.String website;

    public LawFirm() {
    }

    public LawFirm(
           java.lang.String address,
           java.util.Calendar approveDate,
           com.lenchy.lms.service.ws2.LawFirmAttributesEntry[] attributes,
           java.util.Calendar createDate,
           java.lang.String director,
           java.lang.String directorId,
           java.lang.String email,
           java.lang.String fax,
           java.lang.String id,
           java.lang.String justiceBureau,
           java.util.Calendar lastUpdateDate,
           java.lang.String lawFirmType,
           java.lang.String licenseNumber,
           java.lang.String name,
           java.lang.String personId,
           java.lang.String phone,
           java.lang.String postcode,
           java.lang.String practiceStatus,
           java.lang.String registeredCapital,
           java.lang.String website) {
           this.address = address;
           this.approveDate = approveDate;
           this.attributes = attributes;
           this.createDate = createDate;
           this.director = director;
           this.directorId = directorId;
           this.email = email;
           this.fax = fax;
           this.id = id;
           this.justiceBureau = justiceBureau;
           this.lastUpdateDate = lastUpdateDate;
           this.lawFirmType = lawFirmType;
           this.licenseNumber = licenseNumber;
           this.name = name;
           this.personId = personId;
           this.phone = phone;
           this.postcode = postcode;
           this.practiceStatus = practiceStatus;
           this.registeredCapital = registeredCapital;
           this.website = website;
    }


    /**
     * Gets the address value for this LawFirm.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LawFirm.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the approveDate value for this LawFirm.
     * 
     * @return approveDate
     */
    public java.util.Calendar getApproveDate() {
        return approveDate;
    }


    /**
     * Sets the approveDate value for this LawFirm.
     * 
     * @param approveDate
     */
    public void setApproveDate(java.util.Calendar approveDate) {
        this.approveDate = approveDate;
    }


    /**
     * Gets the attributes value for this LawFirm.
     * 
     * @return attributes
     */
    public com.lenchy.lms.service.ws2.LawFirmAttributesEntry[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this LawFirm.
     * 
     * @param attributes
     */
    public void setAttributes(com.lenchy.lms.service.ws2.LawFirmAttributesEntry[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the createDate value for this LawFirm.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this LawFirm.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the director value for this LawFirm.
     * 
     * @return director
     */
    public java.lang.String getDirector() {
        return director;
    }


    /**
     * Sets the director value for this LawFirm.
     * 
     * @param director
     */
    public void setDirector(java.lang.String director) {
        this.director = director;
    }


    /**
     * Gets the directorId value for this LawFirm.
     * 
     * @return directorId
     */
    public java.lang.String getDirectorId() {
        return directorId;
    }


    /**
     * Sets the directorId value for this LawFirm.
     * 
     * @param directorId
     */
    public void setDirectorId(java.lang.String directorId) {
        this.directorId = directorId;
    }


    /**
     * Gets the email value for this LawFirm.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this LawFirm.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this LawFirm.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this LawFirm.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the id value for this LawFirm.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this LawFirm.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the justiceBureau value for this LawFirm.
     * 
     * @return justiceBureau
     */
    public java.lang.String getJusticeBureau() {
        return justiceBureau;
    }


    /**
     * Sets the justiceBureau value for this LawFirm.
     * 
     * @param justiceBureau
     */
    public void setJusticeBureau(java.lang.String justiceBureau) {
        this.justiceBureau = justiceBureau;
    }


    /**
     * Gets the lastUpdateDate value for this LawFirm.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this LawFirm.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the lawFirmType value for this LawFirm.
     * 
     * @return lawFirmType
     */
    public java.lang.String getLawFirmType() {
        return lawFirmType;
    }


    /**
     * Sets the lawFirmType value for this LawFirm.
     * 
     * @param lawFirmType
     */
    public void setLawFirmType(java.lang.String lawFirmType) {
        this.lawFirmType = lawFirmType;
    }


    /**
     * Gets the licenseNumber value for this LawFirm.
     * 
     * @return licenseNumber
     */
    public java.lang.String getLicenseNumber() {
        return licenseNumber;
    }


    /**
     * Sets the licenseNumber value for this LawFirm.
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(java.lang.String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    /**
     * Gets the name value for this LawFirm.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LawFirm.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the personId value for this LawFirm.
     * 
     * @return personId
     */
    public java.lang.String getPersonId() {
        return personId;
    }


    /**
     * Sets the personId value for this LawFirm.
     * 
     * @param personId
     */
    public void setPersonId(java.lang.String personId) {
        this.personId = personId;
    }


    /**
     * Gets the phone value for this LawFirm.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this LawFirm.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postcode value for this LawFirm.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this LawFirm.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the practiceStatus value for this LawFirm.
     * 
     * @return practiceStatus
     */
    public java.lang.String getPracticeStatus() {
        return practiceStatus;
    }


    /**
     * Sets the practiceStatus value for this LawFirm.
     * 
     * @param practiceStatus
     */
    public void setPracticeStatus(java.lang.String practiceStatus) {
        this.practiceStatus = practiceStatus;
    }


    /**
     * Gets the registeredCapital value for this LawFirm.
     * 
     * @return registeredCapital
     */
    public java.lang.String getRegisteredCapital() {
        return registeredCapital;
    }


    /**
     * Sets the registeredCapital value for this LawFirm.
     * 
     * @param registeredCapital
     */
    public void setRegisteredCapital(java.lang.String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }


    /**
     * Gets the website value for this LawFirm.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this LawFirm.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LawFirm)) return false;
        LawFirm other = (LawFirm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.approveDate==null && other.getApproveDate()==null) || 
             (this.approveDate!=null &&
              this.approveDate.equals(other.getApproveDate()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.director==null && other.getDirector()==null) || 
             (this.director!=null &&
              this.director.equals(other.getDirector()))) &&
            ((this.directorId==null && other.getDirectorId()==null) || 
             (this.directorId!=null &&
              this.directorId.equals(other.getDirectorId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.justiceBureau==null && other.getJusticeBureau()==null) || 
             (this.justiceBureau!=null &&
              this.justiceBureau.equals(other.getJusticeBureau()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.lawFirmType==null && other.getLawFirmType()==null) || 
             (this.lawFirmType!=null &&
              this.lawFirmType.equals(other.getLawFirmType()))) &&
            ((this.licenseNumber==null && other.getLicenseNumber()==null) || 
             (this.licenseNumber!=null &&
              this.licenseNumber.equals(other.getLicenseNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.personId==null && other.getPersonId()==null) || 
             (this.personId!=null &&
              this.personId.equals(other.getPersonId()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            ((this.practiceStatus==null && other.getPracticeStatus()==null) || 
             (this.practiceStatus!=null &&
              this.practiceStatus.equals(other.getPracticeStatus()))) &&
            ((this.registeredCapital==null && other.getRegisteredCapital()==null) || 
             (this.registeredCapital!=null &&
              this.registeredCapital.equals(other.getRegisteredCapital()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getApproveDate() != null) {
            _hashCode += getApproveDate().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDirector() != null) {
            _hashCode += getDirector().hashCode();
        }
        if (getDirectorId() != null) {
            _hashCode += getDirectorId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getJusticeBureau() != null) {
            _hashCode += getJusticeBureau().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getLawFirmType() != null) {
            _hashCode += getLawFirmType().hashCode();
        }
        if (getLicenseNumber() != null) {
            _hashCode += getLicenseNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPersonId() != null) {
            _hashCode += getPersonId().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        if (getPracticeStatus() != null) {
            _hashCode += getPracticeStatus().hashCode();
        }
        if (getRegisteredCapital() != null) {
            _hashCode += getRegisteredCapital().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LawFirm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws2.service.lms.lenchy.com/", "lawFirm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws2.service.lms.lenchy.com/", ">>lawFirm>attributes>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("director");
        elemField.setXmlName(new javax.xml.namespace.QName("", "director"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justiceBureau");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justiceBureau"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lawFirmType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lawFirmType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("practiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "practiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registeredCapital");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registeredCapital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("", "website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

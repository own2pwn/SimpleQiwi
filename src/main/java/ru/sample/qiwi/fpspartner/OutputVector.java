/**
 * OutputVector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package ru.sample.qiwi.fpspartner;


/**
 *  OutputVector bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class OutputVector implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://example.org/FPSPartner",
            "outputVector", "ns1");

    /**
     * field for Login
     */
    protected ru.sample.qiwi.fpspartner.P50Type localLogin;

    /**
     * field for Password
     */
    protected ru.sample.qiwi.fpspartner.P50Type localPassword;

    /**
     * field for Partnerid
     */
    protected ru.sample.qiwi.fpspartner.PartneridType localPartnerid;

    /**
     * field for Applicationid
     */
    protected ru.sample.qiwi.fpspartner.P100Type localApplicationid;

    /**
     * field for Applicationdate
     */
    protected ru.sample.qiwi.fpspartner.DatetimeType localApplicationdate;

    /**
     * field for Applicanttype
     */
    protected ru.sample.qiwi.fpspartner.ApplicanttypeType localApplicanttype;

    /**
     * field for Applicanttypenum
     */
    protected ru.sample.qiwi.fpspartner.ApplicanttypenumType localApplicanttypenum;

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getLogin() {
        return localLogin;
    }

    /**
     * Auto generated setter method
     * @param param Login
     */
    public void setLogin(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localLogin = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P50Type
     */
    public ru.sample.qiwi.fpspartner.P50Type getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(ru.sample.qiwi.fpspartner.P50Type param) {
        this.localPassword = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.PartneridType
     */
    public ru.sample.qiwi.fpspartner.PartneridType getPartnerid() {
        return localPartnerid;
    }

    /**
     * Auto generated setter method
     * @param param Partnerid
     */
    public void setPartnerid(ru.sample.qiwi.fpspartner.PartneridType param) {
        this.localPartnerid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.P100Type
     */
    public ru.sample.qiwi.fpspartner.P100Type getApplicationid() {
        return localApplicationid;
    }

    /**
     * Auto generated setter method
     * @param param Applicationid
     */
    public void setApplicationid(ru.sample.qiwi.fpspartner.P100Type param) {
        this.localApplicationid = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.DatetimeType
     */
    public ru.sample.qiwi.fpspartner.DatetimeType getApplicationdate() {
        return localApplicationdate;
    }

    /**
     * Auto generated setter method
     * @param param Applicationdate
     */
    public void setApplicationdate(ru.sample.qiwi.fpspartner.DatetimeType param) {
        this.localApplicationdate = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicanttypeType
     */
    public ru.sample.qiwi.fpspartner.ApplicanttypeType getApplicanttype() {
        return localApplicanttype;
    }

    /**
     * Auto generated setter method
     * @param param Applicanttype
     */
    public void setApplicanttype(ru.sample.qiwi.fpspartner.ApplicanttypeType param) {
        this.localApplicanttype = param;
    }

    /**
     * Auto generated getter method
     * @return ru.sample.qiwi.fpspartner.ApplicanttypenumType
     */
    public ru.sample.qiwi.fpspartner.ApplicanttypenumType getApplicanttypenum() {
        return localApplicanttypenum;
    }

    /**
     * Auto generated setter method
     * @param param Applicanttypenum
     */
    public void setApplicanttypenum(
        ru.sample.qiwi.fpspartner.ApplicanttypenumType param) {
        this.localApplicanttypenum = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://example.org/FPSPartner");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":outputVector", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "outputVector", xmlWriter);
            }
        }

        if (localLogin == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "login cannot be null!!");
        }

        localLogin.serialize(new javax.xml.namespace.QName("", "login"),
            xmlWriter);

        if (localPassword == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "password cannot be null!!");
        }

        localPassword.serialize(new javax.xml.namespace.QName("", "password"),
            xmlWriter);

        if (localPartnerid == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "partnerid cannot be null!!");
        }

        localPartnerid.serialize(new javax.xml.namespace.QName("", "partnerid"),
            xmlWriter);

        if (localApplicationid == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationid cannot be null!!");
        }

        localApplicationid.serialize(new javax.xml.namespace.QName("",
                "applicationid"), xmlWriter);

        if (localApplicationdate == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicationdate cannot be null!!");
        }

        localApplicationdate.serialize(new javax.xml.namespace.QName("",
                "applicationdate"), xmlWriter);

        if (localApplicanttype == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicanttype cannot be null!!");
        }

        localApplicanttype.serialize(new javax.xml.namespace.QName("",
                "applicanttype"), xmlWriter);

        if (localApplicanttypenum == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "applicanttypenum cannot be null!!");
        }

        localApplicanttypenum.serialize(new javax.xml.namespace.QName("",
                "applicanttypenum"), xmlWriter);

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://example.org/FPSPartner")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static OutputVector parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            OutputVector object = new OutputVector();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"outputVector".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (OutputVector) ru.sample.qiwi.fpspartner.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "login").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "login").equals(
                            reader.getName())) {
                    object.setLogin(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "password").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "password").equals(
                            reader.getName())) {
                    object.setPassword(ru.sample.qiwi.fpspartner.P50Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "partnerid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "partnerid").equals(
                            reader.getName())) {
                    object.setPartnerid(ru.sample.qiwi.fpspartner.PartneridType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicationid").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicationid").equals(
                            reader.getName())) {
                    object.setApplicationid(ru.sample.qiwi.fpspartner.P100Type.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicationdate").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicationdate").equals(
                            reader.getName())) {
                    object.setApplicationdate(ru.sample.qiwi.fpspartner.DatetimeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicanttype").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicanttype").equals(
                            reader.getName())) {
                    object.setApplicanttype(ru.sample.qiwi.fpspartner.ApplicanttypeType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if ((reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "applicanttypenum").equals(
                            reader.getName())) ||
                        new javax.xml.namespace.QName("", "applicanttypenum").equals(
                            reader.getName())) {
                    object.setApplicanttypenum(ru.sample.qiwi.fpspartner.ApplicanttypenumType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}

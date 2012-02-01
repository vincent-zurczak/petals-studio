package com.ebmwebsourcing.petals.services.ftp.generated;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/****************************************************************************
 * 
 * Copyright (c) 2008-2011, EBM WebSourcing
 * 
 * This source code is available under agreement available at
 * http://www.petalslink.com/legal/licenses/petals-studio
 * 
 * You should have received a copy of the agreement along with this program.
 * If not, write to EBM WebSourcing (4, rue Amelie - 31200 Toulouse, France).
 * 
 *****************************************************************************/

/**
  * This class was generated by EMF JET. 
  * <b>DO NOT MODIFY IT!</b>
  * @author Adrien LOUIS - EBM WebSourcing 
  */
public class FtpService34 {

  protected static String nl;
  public static synchronized FtpService34 create(String lineSeparator)
  {
    nl = lineSeparator;
    FtpService34 result = new FtpService34();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" + NL + "<wsdl:definitions xmlns:tns=\"http://petals.ow2.org/components/ftp/version-3\"" + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\tname=\"ftpInterface\" targetNamespace=\"http://petals.ow2.org/components/ftp/version-3\"" + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\">" + NL + "" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\t\t\telementFormDefault=\"qualified\" targetNamespace=\"http://petals.ow2.org/components/ftp/version-3\">" + NL + "" + NL + "\t\t\t<xsd:element name=\"get\" type=\"tns:getType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"getType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"1\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"0\">" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t<xsd:element name=\"getResponse\" type=\"tns:getResponseType\">" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"getResponseType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:any></xsd:any>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t" + NL + "\t\t\t<xsd:element name=\"getAsAttachment\" type=\"tns:getType\" />" + NL + "\t\t\t<xsd:element name=\"getAsAttachmentResponse\" type=\"tns:getAsAttachmentResponse\" />" + NL + "\t\t\t<xsd:complexType name=\"getAsAttachmentResponse\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"attachment\" type=\"tns:attachmentType\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mget\" type=\"tns:mgetType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"mgetType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"unbounded\" minOccurs=\"1\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"0\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"mgetResponse\" type=\"tns:mgetResponse\">" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"mgetResponse\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"attachments\" type=\"tns:attachmentType\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"anyType\"></xsd:complexType>" + NL + "\t\t\t<xsd:element name=\"put\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"body\" type=\"xsd:string\" maxOccurs=\"1\"" + NL + "\t\t\t\t\t\t\tminOccurs=\"1\">" + NL + "\t\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"1\">" + NL + "\t\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\"" + NL + "\t\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"0\">" + NL + "\t\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"mput\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"attachments\" type=\"tns:attachmentType\"" + NL + "\t\t\t\t\t\t\tminOccurs=\"1\" maxOccurs=\"1\">" + NL + "\t\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:complexType name=\"attachmentType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:base64Binary\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"unbounded\" minOccurs=\"1\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:element name=\"dir\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\"" + NL + "\t\t\t\t\t\t\tmaxOccurs=\"1\" minOccurs=\"0\">" + NL + "\t\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:element name=\"dirResponse\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\t\tmaxOccurs=\"unbounded\" minOccurs=\"0\"></xsd:element>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "" + NL + "\t\t\t<xsd:complexType name=\"ConnectionType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"server\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"port\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"user\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"password\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"folder\" type=\"xsd:string\" minOccurs=\"0\"" + NL + "\t\t\t\t\t\tmaxOccurs=\"1\">" + NL + "\t\t\t\t\t\t<xsd:annotation>" + NL + "\t\t\t\t\t\t\t<xsd:documentation>Folder on the FTP server to read/write" + NL + "\t\t\t\t\t\t\t\t(optional : The default value is the default directory of the" + NL + "\t\t\t\t\t\t\t\tftp user)</xsd:documentation>" + NL + "\t\t\t\t\t\t</xsd:annotation>" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"transfer-type\" type=\"tns:transfer-typeType\">" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"connection-mode\" type=\"tns:connection-modeType\">" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"delete-processed-files\" type=\"xsd:boolean\"" + NL + "\t\t\t\t\t\tminOccurs=\"0\" maxOccurs=\"1\">" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"encoding\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\tminOccurs=\"0\" maxOccurs=\"1\">" + NL + "\t\t\t\t\t\t<xsd:annotation>" + NL + "\t\t\t\t\t\t\t<xsd:documentation>Character encoding used by the FTP control" + NL + "\t\t\t\t\t\t\t\tconnection.</xsd:documentation>" + NL + "\t\t\t\t\t\t</xsd:annotation>" + NL + "\t\t\t\t\t</xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<xsd:simpleType name=\"transfer-typeType\">" + NL + "\t\t\t\t<xsd:restriction base=\"xsd:string\">" + NL + "\t\t\t\t\t<xsd:enumeration value=\"ascii\" />" + NL + "\t\t\t\t\t<xsd:enumeration value=\"binary\" />" + NL + "\t\t\t\t</xsd:restriction>" + NL + "\t\t\t</xsd:simpleType>" + NL + "\t\t\t<xsd:simpleType name=\"connection-modeType\">" + NL + "\t\t\t\t<xsd:restriction base=\"xsd:string\">" + NL + "\t\t\t\t\t<xsd:enumeration value=\"active\" />" + NL + "\t\t\t\t\t<xsd:enumeration value=\"passive\" />" + NL + "\t\t\t\t</xsd:restriction>" + NL + "\t\t\t</xsd:simpleType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"del\" type=\"tns:delType\">" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"delType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\"" + NL + "\t\t\t\t\t\tminOccurs=\"1\" maxOccurs=\"1\"></xsd:element>" + NL + "\t\t\t\t\t<xsd:element name=\"connection\" type=\"tns:ConnectionType\"" + NL + "\t\t\t\t\t\tminOccurs=\"0\" maxOccurs=\"1\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "" + NL + "\t\t\t<!-- FAULT type -->" + NL + "\t\t\t<xsd:element name=\"missingElementFault\" type=\"tns:missingElementFaultType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"missingElementFaultType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t<xsd:element name=\"ioFault\" type=\"tns:ioFaultType\"></xsd:element>" + NL + "\t\t\t<xsd:complexType name=\"ioFaultType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\"></xsd:element>" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "" + NL + "\t<!-- Message Part -->" + NL + "\t<wsdl:message name=\"getRequest\">" + NL + "\t\t<wsdl:part name=\"getRequest\" element=\"tns:get\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getResponse\">" + NL + "\t\t<wsdl:part name=\"getResponse\" element=\"tns:getResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getAsAttachmentRequest\">" + NL + "\t\t<wsdl:part name=\"getAsAttachment\" element=\"tns:getAsAttachment\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getAsAttachmentResponse\">" + NL + "\t\t<wsdl:part name=\"getAsAttachmentResponse\" element=\"tns:getAsAttachmentResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"mgetRequest\">" + NL + "\t\t<wsdl:part name=\"mgetRequest\" element=\"tns:mget\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"mgetResponse\">" + NL + "\t\t<wsdl:part name=\"mgetResponse\" element=\"tns:mgetResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"putRequest\">" + NL + "\t\t<wsdl:part name=\"putRequest\" element=\"tns:put\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"mputRequest\">" + NL + "\t\t\t\t<wsdl:part name=\"mputRequest\" element=\"tns:mput\"></wsdl:part>" + NL + "\t\t\t</wsdl:message>" + NL + "\t<wsdl:message name=\"dirRequest\">" + NL + "\t\t<wsdl:part name=\"dirRequest\" element=\"tns:dir\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"dirResponse\">" + NL + "\t\t<wsdl:part name=\"dirResponse\" element=\"tns:dirResponse\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"delRequest\">" + NL + "\t\t<wsdl:part name=\"delRequest\" element=\"tns:del\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<!-- FAULT message section -->" + NL + "\t<wsdl:message name=\"get_ioFaultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"get_MissEltFault\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"mGet_ioFaultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"mGet_MissEltFault\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"dir_ioFault\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getAsAttachment_ioFault\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getAsAttachment_MissEltFault\">" + NL + "\t\t<wsdl:part name=\"missingElementFault\" element=\"tns:missingElementFault\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"checkFileFault\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "" + NL + "\t<!-- Interface Part -->" + NL + "\t<wsdl:portType name=\"Ftp\">" + NL + "\t\t<wsdl:operation name=\"get\">" + NL + "\t\t\t<wsdl:input message=\"tns:getRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:getResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:get_ioFaultMsg\"></wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:get_MissEltFault\"></wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"getAsAttachment\">" + NL + "\t\t\t<wsdl:input message=\"tns:getAsAttachmentRequest\"></wsdl:input>" + NL + "\t\t\t<wsdl:output message=\"tns:getAsAttachmentResponse\"></wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:getAsAttachment_ioFault\"></wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:getAsAttachment_MissEltFault\"></wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"mget\">" + NL + "\t\t\t<wsdl:input message=\"tns:mgetRequest\"></wsdl:input>" + NL + "\t\t\t<wsdl:output message=\"tns:mgetResponse\"></wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:mGet_ioFaultMsg\"></wsdl:fault>" + NL + "\t\t\t<wsdl:fault name=\"fault1\" message=\"tns:mGet_MissEltFault\"></wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"put\">" + NL + "\t\t\t<wsdl:input message=\"tns:putRequest\"></wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"mput\">" + NL + "\t\t\t<wsdl:input message=\"tns:mputRequest\"></wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"dir\">" + NL + "\t\t\t<wsdl:input message=\"tns:dirRequest\"></wsdl:input>" + NL + "\t\t\t<wsdl:output message=\"tns:dirResponse\"></wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:dir_ioFault\"></wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"del\">" + NL + "\t\t\t<wsdl:input message=\"tns:delRequest\"></wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "" + NL + "\t<!--" + NL + "\t\tThis binding section is defined only to expose this WSDL via SOAP" + NL + "\t\tcomponent to external service consumers" + NL + "\t-->" + NL + "\t<wsdl:binding name=\"FtpServiceSoapBinding\" type=\"tns:Ftp\">" + NL + "" + NL + "\t<soap:binding style=\"document\" transport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t<wsdl:operation name=\"get\">" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/get\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t\t<wsdl:output>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:output>" + NL + "\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t</wsdl:fault>" + NL + "" + NL + "\t</wsdl:operation>" + NL + "\t<wsdl:operation name=\"getAsAttachment\">" + NL + "\t\t<soap:operation" + NL + "\t\t\tsoapAction=\"http://petals.ow2.org/components/ftp/version-3/getAsAttachment\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t\t<wsdl:output>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:output>" + NL + "\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t</wsdl:operation>" + NL + "" + NL + "\t<wsdl:operation name=\"mget\">" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/mget\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t\t<wsdl:output>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:output>" + NL + "\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t\t<wsdl:fault name=\"fault1\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault1\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t</wsdl:operation>" + NL + "" + NL + "\t<wsdl:operation name=\"put\">" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/put\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t</wsdl:operation>" + NL + "\t<wsdl:operation name=\"mput\">" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/mput\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t</wsdl:operation>" + NL + "\t<wsdl:operation name=\"dir\">" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/dir\" />" + NL + "\t\t<wsdl:input>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t\t<wsdl:output>" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:output>" + NL + "\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t</wsdl:fault>" + NL + "\t</wsdl:operation>" + NL + "" + NL + "\t<wsdl:operation name=\"del\">" + NL + "" + NL + "\t\t<soap:operation soapAction=\"http://petals.ow2.org/components/ftp/version-3/del\" />" + NL + "\t\t<wsdl:input>" + NL + "" + NL + "\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t</wsdl:input>" + NL + "\t</wsdl:operation>" + NL + "</wsdl:binding>" + NL + "" + NL + "\t<!--" + NL + "\t\tThis section must be overridden at the SU definition and the matching" + NL + "\t\tService and" + NL + "\t-->" + NL + "\t<wsdl:service name=\"myFTPSUServiceName\">" + NL + "\t\t<wsdl:port name=\"myFTPSUEndpointName\" binding=\"tns:FtpServiceSoapBinding\">" + NL + "\t\t\t<soap:address location=\"jbi://myFTPSUEndpointName\" />" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";
  protected final String TEXT_2 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
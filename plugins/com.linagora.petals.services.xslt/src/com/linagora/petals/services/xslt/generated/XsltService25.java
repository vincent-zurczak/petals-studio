package com.linagora.petals.services.xslt.generated;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/******************************************************************************
 * Copyright (c) 2008-2019, Linagora
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Linagora - initial API and implementation
 *******************************************************************************/

/**
  * This class was generated by EMF JET. 
  * <b>DO NOT MODIFY IT!</b>
  * @author Adrien LOUIS - EBM WebSourcing 
  */
public class XsltService25 {

  protected static String nl;
  public static synchronized XsltService25 create(String lineSeparator)
  {
    nl = lineSeparator;
    XsltService25 result = new XsltService25();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions " + NL + "\txmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\"" + NL + "\txmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" " + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\txmlns:tns=\"http://petals.ow2.org/components/xslt/version-2\" " + NL + "\txmlns:mime=\"http://schemas.xmlsoap.org/wsdl/mime/\"" + NL + "\tname=\"XsltService\" " + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/xslt/version-2\">" + NL + "\t" + NL + "\t<!-- Types -->" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema " + NL + "\t\t\telementFormDefault=\"qualified\"" + NL + "\t\t\ttargetNamespace=\"http://petals.ow2.org/components/xslt/version-2\">" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t<!-- MTOM attachment -->" + NL + "\t\t\t<xsd:element name=\"attachedTransformResponse\" type=\"tns:attachment\" />" + NL + "\t\t\t<xsd:complexType name=\"attachment\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element " + NL + "\t\t\t\t\t\txmlns:ns2=\"http://www.w3.org/2005/05/xmlmime\"" + NL + "\t\t\t\t\t\tminOccurs=\"0\" name=\"fileContent\" " + NL + "\t\t\t\t\t\tns2:expectedContentTypes=\"application/octet-stream\"" + NL + "\t\t\t\t\t\ttype=\"xsd:base64Binary\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<!-- Exception -->" + NL + "\t\t\t<xsd:element name=\"xsltFault\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\" minOccurs=\"1\" maxOccurs=\"1\" />" + NL + "\t\t\t\t\t\t<xsd:element name=\"details\" type=\"xsd:string\" minOccurs=\"0\" maxOccurs=\"1\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "\t" + NL + "\t" + NL + "\t<!-- Messages -->" + NL + "\t<wsdl:message name=\"transformRequest\">" + NL + "\t\t<wsdl:part name=\"transformRequest\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformResponse\">" + NL + "\t\t<wsdl:part name=\"transformResponse\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformFault\">" + NL + "\t\t<wsdl:part name=\"transformFault\" element=\"tns:xsltFault\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformToMtomAttachmentRequest\">" + NL + "\t\t<wsdl:part name=\"transformToMtomAttachmentRequest\" type=\"xsd:anyType\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformToMtomAttachmentResponse\">" + NL + "\t\t<wsdl:part name=\"transformToMtomAttachmentResponse\" element=\"tns:attachedTransformResponse\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<wsdl:message name=\"transformToMtomAttachmentFault\">" + NL + "\t\t<wsdl:part name=\"transformToMtomAttachmentFault\" element=\"tns:xsltFault\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t" + NL + "\t<!-- Port type -->" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t" + NL + "\t\t<!-- Transform -->" + NL + "\t\t<wsdl:operation name=\"transform\">" + NL + "\t\t\t<wsdl:input message=\"tns:transformRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:transformResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:transformFault\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<!-- Transform to Attachment -->" + NL + "\t\t<wsdl:operation name=\"transformToMtomAttachment\">" + NL + "\t\t\t<wsdl:input message=\"tns:transformToMtomAttachmentRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:transformToMtomAttachmentResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:transformToMtomAttachmentFault\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "\t" + NL + "\t" + NL + "\t<!-- Binding -->" + NL + "\t<wsdl:binding name=\"";
  protected final String TEXT_3 = "Binding\" type=\"tns:";
  protected final String TEXT_4 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t\t\t" + NL + "\t\t<wsdl:operation name=\"transform\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"transformToMtomAttachment\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "\t" + NL + "\t" + NL + "\t<!-- The service -->" + NL + "\t<wsdl:service name=\"";
  protected final String TEXT_5 = "\">" + NL + "\t\t<wsdl:port name=\"";
  protected final String TEXT_6 = "\" binding=\"tns:";
  protected final String TEXT_7 = "Binding\">" + NL + "\t\t\t<soap:address location=\"http://petals.does.not.care/\" />" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";
  protected final String TEXT_8 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( data.getInterfaceName().getLocalPart() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getServiceName().getLocalPart() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( data.getInterfaceName().getLocalPart() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( data.getServiceName().getLocalPart() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( data.getEndpointName() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(data.getServiceName().getLocalPart() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
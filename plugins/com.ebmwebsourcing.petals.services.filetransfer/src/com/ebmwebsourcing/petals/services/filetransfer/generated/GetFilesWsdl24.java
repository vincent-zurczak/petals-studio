package com.ebmwebsourcing.petals.services.filetransfer.generated;

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
public class GetFilesWsdl24 {

  protected static String nl;
  public static synchronized GetFilesWsdl24 create(String lineSeparator)
  {
    nl = lineSeparator;
    GetFilesWsdl24 result = new GetFilesWsdl24();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions name=\"GetFilesWsdl\"" + NL + "        xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\"" + NL + "        xmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\"" + NL + "        xmlns:tns=\"";
  protected final String TEXT_2 = "\"" + NL + "        targetNamespace=\"";
  protected final String TEXT_3 = "\">" + NL + "    " + NL + "  <!-- XML Types -->" + NL + "  <wsdl:types>" + NL + "\t\t<xsd:schema " + NL + "\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\t\t\telementFormDefault=\"qualified\"" + NL + "\t\t\txmlns:tns=\"";
  protected final String TEXT_4 = "\"" + NL + "\t\t\ttargetNamespace=\"";
  protected final String TEXT_5 = "\">" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"getFile\" type=\"tns:getFileType\" />" + NL + "\t\t\t<xsd:complexType name=\"getFileType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filepattern\" type=\"xsd:string\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"ioFault\" type=\"tns:ioFaultType\" />" + NL + "\t\t\t<xsd:complexType name=\"ioFaultType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"message\" type=\"xsd:string\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"getFiles\" type=\"tns:getFilesType\" />" + NL + "\t\t\t<xsd:complexType name=\"getFilesType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filepattern\" type=\"xsd:string\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"getFilesResponse\" type=\"tns:getFilesResponse\" />" + NL + "\t\t\t<xsd:complexType name=\"getFilesResponse\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"filename\" type=\"xsd:string\" maxOccurs=\"unbounded\" minOccurs=\"0\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t\t" + NL + "\t\t\t<xsd:element name=\"getFiles_fault\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element name=\"getFiles_fault\" type=\"xsd:string\" />" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t" + NL + "\t\t\t<!-- describe the file attachments -->" + NL + "\t\t\t<xsd:element name=\"files\" type=\"tns:filesType\" />" + NL + "\t\t\t<xsd:complexType name=\"filesType\">" + NL + "\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t<xsd:element name=\"file\" type=\"xsd:base64Binary\" maxOccurs=\"unbounded\" minOccurs=\"0\" />" + NL + "\t\t\t\t</xsd:sequence>" + NL + "\t\t\t</xsd:complexType>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "\t" + NL + "\t<!-- Messages -->" + NL + "\t<wsdl:message name=\"getFileRequest\">" + NL + "\t\t<wsdl:part name=\"getFileRequest\" element=\"tns:getFile\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getFileResponse\">" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getFilesRequest\">" + NL + "\t\t<wsdl:part name=\"getFilesRequest\" element=\"tns:getFiles\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getFilesResponse\">" + NL + "\t\t<wsdl:part name=\"getFilesResponse\" element=\"tns:getFilesResponse\" />" + NL + "\t\t<wsdl:part name=\"files\" element=\"tns:files\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getFile_faultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\" />" + NL + "\t</wsdl:message>" + NL + "\t<wsdl:message name=\"getFiles_faultMsg\">" + NL + "\t\t<wsdl:part name=\"ioFault\" element=\"tns:ioFault\" />" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<!-- Port Type -->" + NL + "\t<wsdl:portType name=\"GetFiles\">" + NL + "\t\t<wsdl:operation name=\"getFile\">" + NL + "\t\t\t<wsdl:input message=\"tns:getFileRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:getFileResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:getFile_faultMsg\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t\t<wsdl:operation name=\"getFiles\">" + NL + "\t\t\t<wsdl:input message=\"tns:getFilesRequest\" />" + NL + "\t\t\t<wsdl:output message=\"tns:getFilesResponse\" />" + NL + "\t\t\t<wsdl:fault name=\"fault\" message=\"tns:getFiles_faultMsg\" />" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "    " + NL + "    <!-- Binding -->" + NL + "\t<wsdl:binding name=\"GetFilesBinding\" type=\"tns:GetFiles\">" + NL + "\t\t<soap:binding style=\"document\" transport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t\t\t" + NL + "\t\t<wsdl:operation name=\"getFile\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>\t\t" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "\t\t" + NL + "\t\t<wsdl:operation name=\"getFiles\">" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t\t<wsdl:output>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:output>" + NL + "\t\t\t<wsdl:fault name=\"fault\">" + NL + "\t\t\t\t<soap:fault use=\"literal\" name=\"fault\" />" + NL + "\t\t\t</wsdl:fault>" + NL + "\t\t</wsdl:operation>" + NL + "  </wsdl:binding>" + NL + "" + NL + "  <!-- Service -->" + NL + "  <wsdl:service name=\"";
  protected final String TEXT_6 = "\">" + NL + "    <wsdl:port binding=\"tns:GetFilesBinding\" name=\"";
  protected final String TEXT_7 = "\">" + NL + "      <soap:address location=\"http://petals.does.not.care\"/>" + NL + "    </wsdl:port>" + NL + "  </wsdl:service>" + NL + "</wsdl:definitions>";
  protected final String TEXT_8 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(data.getInterfaceName().getNamespaceURI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(data.getInterfaceName().getNamespaceURI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(data.getInterfaceName().getNamespaceURI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(data.getInterfaceName().getNamespaceURI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(data.getServiceName().getLocalPart() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(data.getEndpointName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
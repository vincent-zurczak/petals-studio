package com.ebmwebsourcing.petals.services.mail.generated;

import com.sun.java.xml.ns.jbi.AbstractEndpoint;

/******************************************************************************
 * Copyright (c) 2008-2018, Linagora
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
public class MailService32 {

  protected static String nl;
  public static synchronized MailService32 create(String lineSeparator)
  {
    nl = lineSeparator;
    MailService32 result = new MailService32();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<wsdl:definitions xmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\"" + NL + "\txmlns:tns=\"http://petals.ow2.org/components/mail/version-3\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\"" + NL + "\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" name=\"component\"" + NL + "\ttargetNamespace=\"http://petals.ow2.org/components/mail/version-3\">" + NL + "\t" + NL + "\t<wsdl:types>" + NL + "\t\t<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" + NL + "\t\t\ttargetNamespace=\"http://petals.ow2.org/components/mail/version-3\">" + NL + "\t\t\t<xsd:element name=\"mail\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:element ref=\"tns:body\"></xsd:element>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t\t<xsd:element name=\"body\">" + NL + "\t\t\t\t<xsd:complexType>" + NL + "\t\t\t\t\t<xsd:sequence>" + NL + "\t\t\t\t\t\t<xsd:any></xsd:any>" + NL + "\t\t\t\t\t</xsd:sequence>" + NL + "\t\t\t\t</xsd:complexType>" + NL + "\t\t\t</xsd:element>" + NL + "\t\t</xsd:schema>" + NL + "\t</wsdl:types>" + NL + "\t" + NL + "\t<!-- ======== message ========== -->" + NL + "\t<wsdl:message name=\"SendMailRequest\">" + NL + "\t\t<wsdl:part name=\"mail\" element=\"tns:mail\"></wsdl:part>" + NL + "\t</wsdl:message>" + NL + "\t" + NL + "\t<!-- ======== port TYPES ========== -->" + NL + "\t<wsdl:portType name=\"";
  protected final String TEXT_2 = "\">" + NL + "\t\t<wsdl:operation name=\"SendMail\">" + NL + "\t\t\t<wsdl:input message=\"tns:SendMailRequest\"></wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:portType>" + NL + "\t" + NL + "\t<!-- ======== BINDING ========== -->" + NL + "\t<wsdl:binding name=\"MailServiceSoapBinding\" type=\"tns:";
  protected final String TEXT_3 = "\">" + NL + "\t\t<soap:binding style=\"document\"" + NL + "\t\t\ttransport=\"http://schemas.xmlsoap.org/soap/http\" />" + NL + "\t\t<wsdl:operation name=\"SendMail\">" + NL + "\t\t\t<soap:operation" + NL + "\t\t\t\tsoapAction=\"http://petals.ow2.org/components/mail/generic/version-3/SendMail\" />" + NL + "\t\t\t<wsdl:input>" + NL + "\t\t\t\t<soap:body use=\"literal\" />" + NL + "\t\t\t</wsdl:input>" + NL + "\t\t</wsdl:operation>" + NL + "\t</wsdl:binding>" + NL + "\t" + NL + "\t<!-- ======== SERVICE ========== -->" + NL + "\t<wsdl:service name=\"";
  protected final String TEXT_4 = "\">" + NL + "\t\t<wsdl:port binding=\"tns:MailServiceSoapBinding\" name=\"";
  protected final String TEXT_5 = "\">" + NL + "\t\t\t<soap:address location=\"jbi://myMailSUEndpointName\" />" + NL + "\t\t</wsdl:port>" + NL + "\t</wsdl:service>" + NL + "</wsdl:definitions>";

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     AbstractEndpoint data = (AbstractEndpoint) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( data.getInterfaceName().getLocalPart() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( data.getInterfaceName().getLocalPart() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( data.getServiceName().getLocalPart() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( data.getEndpointName() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
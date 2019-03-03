package com.linagora.petals.services.jsr181.generated;

import java.util.Properties;
import com.linagora.petals.services.jsr181.Jsr181Constants;

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
public class JaxWsImplementation {

  protected static String nl;
  public static synchronized JaxWsImplementation create(String lineSeparator)
  {
    nl = lineSeparator;
    JaxWsImplementation result = new JaxWsImplementation();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.logging.Logger;" + NL + "" + NL + "import javax.jbi.messaging.MessagingException;" + NL + "import javax.jws.Oneway;" + NL + "import javax.jws.WebMethod;" + NL + "import javax.jws.WebParam;" + NL + "import javax.jws.WebResult;" + NL + "import javax.jws.WebService;" + NL + "import javax.xml.namespace.QName;" + NL + "" + NL + "import org.ow2.petals.component.framework.api.Message.MEPConstants;" + NL + "import org.ow2.petals.component.framework.api.exception.PEtALSCDKException;" + NL + "import org.ow2.petals.component.framework.api.message.Exchange;" + NL + "import org.ow2.petals.jsr181.JBIContext;" + NL + "import org.ow2.petals.jsr181.JBIContextManager;" + NL + "import org.w3c.dom.Document;" + NL + "import org.w3c.dom.Element;" + NL + "" + NL + "import com.linagora.easycommons.xml.DocumentBuilders;" + NL + "" + NL + "/**" + NL + " * Here is a sample JAX-WS implementation." + NL + " * <p>" + NL + " * For more information about JAX-WS, please visit " + NL + " * <b>https://jax-ws.dev.java.net/jax-ws-ea3/docs/annotations.html</b>." + NL + " * </p>" + NL + " *" + NL + " * @author ";
  protected final String TEXT_3 = NL + " */" + NL + "@WebService( serviceName=\"";
  protected final String TEXT_4 = "\", targetNamespace=\"";
  protected final String TEXT_5 = "\", portName=\"";
  protected final String TEXT_6 = "\" )" + NL + "public class ";
  protected final String TEXT_7 = " {" + NL + "" + NL + "\t/**" + NL + "\t * Displays \"Hello World!\"." + NL + "\t */" + NL + "\t@WebMethod( operationName=\"helloWorld\" )" + NL + "\t@WebResult( name=\"returnMessage\" )" + NL + "\tpublic String helloWorld() {" + NL + "\t\treturn \"Hello World!\";" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Propagates a message by sending to a service deployed on the Petals Mail component." + NL + "\t * @param message the message to set in the email" + NL + "\t */\t" + NL + "\t@WebMethod( operationName=\"listenToTheWorld\" )" + NL + "\t@Oneway" + NL + "\tpublic void propagateMessage( @WebParam( name=\"message\" ) String message ) {" + NL + "\t\t" + NL + "\t\t// We here illustrate a method that does not return anything." + NL + "\t\t// This method uses a Petals extension to invoke other services in the bus." + NL + "\t\t" + NL + "\t\t// Get the JBI context" + NL + "    \tJBIContext jbiContext = JBIContextManager.getJBIContext();" + NL + "    \t" + NL + "    \t// Create the mail content" + NL + "    \tStringBuilder mailContent = new StringBuilder();" + NL + "    \tmailContent.append( \"Propagating the received message...\\n\" ).append( message );" + NL + "    \t" + NL + "    \t// Create a XML document..." + NL + "    \tfinal String MAIL_NS = \"http://petals.ow2.org/components/mail/version-3\";" + NL + "    \t" + NL + "    \tDocument mailDocument = DocumentBuilders.newDocument();" + NL + "    \tfinal Element mailElement = mailDocument.createElementNS( MAIL_NS, \"mail\" );" + NL + "    \tmailDocument.appendChild( mailElement );" + NL + "" + NL + "    \tfinal Element bodyElement = mailDocument.createElementNS( MAIL_NS, \"body\" );" + NL + "    \tmailElement.appendChild( bodyElement );" + NL + "    \tbodyElement.setTextContent( mailContent.toString());" + NL + "" + NL + "    \t// ... and send it to a mailing service." + NL + "    \ttry {" + NL + "\t\t\tfinal Exchange mailExchange = jbiContext.getMessageSender().createExchange( MEPConstants.IN_ONLY_PATTERN );" + NL + "\t\t\tmailExchange.setInterfaceName( new QName( \"http://petals.ow2.org/components/mail/version-3\", \"Mail\" ));" + NL + "\t\t\tmailExchange.setService( new QName( \"http://petals.ow2.org/components/mail/version-3\", \"ReportMailService\" ));" + NL + "\t\t\tmailExchange.setOperation(new QName(\"http://petals.ow2.org/components/mail/version-3\", \"SendMail\"));" + NL + "\t\t\tmailExchange.setInMessageContent( mailDocument );" + NL + "\t\t\tjbiContext.getMessageSender().send( mailExchange );" + NL + "\t\t\t" + NL + "\t\t} catch( MessagingException e ) {" + NL + "\t\t\tLogger.getLogger( getClass().getName()).severe( \"Failed to send a message to the Petals Mail component. Messaging error.\" );" + NL + "\t\t\t" + NL + "\t\t} catch( PEtALSCDKException e ) {" + NL + "\t\t\tLogger.getLogger( getClass().getName()).severe( \"Failed to send a message to the Petals Mail component. Petals CDK error.\" );" + NL + "\t\t}" + NL + "\t}" + NL + "}";
  protected final String TEXT_8 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Properties prop = (Properties) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( prop.get( Jsr181Constants.PACKAGE_NAME ) );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( System.getProperty( "user.name" ) );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( prop.get( Jsr181Constants.SERVICE_NAME ) );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(
prop.get( Jsr181Constants.TNS ) );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( prop.get( Jsr181Constants.PORT_NAME ) );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( prop.get( Jsr181Constants.CLASS_NAME ) );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
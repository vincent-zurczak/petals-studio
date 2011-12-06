package com.ebmwebsourcing.petals.services.bpel.generated;

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
  * @author Vincent Zurczak - EBM WebSourcing 
  */
public class ProcessArtifacts {

  protected static String nl;
  public static synchronized ProcessArtifacts create(String lineSeparator)
  {
    nl = lineSeparator;
    ProcessArtifacts result = new ProcessArtifacts();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<definitions " + NL + "\t\txmlns=\"http://schemas.xmlsoap.org/wsdl/\" " + NL + "\t\txmlns:plnk=\"http://docs.oasis-open.org/wsbpel/2.0/plnktype\" " + NL + "\t\txmlns:tns=\"http://petals.ow2.org/bpel/";
  protected final String TEXT_2 = "/Artifacts\"" + NL + "\t\txmlns:processDefinition=\"http://petals.ow2.org/bpel/";
  protected final String TEXT_3 = "/\"" + NL + "\t\txmlns:vprop=\"http://docs.oasis-open.org/wsbpel/2.0/varprop\" " + NL + "\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" " + NL + "\t\tname=\"";
  protected final String TEXT_4 = "Artifacts\" " + NL + "\t\ttargetNamespace=\"http://petals.ow2.org/bpel/";
  protected final String TEXT_5 = "/Artifacts\">" + NL + "\t\t" + NL + "    <plnk:partnerLinkType name=\"";
  protected final String TEXT_6 = "PLT\">" + NL + "        <plnk:role name=\"";
  protected final String TEXT_7 = "Role\" portType=\"processDefinition:";
  protected final String TEXT_8 = "PortType\"/>" + NL + "    </plnk:partnerLinkType>" + NL + "  " + NL + "  \t<import location=\"";
  protected final String TEXT_9 = "Definition.wsdl\" " + NL + "  \t\t\tnamespace=\"http://petals.ow2.org/bpel/";
  protected final String TEXT_10 = "/\" />" + NL + "</definitions>";
  protected final String TEXT_11 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
     String processName = (String) argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( processName );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
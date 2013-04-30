package com.ebmwebsourcing.petals.services.generated;

import com.ebmwebsourcing.petals.common.internal.provisional.maven.MavenBean;
import com.ebmwebsourcing.petals.common.internal.provisional.utils.StringUtils;

/****************************************************************************
 * 
 * Copyright (c) 2009-2013, Linagora
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
public class SaPomXml {

  protected static String nl;
  public static synchronized SaPomXml create(String lineSeparator)
  {
    nl = lineSeparator;
    SaPomXml result = new SaPomXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<project " + NL + "\txmlns=\"http://maven.apache.org/POM/4.0.0\" " + NL + "\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">" + NL + "\t" + NL + "\t<modelVersion>4.0.0</modelVersion>" + NL + "\t";
  protected final String TEXT_2 = " <!-- ";
  protected final String TEXT_3 = NL + "\t<parent>" + NL + "\t\t<artifactId>";
  protected final String TEXT_4 = "</artifactId>" + NL + "\t\t<groupId>";
  protected final String TEXT_5 = "</groupId>" + NL + "\t\t<version>";
  protected final String TEXT_6 = "</version>" + NL + "\t</parent>" + NL + "\t";
  protected final String TEXT_7 = " --> ";
  protected final String TEXT_8 = NL + "\t" + NL + "\t<name>";
  protected final String TEXT_9 = "</name>" + NL + "\t<artifactId>";
  protected final String TEXT_10 = "</artifactId>" + NL + "\t<groupId>";
  protected final String TEXT_11 = "</groupId>" + NL + "\t<version>";
  protected final String TEXT_12 = "</version>" + NL + "\t<packaging>jbi-service-assembly</packaging>" + NL + "\t<description>";
  protected final String TEXT_13 = "</description>" + NL + "\t" + NL + "\t<dependencies>" + NL + "\t\t";
  protected final String TEXT_14 = "<dependency>" + NL + "\t\t\t<artifactId>";
  protected final String TEXT_15 = "</artifactId>" + NL + "\t\t\t<groupId>";
  protected final String TEXT_16 = "</groupId>" + NL + "\t\t\t<version>";
  protected final String TEXT_17 = "</version>" + NL + "\t\t\t<type>jbi-service-unit</type>" + NL + "\t\t</dependency>" + NL + "\t\t";
  protected final String TEXT_18 = NL + "\t</dependencies>" + NL + "\t" + NL + "\t<build>" + NL + "\t\t<plugins>" + NL + "\t\t\t<plugin>" + NL + "\t\t\t\t<groupId>org.ow2.petals</groupId>" + NL + "\t\t\t\t<artifactId>maven-petals-plugin</artifactId>" + NL + "\t\t\t\t<version>";
  protected final String TEXT_19 = "</version>" + NL + "\t\t\t\t<extensions>true</extensions>" + NL + "\t\t\t\t<configuration>" + NL + "\t\t\t\t\t<updateJBIXml>true</updateJBIXml>" + NL + "\t\t\t\t</configuration>" + NL + "\t\t\t</plugin>" + NL + "\t\t</plugins>" + NL + "\t</build>" + NL + "\t" + NL + "\t<!--" + NL + "\t<repositories>" + NL + "\t\t<repository>" + NL + "\t\t\t<id>petals-link</id>" + NL + "\t\t\t<url>http://maven.petalslink.com/public/</url>" + NL + "\t\t</repository>" + NL + "\t</repositories>" + NL + "\t-->" + NL + "</project>";
  protected final String TEXT_20 = NL;

	 public String generate( Object argument )
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/******************************************************************************
 * Copyright (c) 2008-2013, Linagora
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     EBM WebSourcing - initial API and implementation
 *******************************************************************************/

     
	MavenBean bean = (MavenBean) argument;

    stringBuffer.append(TEXT_1);
    
	boolean commentParent = StringUtils.isEmpty( bean.getParentArtifactId())
		|| StringUtils.isEmpty( bean.getParentGroupId())
		|| StringUtils.isEmpty( bean.getParentVersion());
		
	if( commentParent ) {
	
    stringBuffer.append(TEXT_2);
     } 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( bean.getParentArtifactId() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( bean.getParentGroupId() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( bean.getParentVersion() );
    stringBuffer.append(TEXT_6);
     if( commentParent ) { 
    stringBuffer.append(TEXT_7);
     } 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( bean.getName() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( bean.getArtifactId() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( bean.getGroupId() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( bean.getVersion() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( bean.getDescription() );
    stringBuffer.append(TEXT_13);
     for( MavenBean suBean : bean.dependencies ) {  
    stringBuffer.append(TEXT_14);
    stringBuffer.append( suBean.getArtifactId() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( suBean.getGroupId() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( suBean.getVersion() );
    stringBuffer.append(TEXT_17);
     } 
    stringBuffer.append(TEXT_18);
    stringBuffer.append( bean.getPetalsMavenPluginVersion() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
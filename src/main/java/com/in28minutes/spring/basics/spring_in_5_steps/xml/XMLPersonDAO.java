package com.in28minutes.spring.basics.spring_in_5_steps.xml;


//Since this is XML, no need for the annotations used in Spring Boot or Spring core
public class XMLPersonDAO {
	
	XMLJdbcConnetion xmlJdbcConnection;

	public XMLJdbcConnetion getXMLJdbcConnection() {
		return xmlJdbcConnection;
	}

	//It is important to keep the correct capitalisation when writing this method's name. Otherwise, it returns an error.
	public void setXmlJdbcConnection(XMLJdbcConnetion jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
	
	
	
}

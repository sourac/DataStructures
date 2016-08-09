package org.cc.testWebService;

import java.io.File;
import java.util.function.DoubleConsumer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXMLFile {
public static void main(String[] args) {
	File file=new File("/home/atul/work/WebSer/src/staff.xml");
	  Document document=parsinXml(file);
	  document.getDocumentElement().normalize();
	  NodeList nodeList=document.getElementsByTagName("staff");
	  for(int temp=0;temp<nodeList.getLength();temp++){
		  Element element=(Element) nodeList.item(temp);
		  String id=getTextValue(element,"id");
		  System.out.println("Id : " + id);
	  }
}

private static String getTextValue(Element element, String string) {
	String textVal=null;
	NodeList nl=element.getElementsByTagName(string);
	if(nl!=null && nl.getLength()>0){
		Element el=(Element) nl.item(0);
		textVal=el.getFirstChild().getNodeValue();
	}
	return textVal;
}

private static Document parsinXml(File file) {
	Document doc=null;
	try {
		DocumentBuilderFactory dbfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder=dbfactory.newDocumentBuilder();
		doc=dbBuilder.parse(file);
	} catch (Exception e) {
     e.printStackTrace();
	}
	return doc;
}
}

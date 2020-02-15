package com.isle.utils.xml;/*package com.xml;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.io.PrintStream;
import java.util.ArrayList;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

*//**
 * 
 * @author wanglf
 * 
 *//*
public class Xml {
	
	*//**
	 * 
	 * @param xml
	 * @param keyList
	 * @return
	 *//*
	public static String[] extractSimpleXMLResult(String xml, String keyList) {
		
	    try {
	      Document document = DocumentHelper.parseText(xml);
	    }
	    catch (DocumentException documentException)
	    {
	      return null;
	    }
	    
	    String[] arrayOfString1 = new String[keyList.length()];
	    int i = 0;
	    xml = document.getRootElement();
	    
	    for (keyList : keyList) {
	      arrayOfString1[(i++)] = xml.element(keyList).getText();
	    }
	    return arrayOfString1;
	  }
	
		public static List extractSimpleXMLResultArray(String xml) {
			try {
				xml = DocumentHelper.parseText(xml);
			} catch (DocumentException localDocumentException) {
				return null;
			}
			ArrayList localArrayList = new ArrayList();
			xml = (xml = xml.getRootElement()).elementIterator();
			while (xml.hasNext()) {
				Element localElement = (Element) xml.next();
				localArrayList.add(localElement.getText());
			}
			return localArrayList;
	}

	public static Map<?,?> extractSimpleXMLResultMap(String xml) {
		
		try {
			Document document = DocumentHelper.parseText(xml);
		} catch (DocumentException documentException) {
			return null;
		}
		
		Map<?,?> localHashMap = new HashMap<Object,Object>();
		
		= document.getRootElement()).elementIterator();
		while (xml.hasNext()) {
			Element localElement = (Element) xml.next();
			localHashMap.put(localElement.getName(), localElement.getText());
		}
		return localHashMap;
	}

	public static List extractMultiXMLResult(String xml,
			String sectionNodeName, String... keyList) {
		try {
			xml = DocumentHelper.parseText(xml);
		} catch (DocumentException localDocumentException) {
			return null;
		}
		ArrayList localArrayList = new ArrayList();
		xml = (xml = xml.getRootElement()).elementIterator();
		while (xml.hasNext()) {
			Element localElement;
			if ((localElement = (Element) xml.next()).getName().equals(
					sectionNodeName)) {
				String[] arrayOfString1 = new String[keyList.length];
				int i = 0;
				for (String str : keyList) {
					arrayOfString1[(i++)] = localElement.element(str).getText();
				}
				localArrayList.add(arrayOfString1);
			}
		}
		return localArrayList;
	}

	public static List extractMultiXMLResultFromAttribute(String xml,
			String sectionNodeName, String... keyList) {
		try {
			xml = DocumentHelper.parseText(xml);
		} catch (DocumentException localDocumentException) {
			return null;
		}
		ArrayList localArrayList = new ArrayList();
		xml = (xml = xml.getRootElement()).elementIterator();
		while (xml.hasNext()) {
			Element localElement;
			if ((localElement = (Element) xml.next()).getName().equals(
					sectionNodeName)) {
				String[] arrayOfString1 = new String[keyList.length];
				int i = 0;
				for (String str : keyList) {
					arrayOfString1[(i++)] = localElement.attribute(str)
							.getText();
				}
				localArrayList.add(arrayOfString1);
			}
		}
		return localArrayList;
	}

	
	public static void main(String [] args) {
		Map<?,?> m = extractSimpleXMLResultMap("<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]></FromUserName><CreateTime>1348831860</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[this is a test]]></Content><MsgId>1234567890123456</MsgId></xml>");
		System.out.println(m.get("MsgType"));
	}
}
*/
package com.isle.utils.xml.dom4j;

import org.dom4j.*;
import org.dom4j.io.*;

import java.io.File;
import java.util.Iterator;

public class MyXMLReader { 
	public static void main(String arge[]) { 
		try { 
			File file = new File("config/userinfo.xml");
			SAXReader reader = new SAXReader(); 
			Document document = reader.read(file); 
			System.out.println(document.getName());
			Element rootelement = document.getRootElement(); 
			System.out.println(rootelement.getName());
			Element item; 
			System.out.println(1);
			
			for (Iterator<?> i = rootelement.elementIterator("user-content"); i.hasNext();) { 
				System.out.println(3);
				item = (Element) i.next(); 
				System.out.println("username:" + item.elementText("user-name")); 
				System.out.println("usersex: " + item.elementText("user-sex"));
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		} 
	}
}
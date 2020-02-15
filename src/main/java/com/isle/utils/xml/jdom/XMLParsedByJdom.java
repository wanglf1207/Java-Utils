package com.isle.utils.xml.jdom;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.util.List;

/**
 * @version 1.1
 * @author  wanglf,  last modify at 2011-03-11 13:58
 */
public class XMLParsedByJdom {
	
	private static String name = "";
	private static String capacity = "";
	private static String directories = "";
	private static String files = "";
	
	/**
	 * @throws JDOMException
	 * @throws IOException
	 */
	public void printDiskInfo() throws JDOMException, IOException {
		
		Document doc = new SAXBuilder().build("config/harddisk.xml");
		Element rootElement = doc.getRootElement();
		List<?> list = rootElement.getChildren("disk");
		
		for (int i = 0; i < list.size(); i++) {
			Element element = (Element) list.get(i);
			name = element.getAttributeValue("name");
			capacity = element.getChildText("capacity");
			directories = element.getChildText("directories");
			files = element.getChildText("files");
			
			System.out.println("�����̷� : " + name + "�������� : " + capacity + "Ŀ¼�� : " + directories + "�ļ��� : " + files);
		}
	}
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		new XMLParsedByJdom().printDiskInfo();
	}
}
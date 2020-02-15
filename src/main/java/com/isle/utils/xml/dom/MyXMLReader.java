package com.isle.utils.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class MyXMLReader {
	public static void main(String arge[]) { 
	    try { 
	    	// File �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
	    	// ͨ���������� file: URI ת��Ϊһ������·����������һ���µ� File ʵ����
	        File file = new File("config/userinfo.xml");
	        // ���幤�� API��ʹӦ�ó����ܹ��� XML �ĵ���ȡ���� DOM �������Ľ�������
	        // ��������д��DocumentBuilderFactory dbf = new DocumentBuilderFactory();
	        // ��Ϊ���췽����protected�ģ� ������ֹʵ�������ܱ������췽����
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        // ���� API�� ʹ��� XML �ĵ���ȡ DOM �ĵ�ʵ����ʹ�ô��࣬Ӧ�ó���Ա���Դ� XML 
	        // ��ȡһ�� Document
	        DocumentBuilder builder = dbf.newDocumentBuilder();
	        // �������ļ������ݽ���Ϊһ�� XML �ĵ������ҷ���һ���µ� DOM Document ����
	        // Document �ӿڱ�ʾ���� HTML �� XML �ĵ����Ӹ����Ͻ��������ĵ����ĸ���
	        // ���ṩ���ĵ����ݵĻ������ʡ�
	        Document doc = builder.parse(file);
	        // NodeList �ӿ��ṩ�Խڵ�����򼯺ϵĳ���û�ж����Լ�����ʵ�ִ˼��ϡ�
	        // DOM �е� NodeList �����ǻ�ġ� 
	        // ���ĵ�˳�򷵻ذ������ĵ����Ҿ��и���������Ƶ����� Element �� NodeList��
	        NodeList nl = doc.getElementsByTagName("user-info"); 
	        for(int i=0;i<nl.getLength();i++) {
	        	// item(int index)���ؼ����еĵ� index ������ index ���ڻ���ڴ��б��еĽڵ�����
	        	// �򷵻� null�� 
	        	System.out.println("user-name:" + doc.getElementsByTagName("user-name").
	        			item(i).getFirstChild().getNodeValue());
	        	System.out.println("user-sex:" + 
	        			doc.getElementsByTagName("user-sex").
	        			item(i).getFirstChild().getNodeValue());
	        }
	    } catch (Exception e) { 
			e.printStackTrace(); 
	    }
	}
}
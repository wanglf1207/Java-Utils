package com.isle.utils.security;

import java.util.Base64;


/**
 * Java8����Base64��ʽ
 * @author wanglf1207
 * @since jdk1.8
 */
public class Base64Test_Java8 {
	
	public static void main(String[] args) throws Exception {
		String text = "�ִ�����";
		String enCodedStr = testEncode(text);
		
		String str = testDecode(enCodedStr);
		
		System.out.println(str);
	}
	
	public static String testEncode(String str) throws Exception {
		 Base64.Encoder encoder = Base64.getEncoder();
		
		 byte[] textByte = str.getBytes("UTF-8");
		//����
		 String encodedText = encoder.encodeToString(textByte);
		System.out.println(encodedText);
		return encodedText;
	}
	
	public static String testDecode(String str) throws Exception {
		
		Base64.Decoder decoder = Base64.getDecoder();
		
		byte [] byteStr = str.getBytes();
		decoder.decode(byteStr);
		return new String(decoder.decode(byteStr),"UTF-8");
	}
}

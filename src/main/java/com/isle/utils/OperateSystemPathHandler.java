package com.isle.utils;

public class OperateSystemPathHandler {
	
	public static String handle(String pathname) {
		String str = null;
		/*
		 * 
		 */
		if("windows".contains(System.getProperty("os.name").toLowerCase())) {
			pathname.replaceAll("\\\\", "\\\\\\\\");

		}
		
		return str;
	}
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		String s = "aBcD";
		  s.toLowerCase().contains("bcD".toLowerCase());
	}
}

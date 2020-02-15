package com.isle.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 加载并去读properties文件
 */
public class ReadPropertiesFileUtils {

    public static void main(String [] args) throws FileNotFoundException {
        InputStream in = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/resources/userinfo.properties");
        Properties p = new Properties();
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p.getProperty("name", "none"));
        System.out.println(p.getProperty("age", "none"));
    }
}

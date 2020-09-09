package com.isle.utils.md5;

import org.junit.Test;

public class MD5UtilsTest {

    @Test
    public void testGetMD5String() {
        String str = "123456";
        String returnStr = MD5Utils.getMD5String(str);
        System.out.printf("%s",returnStr);
    }

    @Test
    public void testGetMD5String3() {
        String str = "hello";
        String returnStr = MD5Utils.getMD5String3(str);
        System.out.printf("%s",returnStr);
    }
}

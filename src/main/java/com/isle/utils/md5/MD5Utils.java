package com.isle.utils.md5;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5工具
 * @author wanglf1207
 */
public class MD5Utils {

    public static String getMD5String(String str) {
        try {
            // 返回一个实现MD5算法的消息摘要对象
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要。
            messageDigest.update(str.getBytes());
            // 通过执行最后的操作（如填充）来完成哈希计算。 此通话完成后，摘要将重置。
            byte [] bytes = messageDigest.digest();

            // signum 1表示正数
            return  new BigInteger(1,bytes).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * MD5值计算<p>
     * MD5的算法在RFC1321 中定义:
     * 在RFC 1321中，给出了Test suite用来检验你的实现是否正确：
     * @param res 源字符串
     * @return md5值
     * MD5是不可逆的
     */
    public  static String MD5Test(String res) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] bytes = res.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] md = messageDigest.digest();
            char str[] = new char[md.length * 2];
            int k = 0;
            for (int i = 0; i < md.length; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            String dd = new String(str);
            return dd;
        } catch (Exception e) {
            return null;
        }
    }

    public static String getMD5String3(String str) {

        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bs = messageDigest.digest(str.getBytes(Charset.forName("UTF-8"))) ;


            for (int i = 0; i < bs.length; i++) {
                int c = bs[i] & 0xFF ;
                if(c < 16){
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(c)) ;
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        System.out.println(MD5Utils.MD5Test("hello"));
    }
}


package com.mzc.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author mazhicheng
 * @date 2020/5/13 - 15:15
 *
 * MD5加密类
 */
public class MD5Utils {

    public static String code(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[]byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for(int offset = 0;offset<byteDigest.length;offset++){
                i = byteDigest[offset];
                if(i<0)
                    i +=256;
                if(i<16)
                    buf.append("0");
                    buf.append(Integer.toHexString(i));
            }

            //32位加密
            return  buf.toString();

            //16位加密
            //return buf.toString().subString(8,24);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args){
        System.out.println(code("111111"));
    }
}

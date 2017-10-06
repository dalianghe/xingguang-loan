package com.xingguang.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by admin on 2017/10/5.
 */
public class MD5Utils {

    //获取加盐后的md5串
    public static String getMd5ofStr(String source,String salt){
        //散列次数
        int hashIterations = 3;
        Md5Hash md5Hash = new Md5Hash(source, salt, hashIterations);
        return md5Hash.toString();
    }

    public static void main(String[] args) {
        System.out.println(getMd5ofStr("111111","admin"));
        //480b989113b4e85872839495ce99ad0a
        //480b989113b4e85872839495ce99ad0a
    }

}

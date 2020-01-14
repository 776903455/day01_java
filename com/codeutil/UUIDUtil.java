package com.codeutil;

import java.util.UUID;

public class UUIDUtil {

    public  static  String getUuid(){
        return (""+UUID.randomUUID()).replace("-","");
    }
}

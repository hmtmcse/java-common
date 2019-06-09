package com.hmtmcse.io;


import java.nio.file.Paths;

public class TmIoUtil {

    public static String concatLocation(String first, String second){
        return Paths.get(first, second).toString();
    }
}

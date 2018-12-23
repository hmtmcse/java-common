package com.hmtmcse.common.util;


import com.hmtmcse.common.TMConfigHolder;
import java.io.File;
import java.util.Map;

public class TMUtil {

    public static void print(Object object){
        if (TMConfigHolder.isDebug){
            System.out.println(object);
        }
    }


    public static String concatLocation(String first, String second){
        if (first.endsWith("/") || first.endsWith("\\")){
            return first + second;
        }else {
            return first + File.separator + second;
        }
    }


    public static MapKeyValue getMapKeyValue(Map<String, Object> map){
        MapKeyValue mapKeyValue = new MapKeyValue();
        if (map != null){
            for ( String key : map.keySet() ) {
                mapKeyValue.key = key;
            }
            if (mapKeyValue.key != null){
                mapKeyValue.value = map.get(mapKeyValue.key);
            }
            return mapKeyValue;
        }
        return null;
    }


}

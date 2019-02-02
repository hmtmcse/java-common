package com.hmtmcse.common.util;


import com.hmtmcse.common.TMConfigHolder;

import java.io.File;
import java.util.List;
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

    public static void printMap(Map<Object, Object> inputMap){
        printMap(inputMap, "-");
    }

    public static void printMap(Map<Object, Object> inputMap, String depth) {
        for (Map.Entry<Object, Object> entry : inputMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map<Object, Object> subMap = (Map<Object, Object>) value;
                printMap(subMap, depth + "-");
            } else if (value instanceof List) {
                printMapList((List<Map>) value, depth + "-");
            } else if (value instanceof Object) {
                TMUtil.print(depth + " " + key + " : " + value);
            } else {
                TMUtil.print("Map Error: " + key + " : " + value);
            }
        }
    }

    public static void printMapList(List<Map> inputList, String depth) {
        for (Map map : inputList) {
            try{
                if (map instanceof List){
                    printMapList((List<Map>) map, depth + "-");
                }else if (map instanceof Map){
                    printMap((Map) map, depth + "-");
                } else {
                    Object key = map.keySet();
                    Object value = map.get(key);
                    TMUtil.print("List Error: " + key + " : " + value);
                }
            }catch (Exception e){
                TMUtil.print("List Error: " + e.getMessage());
            }
        }
    }


}

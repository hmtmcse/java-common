package com.hmtmcse.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TMDateUtil {

    public static String getCurrentDateAsFormated(String pattern){
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(new Date());
    }

}

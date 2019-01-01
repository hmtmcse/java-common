package com.hmtmcse.common;

/**
 * Created by Touhid Mia on 11/09/2014.
 */
public class TMException extends Exception {

    public TMException(){
        super("TM Exception");
    }

    public TMException(String message){
        super(message);
    }
}

package com.hmtmcse.io.exception;

/**
 * Created by Touhid Mia on 11/09/2014.
 */
public class TmIoException extends Exception {

    public TmIoException(){
        super("TM IO Exception");
    }

    public TmIoException(String message){
        super(message);
    }
}

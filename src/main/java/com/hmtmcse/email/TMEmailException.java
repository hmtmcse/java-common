package com.hmtmcse.email;

/**
 * Created by Touhid Mia on 11/09/2014.
 */
public class TMEmailException extends Exception {

    public TMEmailException(){
        super("TM Email Exception");
    }

    public TMEmailException(String message){
        super(message);
    }
}

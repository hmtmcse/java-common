package com.hmtmcse.io.archive;

/**
 * Created by Touhid Mia on 11/09/2014.
 */
public class ArchiveException extends Exception {

    public ArchiveException(){
        super("Archive Exception");
    }

    public ArchiveException(String message){
        super(message);
    }
}

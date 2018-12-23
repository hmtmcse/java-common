package com.hmtmcse.io.model;

import com.hmtmcse.io.exception.TmIoException;

public interface FDModel {

    Boolean copy(String source, String destination) throws TmIoException;

}

package com.hmtmcse.io.implement;

import com.hmtmcse.io.exception.TmIoException;

public interface FileDirOperation {

    Boolean copy(String source, String destination) throws TmIoException;
    Boolean makeDir(String location) throws TmIoException;
    Boolean makeDirP(String location) throws TmIoException;
}

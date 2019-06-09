package com.hmtmcse.io.file;

public interface FileHelperRequestDef<T> {
    public T getInstance();
    public String throwInvalidInstanceMassage();
}

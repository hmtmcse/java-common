package com.hmtmcse.io.file;

public interface FileHelperDef {

    public FileHelperResponseDef copy(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef removeThenCopy(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef copyAllNotLink(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef copyAll(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef copyOverwriteAll(FileHelperRequestDef requestDef) throws FileHelperException;

    public FileHelperResponseDef move(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef removeThenMove(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef moveAllNotLink(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef moveAll(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef moveOverwriteAll(FileHelperRequestDef requestDef) throws FileHelperException;


    public FileHelperResponseDef delete(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef deleteIfExist(FileHelperRequestDef requestDef) throws FileHelperException;


    public FileHelperResponseDef changeAttributes(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef getAttributes(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef changeAllAttributes(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef makeDir(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef makeDirIfNotExist(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef removeAndMakeDir(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef rename(FileHelperRequestDef requestDef) throws FileHelperException;


    public FileHelperResponseDef createSoftLink(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef removeSoftLink(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef createHardLink(FileHelperRequestDef requestDef) throws FileHelperException;
    public FileHelperResponseDef removeHardLink(FileHelperRequestDef requestDef) throws FileHelperException;

    public Boolean isExist(String path) throws FileHelperException;
    public Boolean isExistDirectory(String path) throws FileHelperException;
    public Boolean isEmptyDirectory(String path) throws FileHelperException;
    public Boolean isItSymbolicLink(String path) throws FileHelperException;


    public <T> FileHelperResponseDef listAllFileAndDirectory(T requestDef) throws FileHelperException;

}

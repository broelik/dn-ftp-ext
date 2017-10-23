package org.develnext.jphp.ext.ftp;

import org.develnext.jphp.ext.ftp.classes.*;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class FTPExtension extends Extension
{
    public final static String NS = "php\\net\\ftp";

    @Override
    public Status getStatus()
    {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public String[] getPackageNames()
    {
        return new String[] {};
    }

    @Override
    public void onRegister(CompileScope scope)
    {
        registerClass(scope, BFTPClient.class);
        
        registerWrapperClass(scope, FTPFile.class, FTPFileWrapper.class);
        
        registerJavaException(scope, BFTPException.class, FTPException.class);
        registerJavaException(scope, BFTPDataTransferException.class, FTPDataTransferException.class);
        registerJavaException(scope, BFTPIllegalReplyException.class, FTPIllegalReplyException.class);
        registerJavaException(scope, BFTPListParseException.class, FTPListParseException.class);
        registerJavaException(scope, BFTPAbortedException.class, FTPAbortedException.class);
    }
}
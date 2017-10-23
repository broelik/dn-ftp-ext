package org.develnext.jphp.ext.ftp.classes;

import org.develnext.jphp.ext.ftp.FTPExtension;

import it.sauronsoftware.ftp4j.FTPException;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaException;
import php.runtime.lang.BaseException;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;


@Namespace(FTPExtension.NS)
@Name("FTPException")
public class BFTPException extends JavaException
{
	protected int code;
	protected String message;
	
    public BFTPException(Environment env, Throwable throwable)
    {
        super(env, throwable);
        if(!throwable.getClass().equals(FTPException.class))
        	return;
        FTPException ex = (FTPException)throwable;
        code = ex.getCode();
        message = ex.getMessage();
    }
    public BFTPException(Environment env, ClassEntity clazz)
    {
        super(env, clazz);
    }
    @Signature
    public int getCode(Environment env)
    {
    	return code;
    }
    @Signature
    public String getMessage(Environment env)
    {
    	return message;
    }
}
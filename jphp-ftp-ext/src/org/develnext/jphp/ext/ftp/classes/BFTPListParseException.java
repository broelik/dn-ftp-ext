package org.develnext.jphp.ext.ftp.classes;

import org.develnext.jphp.ext.ftp.FTPExtension;

import php.runtime.env.Environment;
import php.runtime.ext.java.JavaException;
import php.runtime.reflection.ClassEntity;
import php.runtime.annotation.Reflection.*;


@Namespace(FTPExtension.NS)
@Name("FTPIllegalReplyException")
public class BFTPListParseException extends JavaException
{
    public BFTPListParseException(Environment env, Throwable throwable)
    {
        super(env, throwable);
    }
    public BFTPListParseException(Environment env, ClassEntity clazz)
    {
        super(env, clazz);
    }
}
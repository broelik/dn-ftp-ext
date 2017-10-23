package org.develnext.jphp.ext.ftp.classes;

import java.util.Date;

import org.develnext.jphp.ext.ftp.FTPExtension;

import it.sauronsoftware.ftp4j.FTPFile;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.ext.core.classes.time.WrapTime;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.LongMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

@Abstract
@Namespace(FTPExtension.NS)
@Name("FTPFile")
public class FTPFileWrapper extends BaseWrapper<FTPFile>
{
	public FTPFileWrapper(Environment env, FTPFile wrappedObject)
	{
		super(env, wrappedObject);
	}
	public FTPFileWrapper(Environment env, ClassEntity clazz)
	{
		super(env, clazz);
	}
	
	@Signature
	public WrapTime getModifiedDate(Environment env)
	{
		return new WrapTime(env, getWrappedObject().getModifiedDate());
	}
	
	@Signature
	public void setModifiedDate(int timeStamp)
	{
		getWrappedObject().setModifiedDate(new Date(timeStamp));
	}
	
	@Signature
	public Memory getName()
	{
		return StringMemory.valueOf(getWrappedObject().getName());
	}
	
	@Signature
	public void setName(String name)
	{
		getWrappedObject().setName(name);
	}
	
	@Signature
	public Memory getType()
	{
		return LongMemory.valueOf(getWrappedObject().getType());
	}
	
	@Signature
	public void setType(int type)
	{
		getWrappedObject().setType(type);
	}
	
	@Signature
	public Memory getSize()
	{
		return LongMemory.valueOf(getWrappedObject().getSize());
	}
	
	@Signature
	public void setSize(long size)
	{
		getWrappedObject().setSize(size);
	}
	
	@Signature
	public Memory getLink()
	{
		return StringMemory.valueOf(getWrappedObject().getLink());
	}
	
	@Signature
	public void setLink(String link)
	{
		getWrappedObject().setLink(link);
	}
	
	@Signature
	public Memory __toString()
	{
		return StringMemory.valueOf(getWrappedObject().toString());
	}
}
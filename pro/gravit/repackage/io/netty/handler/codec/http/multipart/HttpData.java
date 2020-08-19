package pro.gravit.repackage.io.netty.handler.codec.http.multipart;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import pro.gravit.repackage.io.netty.buffer.ByteBuf;
import pro.gravit.repackage.io.netty.buffer.ByteBufHolder;

public interface HttpData extends InterfaceHttpData, ByteBufHolder {
  long getMaxSize();
  
  void setMaxSize(long paramLong);
  
  void checkSize(long paramLong) throws IOException;
  
  void setContent(ByteBuf paramByteBuf) throws IOException;
  
  void addContent(ByteBuf paramByteBuf, boolean paramBoolean) throws IOException;
  
  void setContent(File paramFile) throws IOException;
  
  void setContent(InputStream paramInputStream) throws IOException;
  
  boolean isCompleted();
  
  long length();
  
  long definedLength();
  
  void delete();
  
  byte[] get() throws IOException;
  
  ByteBuf getByteBuf() throws IOException;
  
  ByteBuf getChunk(int paramInt) throws IOException;
  
  String getString() throws IOException;
  
  String getString(Charset paramCharset) throws IOException;
  
  void setCharset(Charset paramCharset);
  
  Charset getCharset();
  
  boolean renameTo(File paramFile) throws IOException;
  
  boolean isInMemory();
  
  File getFile() throws IOException;
  
  HttpData copy();
  
  HttpData duplicate();
  
  HttpData retainedDuplicate();
  
  HttpData replace(ByteBuf paramByteBuf);
  
  HttpData retain();
  
  HttpData retain(int paramInt);
  
  HttpData touch();
  
  HttpData touch(Object paramObject);
}


/* Location:              C:\Users\Main\AppData\Roaming\StreamCraf\\updates\Launcher.jar!\pro\gravit\repackage\io\netty\handler\codec\http\multipart\HttpData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package org.apache.http.protocol;

import org.apache.http.HttpRequest;

public interface HttpRequestHandlerMapper {
  HttpRequestHandler lookup(HttpRequest paramHttpRequest);
}


/* Location:              C:\Users\Main\AppData\Roaming\StreamCraf\\updates\Launcher.jar!\org\apache\http\protocol\HttpRequestHandlerMapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
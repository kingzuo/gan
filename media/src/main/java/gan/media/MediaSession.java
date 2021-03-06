package gan.media;

import java.io.Closeable;
import java.io.IOException;

public interface MediaSession<T> extends Closeable {
    public String getSessionId();
    public T getSession();
    public void sendMessage(String message) throws IOException;
    public void sendMessage(int b) throws IOException;
    public void sendMessage(byte[] b) throws IOException;
    public void sendMessage(byte[] b,int off,int len)throws IOException;
}

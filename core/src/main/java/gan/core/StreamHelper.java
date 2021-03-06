package gan.core;

import java.io.IOException;
import java.io.InputStream;

public class StreamHelper {

    /**
     * 阻塞读，直到b容器被满退出
     * @param is
     * @param b
     * @throws IOException
     */
    public static int read(InputStream is, byte[] b,boolean run) throws IOException {
        int len = b.length;
        int redLen = 0;
        while (run&&len>0){
            redLen = is.read(b, b.length - len, len);
            if(redLen!=-1){
                len -= redLen;
            }else{
                return -1;
            }
        }
        return b.length-len;
    }

    public static int read(InputStream is, byte[] buf, int length,boolean run) throws IOException{
        if(is != null && buf != null && length > 0){
            int len = length;
            int redLen = 0;
            while (run&&len>0){
                redLen = is.read(buf, length - len, len);
                if(redLen!=-1){
                    len -= redLen;
                }else{
                    return -1;
                }
            }
            return length-len;
        }else{
            return -1;
        }
    }

}

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

/**
 * Created by xiaozhendong on 16-5-2.
 */
public class FileTest  {
    public FileTest() throws  Exception{
        long timestart = System.currentTimeMillis();
       BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("/home/xiaozhendong/1.pdf"));
        RandomAccessFile randomAccessFile=new RandomAccessFile("/home/xiaozhendong/1.pdf","r");
        inputStream.read();
        inputStream.close();
        randomAccessFile.close();
        long timeend=System.currentTimeMillis();
        long time=timeend-timestart;
        System.out.println(time);
    }

    public static void main(String[] args) throws Exception{
        new FileTest();
    }
}

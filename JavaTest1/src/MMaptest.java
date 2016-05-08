import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 * Created by xiaozhendong on 16-5-2.
 */
public class MMaptest {
    public static void main(String[] args) throws Exception{
        Path path=Paths.get("employee.dat");
        FileChannel fileChannel=FileChannel.open(path);
        ByteBuffer buffer=fileChannel.map(FileChannel.MapMode.PRIVATE,0,fileChannel.size());
    }
}

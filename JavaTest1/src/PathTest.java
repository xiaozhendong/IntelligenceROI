import javax.sound.midi.SoundbankResource;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by xiaozhendong on 16-5-1.
 */
public class PathTest {


    public static void main(String[] args)throws Exception {
        Path dir=Paths.get("/home/xiaozhendong/Projects/Idea");
        System.out.println(Files.isDirectory(dir));
        SimpleFileVisitor<Path> x =new SimpleFileVisitor<Path>(){

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println(dir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
               if (attrs.isDirectory()){
                   System.out.println(file);
                   //Files.isDirectory(file);
                  // System.out.println(attrs.isDirectory());
               }
                return  FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        };
        System.out.println(Files.walkFileTree(dir,x));



    }
}

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String numefile="D:\\1\\primu\\untitled\\src\\text.txt";
        File f=new File(numefile);
        Poligon p=new Poligon(f);
        System.out.println(p.Perimetru());
    }
}
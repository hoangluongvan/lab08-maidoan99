package Bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * FileNotFounfException là lớp con của IOException
 */
public class FileNotFound {
    public static void testFileNotFoundException() throws FileNotFoundException{
        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("test.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        testFileNotFoundException();
    }
}

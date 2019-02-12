import java.io.*;
import java.util.Scanner;

/** 
 * FileName: HelloWorld.java
 * This file header describes what does the file do.
 * This HelloWorld serves as the playground of some simple Java code.
 * 
 * @Author Mao Li
 * @Date Aug 8th, 2018
 */
public class HelloWorld {

    public static void main (String[] args) {
        //System.out.println("Hello World!");
        //System.out.println("I'd like to say");
        //testPrintC(20.22);
        try {
            fileIO("board");
        } catch (Exception e) {
            System.out.println("DO NOTHING");
        }
    }

    /**
     * This method header describes what does the method do,
     * along with its parameter and return values.
     * 
     * This prints out many times of message.
     * 
     * @param: number of times to print the mesage
     * @return: null
     * */ 
    public static void loopPrint (int times, String message) {
        
        // In line comment describes the code
        for (int i = 0; i < times; i++)
            System.out.println(message);
    }

    public static void testPrintC (double average) {
        System.out.printf("Wha is average? %f \n", average);
    }

    public static void fileIO (String filename) throws IOException {
        File f = new File(filename);
        Scanner s = new Scanner(f);

        while (s.hasNext()) {
            String k;
            System.out.println(k = s.nextLine());
            for (int i = 0; i < k.length(); i++) {
                System.out.print(k.charAt(i));
            }
        }
        s.close();
    }

}

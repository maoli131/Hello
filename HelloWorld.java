/** A sample Java program HelloWorld
 * @Author Mao Li
 * @Date Aug 8th, 2018
 */
public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello World!");
        System.out.println("I'd like to say");
        testPrintC(20.22);
    }

    // This prints out many times of I Love You
    public static void loopPrint (int times, String message) {
        for (int i = 0; i < times; i++)
            System.out.println(message);
    }

    // This tests C style print statement
    public static void testPrintC (double average) {
        System.out.printf("Wha is average? %f \n", average);
    }

}

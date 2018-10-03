/** A sample Java program HelloWorld
 * @Author Mao Li
 * @Date Aug 8th, 2018
 */
public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello World!");
        System.out.println("I'd like to say");
<<<<<<< HEAD
        loopPrint();
        System.out.println("Hello");
=======
        testPrintC(20.22);
>>>>>>> 4ea49ae3077c6de8f0680a13ec52c976328989ac
    }

    // This prints out many times of I Love You
    public static void loopPrint (int times, String message) {
        for (int i = 0; i < times; i++)
            System.out.println(message);
    }

<<<<<<< HEAD
=======
    // This tests C style print statement
    public static void testPrintC (double average) {
        System.out.printf("Wha is average? %f \n", average);
    }

>>>>>>> 4ea49ae3077c6de8f0680a13ec52c976328989ac
}

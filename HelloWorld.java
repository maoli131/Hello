/** A sample Java program HelloWorld
 * @Author Mao Li
 * @Date Aug 8th, 2018
 */
public class HelloWorld {

    public static void main (String[] args) {
        System.out.println("Hello World!");
        System.out.println("A new line added");
        loopPrint();
    }

    // This prints out many times of I Love You
    public static void loopPrint () {
        for (int i = 0; i < 10; i++)
            System.out.println("I love you");
    }
}

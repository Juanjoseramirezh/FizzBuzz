import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz num = new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        int fizz = Integer.valueOf(scan);

        System.out.println(num.fizzBuzz(fizz));

        sc.close();
    }
}
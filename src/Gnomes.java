import java.util.Scanner;

public class Gnomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        System.out.println(num % 7);

        sc.close();
    }
}

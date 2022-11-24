import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        double ans = 1;
        if (n >= 0) {
            while (n != 0) {
                ans *= x;
                n--;
            }
            System.out.print((int)ans);
        } else {
            while (n != 0) {
                ans *= x;
                n++;
            }
            ans = 1/ans;
            System.out.print(ans);
        }

    }
}

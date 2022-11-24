import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int n = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        int r = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("x " + (i+1) + " точки ");
            double x = scanner.nextDouble();
            System.out.print("y " + (i+1) + " точки ");
            double y = scanner.nextDouble();

            if (x*x + y*y <= r*r) {
                ans++;
            }
        }
        System.out.print(ans + " точек попали в окружность");
    }
}

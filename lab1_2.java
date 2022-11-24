import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("День: ");
        int day = scanner.nextInt();
        System.out.print("Месяц: ");
        int month = scanner.nextInt();

        boolean flag = false;

        if (1<= day && day<=31) {
            flag = true;
        }

        if (((month == 1 && day <= 31) || (month == 2 && day <= 29) || (month == 12 && day <= 31)) && flag) {
            System.out.print("Зима");
        } else if (((month == 3 && day <= 31) || (month == 4 && day <= 30) || (month == 5 && day <= 31)) && flag) {
            System.out.print("Весна");
        } else if (((month == 6 && day <= 30) || (month == 7 && day <= 31) || (month == 8 && day <= 31)) && flag) {
            System.out.print("Лето");
        } else if (((month == 9 && day <= 30) || (month == 10 && day <= 31) || (month == 11 && day <= 30)) && flag) {
            System.out.print("Осень");
        } else  {
            System.out.print("ERROR!");
        }



    }
}

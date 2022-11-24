import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        int [] months =  {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year, month, day;

        Scanner scanner = new Scanner(System.in);
        System.out.print("День рождения: ");
        day = scanner.nextInt();
        System.out.print("Месяц рождения: ");
        month = scanner.nextInt();
        System.out.print("Год рождения: ");
        year = scanner.nextInt();




        int pr_day = day;
        int pr_month = month;

        int current_year, current_month, current_day;
        int ans_year =0, ans_month=0;

        current_year = 2022;
        current_month = 11;
        current_day = 17;
        int count = 0;


        while (current_day != day || current_month != month || current_year != year ) {

            day++;
            count++;
            if (day > months[month]) {
                day = 1;
                month++;
                if (month > 12) {
                    year++;
                    month = 1;
                }
            }

            if (day == pr_day && month == pr_month) {
                ans_year++;
                ans_month = 0;
                count = 0;
            } else if (day == pr_day) {
                ans_month++;
                count = 0;
                if (ans_month > 12) {
                    ans_year++;
                    ans_month = 0;
                }
            }

        }
        System.out.println(ans_year + " лет, " + ans_month + " месяцев и " + count + " дней");
    }
}

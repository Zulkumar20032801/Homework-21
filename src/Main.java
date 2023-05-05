import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        WeekDay weekDay=WeekDay.valueOf(scan.nextLine().toUpperCase());

        switch (weekDay){
            case MONDAY -> WeekDay.MONDAY.method();
            case TUESDAY -> WeekDay.TUESDAY.method();
            case WEDNESDAY -> WeekDay.WEDNESDAY.method();
            case THURSDAY-> WeekDay.THURSDAY.method();
            case FRIDAY -> WeekDay.FRIDAY.method();
            case SATURDAY -> WeekDay.SATURDAY.method();
            case SUNDAY-> WeekDay.SUNDAY.method();

        }

    }
}
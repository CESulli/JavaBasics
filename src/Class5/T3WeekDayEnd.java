package Class5;

public class T3WeekDayEnd {
    public static void main(String[] args) {

        int day = 5;

        if (day >= 1 && day <= 5) {
            System.out.println("It is a Weekday!");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the Weekend!!");
        } else {
            System.out.println("Invalid Day!");
        }
    }
}

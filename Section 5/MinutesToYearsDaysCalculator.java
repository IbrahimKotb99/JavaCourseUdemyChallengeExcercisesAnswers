public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays (long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");

        }else{
            long nodays = minutes / 1440;
            long noyears = nodays / 365;
            long remaindays = nodays % 365;
            System.out.println  (minutes + " min = " + noyears +" y and " + remaindays + " d") ;
        }
    }
}

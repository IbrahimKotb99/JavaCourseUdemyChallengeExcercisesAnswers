public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }
    public static int getEvenDigitSum (int number){
        int z=0;
        int y=0;
        if (number<0){
            return -1;
        }
        while (number > 0 ){
            y=number%10;
            if (y%2==0){
                z+=y;
            } number=number/10;
        }return z;
    }
}

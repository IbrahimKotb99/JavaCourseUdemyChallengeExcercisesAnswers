public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));


    }
    public static boolean isPalindrome (int number){
        if (number<0){
            number=number*-1;
        }
        int reverse=0;
        int originalno=number;

        while (number>0){
            int lastDigit=number%10;
            reverse=reverse*10;
            reverse+=lastDigit;
            number=number/10;
        } return originalno==reverse;
    }
}

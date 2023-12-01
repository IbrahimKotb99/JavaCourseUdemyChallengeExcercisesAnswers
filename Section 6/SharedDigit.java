public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        
    }
    public static boolean hasSharedDigit (int p1, int p2){
        if (p1<10 || p1 >99 || p2<10 || p2>99){
            return false;
        }
        int x=p1%10;
        int y=p1/10;
        int z=p2%10;
        int v=p2/10;
        if (x==z || x==v || y==z || y==v ){
            return true;
        } return false;

    }
}

public class TeenNumberChecker {
    
    public static boolean hasTeen(int p1, int p2, int p3){
        if((p1>=13 && p1<=19) || (p2>=13 && p2<=19) || (p3>=13 && p3<=19) ){
            return true;
        }else{
            return false;
            
        }
    } public static boolean isTeen(int P1){
        if(P1>=13 && P1<=19){
            return true;
        }else{
            return false;
        }
    }
}
public class test {

        public static void main(String[] args) {
            System.out.println(shouldWakeUp (true, 1));
            System.out.println(shouldWakeUp (false, 5));
            System.out.println(shouldWakeUp (true, -3));



        }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23 || !barking){
            return false;
        }else if (barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true ;
        } else{
            return false;

        }
    }


    }







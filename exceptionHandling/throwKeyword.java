package exceptionHandling;

public class throwKeyword {
    static void inTryCatch()throws Exception{
        int luckyNum = 7;
        try{
            if(luckyNum!=8){
                throw new Exception("Better luck next time");
            }
        }catch(Exception e){
            System.out.println("Exception caught");
            System.out.println(e);
        }
    }
    public static void main(String args[])throws Exception{
        inTryCatch();
        int luckyNumber = 7;
        if(luckyNumber!=8){
            throw new Exception("Not a lucky number");
        }else{
            System.out.println("It's a lucky number");
        }

    }
}


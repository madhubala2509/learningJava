package exceptionHandling;
class invalidUserExceptions extends Exception{
    public invalidUserExceptions(String s){
        super(s);
    }
}
public class userDefinedExceptions {
    static void check()throws invalidUserExceptions{
        String name = "madhubala";

        if(!name.equals("madhu")){
            throw new invalidUserExceptions("Invalid user name");
        }
        else{
            System.out.println("check in");
        }
    }
    public static void main(String args[]){
        try{
            check();
        }catch (invalidUserExceptions e){
            System.out.println("Caught an exception"+e);
        }
    }
}


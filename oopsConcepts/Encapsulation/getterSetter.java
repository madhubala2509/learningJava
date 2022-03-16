package oopsConcepts.Encapsulation;
/*
having private variables and public methods ensures encapsulation
read-only class or write-only class
 */
class Details{
    private int id;
    private String code;
    public int getId() {
        return id;
    }
    public String getCode(){
        return code;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCode(String code){
        this.code = code;
    }
}
public class getterSetter {
    public static void main(String args[]){
        Details d1 = new Details();
        d1.setId(1); d1.setCode("abcd");

        System.out.println(d1.getId());
        System.out.println(d1.getCode());
    }
}

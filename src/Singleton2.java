
//Lazy Instantiation
public class Singleton2 {

    public static void main(String[] args) {

        A obj1=A.getObject();
        A obj2=A.getObject();
    }
}
class A{
    private static A obj;
    private A(){

        System.out.println("Instance Created");
    }
    static A getObject(){

        if(obj == null){

            obj=new A();
        }
        return obj;
    }
}

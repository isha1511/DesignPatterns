
//Eagerly Instance Creation
public class Singleton {

    public static void main(String[] args) {

        Abc1 obj = Abc1.getObject();
    }
}

class Abc1{

    static Abc1 obj=new Abc1();

    private Abc1(){


    }
    static Abc1 getObject(){

        return obj;
    }
}

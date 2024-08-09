
//Double check locking
public class Singleton4 {

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                C obj1=C.getObject();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                C obj1=C.getObject();
            }
        });

        t1.start();
        t2.start();
    }
}
class C{
    private static C obj;
    private C(){

        System.out.println("Instance created..");
    }
    static C getObject(){

        if(obj == null){

            synchronized (C.class){

                if(obj==null){

                    obj=new C();
                }
            }
        }
        return obj;
    }
}


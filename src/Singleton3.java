
//synchronized instance... take double time more resources involve
public class Singleton3 {

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                B obj1=B.getObject();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                B obj1=B.getObject();
            }
        });

        t1.start();
        t2.start();
    }
}
class B{
    private static B obj;
    private B(){

        System.out.println("Instance created..");
    }
    static synchronized B getObject(){

        if(obj == null){

            obj=new B();
        }
        return obj;
    }
}

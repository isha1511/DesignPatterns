 class Singleton5 {

    public static void main(String[] args) {

        ABC obj1=ABC.INSTANCE;

        obj1.i=5;
        obj1.show();

        ABC obj2=ABC.INSTANCE;
        obj2.i=6;
        obj1.show();
    }
}
enum ABC{
    INSTANCE;

    int i;

    public void show(){

        System.out.println(i);
    }
}
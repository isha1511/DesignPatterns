public class YouTube {

    public static void main(String[] args) {

        Channel javaTutorial=new Channel();

        Subscriber sub1=new Subscriber("Isha");
        Subscriber sub2=new Subscriber("Payal");
        Subscriber sub3=new Subscriber("Ruchita");
        Subscriber sub4=new Subscriber("Shital");
        Subscriber sub5=new Subscriber("Tanvi");

        javaTutorial.subscribe(sub1);
        javaTutorial.subscribe(sub2);
        javaTutorial.subscribe(sub3);
        javaTutorial.subscribe(sub4);
        javaTutorial.subscribe(sub5);

        sub1.SubscribeChannel(javaTutorial);
        sub2.SubscribeChannel(javaTutorial);
        sub3.SubscribeChannel(javaTutorial);
        sub4.SubscribeChannel(javaTutorial);
        sub5.SubscribeChannel(javaTutorial);

        javaTutorial.upload("Observer Design Pattern");
    }
}

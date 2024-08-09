import java.util.*;

public class Channel {

    private List<Subscriber> subscriberList=new ArrayList<>();
    private String title;

    public void subscribe(Subscriber sub){

        subscriberList.add(sub);
    }

    public void unsubscribe(Subscriber sub){

        subscriberList.remove(sub);
    }

    public void notifySubscriber(){

        for(Subscriber sub:subscriberList){

            sub.update();
        }

    }

    public void upload(String title){

        this.title=title;
        notifySubscriber();
    }

}

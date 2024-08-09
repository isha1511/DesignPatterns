import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionInit implements ChannelCollection {

    private List<Channel> channelsList = new ArrayList<>();
    ;

    public void addChannel(Channel c) {
        channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorInit(type, channelsList);
    }
}



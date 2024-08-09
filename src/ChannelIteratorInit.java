import java.util.List;

public class ChannelIteratorInit implements ChannelIterator {

        private ChannelType type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorInit(ChannelType ty,
                                   List<Channel> channelsList) {
            this.type = ty;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelType.All)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }


}

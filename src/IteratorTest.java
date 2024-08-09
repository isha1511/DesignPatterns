public class IteratorTest {
        public static void main(String[] args) {
            ChannelCollection channels = populateChannels();
            ChannelIterator baseIterator = channels.iterator(ChannelType.All);
            while (baseIterator.hasNext()) {
                Channel c = baseIterator.next();
                System.out.println(c.toString());
            }
            System.out.println("******");
            // Channel Type Iterator
            ChannelIterator englishIterator = channels.iterator(ChannelType.English);
            while (englishIterator.hasNext()) {
                Channel c = englishIterator.next();
                System.out.println(c.toString());
            }
        }

        private static ChannelCollection populateChannels() {
            ChannelCollection channels = new ChannelCollectionInit();
            channels.addChannel(new Channel(98.5, ChannelType.English));
            channels.addChannel(new Channel(99.5, ChannelType.Hindi));
            channels.addChannel(new Channel(100.5, ChannelType.Marathi));
            channels.addChannel(new Channel(101.5, ChannelType.English));
            channels.addChannel(new Channel(102.5, ChannelType.Hindi));
            channels.addChannel(new Channel(103.5, ChannelType.Marathi));
            channels.addChannel(new Channel(104.5, ChannelType.English));
            channels.addChannel(new Channel(105.5, ChannelType.Hindi));
            channels.addChannel(new Channel(106.5, ChannelType.Marathi));
            return channels;
        }
}

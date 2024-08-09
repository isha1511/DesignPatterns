public class CompositeTest {

    public static void main(String[] args) {

        Component hd=new Leaf(4000, "Hardisk");
        Component mouse=new Leaf(1000, "Mouse");
        Component cpu=new Leaf(3000, "CPU");
        Component ram=new Leaf(8000, "Ram");
        Component monitor=new Leaf(20000, "Monitor");

        Composite ph=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite mb=new Composite("MotherBoard");
        Composite computer=new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        ph.showPrice();
        mb.showPrice();
        cabinet.showPrice();
        computer.showPrice();

    }
}

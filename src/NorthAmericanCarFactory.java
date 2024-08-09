public class NorthAmericanCarFactory implements CarFactory{

        @Override
        public Car createCar() {
            return new Sedan();
        }

        public CarSpecification createSpecification() {
            return new NorthAmericaSpecification();
        }
}

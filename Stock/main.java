public class main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Careera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}

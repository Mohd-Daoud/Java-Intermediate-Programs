public class Driver{
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        v1.start();
        v1.stop();
        // Down Casting
        Car c1 = (Car)v1;
        c1.openGate();
    }
}

package Company;

public class CLightMotor extends CVehicle {
    int speedLimit;

    public CLightMotor(String name, int wheels, int speedLimit) {
        super(name, wheels);
        this.speedLimit = speedLimit;
    }

    public void display() {
        super.display();
        System.out.println("Speed Limit: " + speedLimit);
    }

}

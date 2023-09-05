package Company;

public class CVehicle {
    String name;
    int noOfWheels;

    public CVehicle(String name, int wheels) {
        this.name = name;
        this.noOfWheels = wheels;
    }

    public void display() {
        System.out.println("name of the vehicle : " + name);
        System.out.println("number of wheels in the vehicle: " + noOfWheels);
    }

}

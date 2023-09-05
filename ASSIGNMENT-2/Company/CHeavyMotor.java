package Company;

public class CHeavyMotor extends CVehicle {
    int load;
    String permit;

    public CHeavyMotor(String name, int wheels, int load, String permit) {
        super(name, wheels);
        this.load = load;
        this.permit = permit;
    }

    public void display() {
        super.display();
        System.out.println("Load: " + load);
        System.out.println("Permit:" + permit);
    }

}

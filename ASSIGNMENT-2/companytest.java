import Company.*;

public class companytest {
    public static void main(String[] args) {
        System.out.println("Vehicle class");
        CVehicle vehicle = new CVehicle("mahindra", 4);
        vehicle.display();
        System.out.println();
        System.out.println("CHeavy Motor class");
        CHeavyMotor heavy = new CHeavyMotor("Ashok Leyland", 6, 9, "STATE");
        heavy.display();
        System.out.println();
        System.out.println("CLight Motor class");
        CLightMotor light = new CLightMotor("Benz", 4, 120);
        light.display();
    }

}

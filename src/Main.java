import java.util.Scanner;

import static java.util.function.Predicate.not;

public class Main {
    public static void main(String[] args) {

        VehicleInfo vehicle = new VehicleInfo("GD 123AB", CarType.CAR, 02/ 2 /2022, 12:22:02);
//TODO: uzupełnić parametry jak juz bede wiedziec jaki format mają dla czasu.






        Scanner scan = new Scanner(System.in);

        System.out.println("Highway entrance: what is a registration number?");
        String vehicleRegNumber = scan.nextLine();
        System.out.println("Highway entrance: what is a type of a vehicles? ");
        System.out.println("Enter T for Truck, C for Car, M for Motorcycle. ");
        String carType = scan.nextLine();
        System.out.println("Highway exit: what is the registration number of a leaving vehicle?");
        String vehicleRegNumber = scan.nextLine();
        System.out.println("Highway information: check whether a vehicle is on highway or not. ");
        if not ("Vehicle already left highway.");
        else ("Vehicle is on highway.");








    }
}
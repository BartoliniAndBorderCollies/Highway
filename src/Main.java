import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Highway a1Highway = new Highway();

        String responseRegNumber;
        CarType responseCarType;
        Scanner scan = new Scanner(System.in);

        a1Highway.showMenu();

        do {
            int response;
            boolean integer;
            int carType;
            do {
                try {

                    response = scan.nextInt();
                    integer = false;

                } catch (InputMismatchException e) {
                    integer = true;

                    System.out.println("Number must be an integer.");
                }
            }while(integer);


            if (response == 1) {
                System.out.println("Enter registration number: ");
                responseRegNumber = scan.nextLine();
                System.out.println("Enter vehicle type:");
                System.out.println("type: ");
                System.out.println("1 for car, 2 for truck, 3 for motorcycle.");
                carType = scan.nextInt();
                if (carType == 1) {
                    responseCarType = CarType.CAR;
                } else if (carType == 2) {
                    responseCarType = CarType.TRUCK;
                } else {
                    responseCarType = CarType.MOTORCYCLE;
                }
                a1Highway.vehicleEntry(responseRegNumber, responseCarType);
                a1Highway.showMenu();
            }

            if (response == 2) {
                System.out.println("Enter registration number of the vehicle which is leaving the highway: ");
                String responseLeave = scan.next();

                a1Highway.vehicleLeave(responseLeave);
                a1Highway.showMenu();
            }
            if (response == 3) {
                System.out.println("Enter the vehicle registration number: ");
                String registrationInput = scan.nextLine();
                a1Highway.searchVehicle(registrationInput);
                a1Highway.showMenu();
            }
            if (response == 4) {
                System.exit(4);

            } else {
                System.out.println("Number must be an integer from 1 to 4.");
                System.out.println(" ");
                a1Highway.showMenu();
            }

        }while(true);
    }
}


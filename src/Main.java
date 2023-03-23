
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Highway a1Highway = new Highway();

        String responseRegNumber;
        CarType responseCarType;
        Scanner scan = new Scanner(System.in);

        do {

            a1Highway.showMenu();

            int response = 0;
            boolean isInteger;
            int carType;
            do {

                    isInteger = scan.hasNextInt();

                    if(isInteger) {
                        response = scan.nextInt();

                    } else {
                        System.out.println("Number must be an integer.");
                    }
                    scan.nextLine();


            }while(!isInteger);


            if (response == 1) {
                System.out.println("Enter registration number: ");
                responseRegNumber = scan.nextLine();
                a1Highway.checkIfExist(responseRegNumber);
                System.out.println("""
                        Enter vehicle type:
                        type:
                        1 for car, 2 for truck, 3 for motorcycle
                        """);
                carType = scan.nextInt();
                scan.nextLine();

                if (carType == 1) {
                    responseCarType = CarType.CAR;
                } else if (carType == 2) {
                    responseCarType = CarType.TRUCK;
                } else {
                    responseCarType = CarType.MOTORCYCLE;
                }
                a1Highway.vehicleEntry(responseRegNumber, responseCarType);

            }

            else if (response == 2) {
                System.out.println("Enter registration number of the vehicle which is leaving the highway: ");
                String responseLeave = scan.nextLine();

                a1Highway.vehicleLeave(responseLeave);

            }
            else if (response == 3) {
                System.out.println("Enter the vehicle registration number: ");
                String registrationInput = scan.nextLine();
                a1Highway.searchVehicle(registrationInput);

            }
            else if (response == 4) {
                System.out.println("Closing application.");
                break;

            } else {
                System.out.println("Number must be an integer from 1 to 4.");
                System.out.println(" ");

            }

        }while(true);
    }
}


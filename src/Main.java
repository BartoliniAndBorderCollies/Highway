import java.nio.channels.GatheringByteChannel;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.util.function.Predicate.not;


public class Main {
    public static void main(String[] args) {

        Highway a1Highway = new Highway();
        boolean goBackToMenu = true;

        do {
        System.out.println("Welcome to Highway application. What do you want to do?");
        System.out.println("Type input and press enter for the following options: ");
        System.out.println("1. Add vehicle to the database.");
        System.out.println("2. Remove vehicle from the database.");
        System.out.println("3. Search vehicle.");
        System.out.println("4. Exit application.");
        int response;
        String responseRegNumber;
        CarType responseCarType;

        int carType;
        Scanner scan = new Scanner(System.in);
        response = scan.nextInt();

            if (response == 1) {
                System.out.println("Enter registration number: ");
                responseRegNumber = scan.next();
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
            }
            while (goBackToMenu); //TODO: nie wiem jak zrobić, żeby wrócił znowu do samego początku



            if (response == 2) {
                String responseLeave;
                System.out.println("Enter registration number of the vehicle which is leaving the highway: ");
                responseLeave = scan.next();
                a1Highway.vehicleLeave(responseLeave);
            }
            if (response == 3) {
                boolean repeatLoop;
                String registrationInput;
                System.out.println("Enter the vehicle registration number: ");
                do {
                    registrationInput = scan.next();

                    repeatLoop = (registrationInput.matches("[aA-zZ]*"));
                    if (repeatLoop) {
                        System.out.println("Registration number must contain letters and numbers");
                    }
                } while (repeatLoop);

                a1Highway.searchVehicle(registrationInput);
            }
            if (response == 4) {
                System.exit(4);

            }


        }while(goBackToMenu);


    }
}


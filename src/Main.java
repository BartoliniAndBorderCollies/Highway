import java.nio.channels.GatheringByteChannel;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.util.function.Predicate.not;


public class Main {
    public static void main(String[] args) {

        Highway a1Highway = new Highway();


        a1Highway.vehicleEntry("GD123AB", CarType.CAR);
        a1Highway.vehicleLeave("GD123AB");



        Scanner scan = new Scanner(System.in);
        boolean repeatLoop;

        System.out.println("Enter the vehicle registration number: ");
        do {
            String registrationInput = scan.nextLine();
            repeatLoop = !registrationInput.matches("[0-9]") || !registrationInput.matches("[a-zA-Z]");
            if(repeatLoop) {
                System.out.println("Registration number must contain letters and numbers");
            }
            a1Highway.searchVehicle(registrationInput);



        } while(repeatLoop);



    }
}
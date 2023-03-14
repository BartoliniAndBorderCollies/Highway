import java.util.Collection;

public class Highway {

    private Collection<VehicleInfo> vehicles; //TODO: collection czy list lepiej?

    public void vehicleEntry(String vehicleRegNumber, CarType type) {

        Collection<VehicleInfo> newVehicle = new Collection<VehicleInfo>; //TODO: nie wiem "metodę VehicleEntry, która dodaje do kolekci nową instancję VehicleInfo oraz wypisuje do konsoli komunikat.

        vehicles.getCarType();
        System.out.println("Welcome to our Highway vehicle" + vehicleRegNumber + ". Drive fast and safely LOL.");

    }

    public String searchVehicle(String vehicleRegNumber) {
        return vehicles.getVehicleRegNumber();
        System.out.println("Vehicle nr: " + vehicleRegNumber);
        System.out.println("Vehicle type: " + type); //TODO: pewnie dlatego, bo metoda zwraca String a type nie jest stringiem
        System.out.println("Time of entrance to the highway: " + time); //TODO: pewnie dlatego, że time nie jest stringiem

    }

    public String vehicleLeave(String vehicleRegNumber) {
        vehicles.countFee();
        System.out.println(countFee + " $ to be paid.");
        System.out.println("Thank you for your trip. Come back again.");
        return vehicles.deleteByRegNumber();
    }

    public Double countFee() {

    }

    public void deleteByRegNumber(){


    }






}

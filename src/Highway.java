import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Highway {

    public List<VehicleInfo> vehicles = new ArrayList<>();

    public void showMenu() {
        System.out.println("Welcome to Highway application. What do you want to do?");
        System.out.println("Type input and press enter for the following options: ");
        System.out.println("1. Add vehicle to the database.");
        System.out.println("2. Remove vehicle from the database.");
        System.out.println("3. Search vehicle.");
        System.out.println("4. Exit application.");

    }


    public void vehicleEntry(String vehicleRegNumber, CarType carType) {
        vehicles.add(new VehicleInfo(vehicleRegNumber, carType));
        System.out.println(
                "New vehicle added. Registration number: " + vehicleRegNumber + " . Type of vehicle: " + carType);
        System.out.println(" ");
    }


    public VehicleInfo searchVehicle(String vehicleRegNumber) {
        for (int i = 0; i < vehicles.size(); i++) {
            VehicleInfo vehicle = vehicles.get(i);

            if (vehicle.getVehicleRegNumber().equals(vehicleRegNumber)) {
                carInfo(vehicle);
                return vehicle;
            }

        }
        System.out.println("This registration number does not exist in the database.");
        return null;

    }

    private void carInfo(VehicleInfo vehicle) {
        System.out.println("This vehicle entered the highway at " + vehicle.getEnterTime());
        System.out.println("The type of the vehicle: " + vehicle.getCarType());
    }

    public void vehicleLeave(String vehicleRegNumber) {
        VehicleInfo vehicle = searchVehicle(vehicleRegNumber);
        if(vehicle == null){
            return;
        }
        countFee(vehicle.getVehicleRegNumber(), vehicle.getCarType());
        vehicles.remove(vehicle);
        System.out.println("This vehicle has been removed from the database.");
        System.out.println(" ");
    }

    public int countFee(String vehicleRegNumber, CarType carType) {
        VehicleInfo vehicle = searchVehicle(vehicleRegNumber);
        int enterTime = vehicle.getEnterTime().getSecond();
        int exitTime = LocalDateTime.now().getSecond();
        int totalTime = exitTime - enterTime;

        int sumToBePaid;
        if (carType == CarType.CAR || carType == CarType.MOTORCYCLE) {
            sumToBePaid = 2 * totalTime;

        } else {
            sumToBePaid = 4 * totalTime;

        }
        System.out.println("To be paid: " + sumToBePaid + " $");
        System.out.println("Thank you for your trip. Come back again.");
        return sumToBePaid;
    }

}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Highway {

    public List<VehicleInfo> vehicles = new ArrayList<>();


    public void vehicleEntry(String vehicleRegNumber, CarType carType) {
        vehicles.add(new VehicleInfo(vehicleRegNumber, carType));
        System.out.println(
                "New vehicle added. Registration number: " + vehicleRegNumber + " . Type of vehicle: " + carType);
    }

    public VehicleInfo searchVehicle(String vehicleRegNumber) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getVehicleRegNumber().equals(vehicleRegNumber)) {
                return vehicles.get(i);
            } else {
                System.out.println("This registration number does not exist in the database.");
            }
            carInfo(vehicles.get(i).getVehicleRegNumber());
        }
        return null;
    }
    private void carInfo(String vehicleRegNumber) {
        System.out.println("This vehicle entered the highway at " + searchVehicle(vehicleRegNumber).getEnterTime());
        System.out.println("The type of the vehicle: " + searchVehicle(vehicleRegNumber).getCarType());
    }



    public void vehicleLeave(String vehicleRegNumber) {
        countFee(searchVehicle(vehicleRegNumber).getVehicleRegNumber(), searchVehicle(vehicleRegNumber).getCarType());
        vehicles.remove(searchVehicle(vehicleRegNumber));
        System.out.println("This vehicle has been removed from the database.");


    }

    public int countFee(String vehicleRegNumber, CarType carType) {
        int enterTime = searchVehicle(vehicleRegNumber).getEnterTime().getSecond();
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

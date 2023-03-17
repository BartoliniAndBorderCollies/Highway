import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class VehicleInfo {

    private String vehicleRegNumber;
    private CarType carType;
    private LocalDateTime enterTime;

    public VehicleInfo(String vehicleRegNumber, CarType carType) {
        this.vehicleRegNumber = vehicleRegNumber;
        this.carType = carType;
        this.enterTime = LocalDateTime.now();
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public LocalDateTime getEnterTime() {
        return enterTime;
    }
}




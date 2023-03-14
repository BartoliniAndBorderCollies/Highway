import java.sql.Time;
import java.util.Date;

public class VehicleInfo {

    private String vehicleRegNumber;
    private CarType carType;
    private Date date; //TODO: tutaj może jeden field, który zawiera w sobie datę i godzinę? locale albo cóś?
    private Time time; //TODO: nie wiem jaki format jest dla tych dwóch fieldów

    public VehicleInfo(String vehicleRegNumber, CarType carType, Date date, Time time) {
        this.vehicleRegNumber = vehicleRegNumber;
        this.carType = carType;
        this.date = date;
        this.time = time;
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }



}

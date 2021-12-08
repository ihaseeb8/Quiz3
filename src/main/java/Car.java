import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    public int carId;

    @Id
    public int ownerId;
    public String liscencePlate;
    public String make;
    public int model;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    public void setLiscencePlate(String liscencePlate) {
        this.liscencePlate = liscencePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}

package Ex2_7;

public class Car {
    String plate;

    public Car(String plate) {

        this.plate = plate;
    }

    public String getPlate() {

        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "plate='" + plate;
    }
}

package exerJava32;

public class Vehiculo {
    private String fuel;
    private int maxSpeed;

    //METHODS
    public void drive(){

    }




    //CONSTRUCTOR
    public Vehiculo(String fuel, int maxSpeed) {
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
    }

    public Vehiculo() {
    }

    //GETTERS Y SETTERS
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fuel='" + fuel + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

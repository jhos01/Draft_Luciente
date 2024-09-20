package models;

public class Machinery {
    private String name;
    private double priceOfMachine;
    private double yearsOfLife;

    public Machinery(String name, double priceOfMachine, int yearsOfLife) {
        this.name = name;
        this.priceOfMachine = priceOfMachine;
        this.yearsOfLife = yearsOfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceOfMachine() {
        return priceOfMachine;
    }

    public void setPriceOfMachine(double priceOfMachine) {
        this.priceOfMachine = priceOfMachine;
    }

    public double getYearsOfLife() {
        return yearsOfLife;
    }

    public void setYearsOfLife(int yearsOfLife) {
        this.yearsOfLife = yearsOfLife;
    }

    @Override
    public String toString() {
        return "Machinery{" +
                "name='" + name + '\'' +
                ", priceOfMachine=" + priceOfMachine +
                ", yearsOfLife=" + yearsOfLife +
                '}';
    }

    public double calculateDepreciationOfMachinesPerHour(){
        return priceOfMachine / (getYearsOfLife()/8640);
    }
}

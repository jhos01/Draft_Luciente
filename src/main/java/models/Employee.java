package models;

public class Employee {
    private String name;
    private double costPerHour;

    public Employee(String name, double costPerHour) {
        this.name = name;
        this.costPerHour = costPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", costPerHour='" + costPerHour + '\'' +
                '}';
    }

}


package services;

import models.Employee;
import models.Inputs;
import models.Machinery;
import models.Tools;

import java.util.ArrayList;
import java.util.List;

public abstract class CleaningServices {
    protected Employee employee;
    protected double timeOfServiceRequested;
    protected List<Inputs> inputs;
    protected List<Tools> tools;
    protected List<Machinery> machinery;


    public CleaningServices(Employee employee, double timeOfServiceRequested) {
        this.employee = employee;
        this.timeOfServiceRequested = timeOfServiceRequested;
        this.inputs = new ArrayList<>();
        this.tools = new ArrayList<>();
        this.machinery = new ArrayList<>();
    }

    protected abstract void setUpService();

    public double calculateEmployeeCost(){
        return timeOfServiceRequested * employee.getCostPerHour();
    }
    public double calculateInputsCost(){
        double sumOfInputsCost = 0;
        for (Inputs input : inputs) {
            sumOfInputsCost = sumOfInputsCost + input.getPriceOfInput();
        }
        return sumOfInputsCost;
    }

    public double calculateToolsCost(){
        double sumOfToolsCost = 0;
        for (Tools tool: tools){
            sumOfToolsCost = sumOfToolsCost + tool.calculateDepreciationOfToolsPerHour();
        }
        return sumOfToolsCost;
    }

    public double calculateMachinesCost(){
        double sumOfMachinesCost = 0;
        for (Machinery machine : machinery){
            sumOfMachinesCost = sumOfMachinesCost + machine.calculateDepreciationOfMachinesPerHour();
        }
        return sumOfMachinesCost;
    }

    public double calculateTotalCostOfService(){
        return calculateEmployeeCost()+calculateInputsCost()+calculateToolsCost()+calculateMachinesCost();
    }

}


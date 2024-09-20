package services;

import models.Employee;
import models.Inputs;
import models.Machinery;
import models.Tools;

import java.util.List;

public class Mopping extends CleaningServices{

    public Mopping(Employee employee, double timeOfServiceRequested) {
        super(employee, timeOfServiceRequested);
    }
    @Override
    protected void setUpService(){
        inputs.add(new Inputs("detergent",13));
        tools.add(new Tools("mop",2,15));
        machinery.add(new Machinery("Floor polisher",8000,5));
    }
}

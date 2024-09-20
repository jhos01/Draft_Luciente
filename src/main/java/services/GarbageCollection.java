package services;

import models.Employee;
import models.Inputs;
import models.Tools;

public class GarbageCollection extends CleaningServices {

    public GarbageCollection(Employee employee, double timeOfServiceRequested) {
        super(employee, timeOfServiceRequested);
    }
    @Override
    protected void setUpService(){
        inputs.add( new Inputs("Black bag",1));
        inputs.add(new Inputs("small bag",0.5));
        tools.add(new Tools("garbage Collector",3,20));
    }
}


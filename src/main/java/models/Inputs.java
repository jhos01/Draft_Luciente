package models;

public class Inputs {
    private String nameOfInput;
    private double priceOfInput;

    public Inputs(String nameOfInput, double priceOfInput) {
        this.nameOfInput = nameOfInput;
        this.priceOfInput = priceOfInput;
    }

    public String getNameOfInput() {
        return nameOfInput;
    }

    public void setNameOfInput(String nameOfInput) {
        this.nameOfInput = nameOfInput;
    }

    public double getPriceOfInput() {
        return priceOfInput;
    }

    public void setPriceOfInput(double priceOfInput) {
        this.priceOfInput = priceOfInput;
    }

    @Override
    public String toString() {
        return "Inputs{" +
                "nameOfInput='" + nameOfInput + '\'' +
                ", priceOfInput=" + priceOfInput +
                '}';
    }
}


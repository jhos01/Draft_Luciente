package models;

public class Tools {
    private String nameOfTool;
    private double yearsOfLife;
    private double priceOfTool;

    public Tools(String nameOfTool, double yearsOfLife, double priceOfTool) {
        this.nameOfTool = nameOfTool;
        this.yearsOfLife = yearsOfLife;
        this.priceOfTool = priceOfTool;
    }

    public String getNameOfTool() {
        return nameOfTool;
    }

    public void setNameOfTool(String nameOfTool) {
        this.nameOfTool = nameOfTool;
    }

    public double getYearsOfLife() {
        return yearsOfLife;
    }

    public void setYearsOfLife(double yearsOfLife) {
        this.yearsOfLife = yearsOfLife;
    }

    public double getPriceOfTool() {
        return priceOfTool;
    }

    public void setPriceOfTool(double priceOfTool) {
        this.priceOfTool = priceOfTool;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "nameOfTool='" + nameOfTool + '\'' +
                ", yearsOfLife=" + yearsOfLife +
                ", priceOfTool=" + priceOfTool +
                '}';
    }

    public double calculateDepreciationOfToolsPerHour(){
        return (priceOfTool / (getYearsOfLife()/8640));
    }

}

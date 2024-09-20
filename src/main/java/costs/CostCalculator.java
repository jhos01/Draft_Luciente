package costs;

public class CostCalculator {
    private double directCost;
    private double indirectCost;

    public void addDirectCost(double cost){
        directCost = cost;

    }
    public void addIndirectCost(double cost){
        indirectCost = cost;
    }
    public double calculateTotalCost(){
        return directCost + indirectCost;
    }
}

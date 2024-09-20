package costs;

public class ProfitMargin {
    private double profitMarginPercentage;

    public ProfitMargin(double profitMarginPercentage) {
        this.profitMarginPercentage = profitMarginPercentage;
    }

    public double getProfitMarginPercentage() {
        return profitMarginPercentage;
    }

    public void setProfitMarginPercentage(double profitMarginPercentage) {
        this.profitMarginPercentage = profitMarginPercentage;
    }

    @Override
    public String toString() {
        return "ProfitMargin{" +
                "profitMarginPercentage=" + profitMarginPercentage +
                '}';
    }
    public double applyProfitMargin(double totalCost){
        return totalCost * (1 +profitMarginPercentage);
    }
}

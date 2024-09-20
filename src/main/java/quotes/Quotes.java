package quotes;

import costs.CostCalculator;
import costs.ProfitMargin;

public class Quotes {
    private CostCalculator calculationOfAllCosts;
    private ProfitMargin profitMargin;

    public Quotes(CostCalculator calculationOfAllCosts, ProfitMargin profitMargin) {
        this.calculationOfAllCosts = calculationOfAllCosts;
        this.profitMargin = profitMargin;
    }

    public double createNewQuote(){
        return profitMargin.applyProfitMargin(calculationOfAllCosts.calculateTotalCost());
    }
}

import costs.CostCalculator;
import costs.ProfitMargin;
import models.Employee;
import quotes.Quotes;
import services.CleaningServices;
import services.GarbageCollection;
import services.Mopping;

public class Main {
    public static void main(String[] args) {
        Employee cleaner1 = new Employee("Mariana",9);
        CleaningServices mopping1 = new Mopping(cleaner1, 100.0);
        CleaningServices garbageCollection1 = new GarbageCollection(cleaner1, 76);
        CostCalculator calculator = new CostCalculator();
        calculator.addDirectCost(mopping1.calculateTotalCostOfService());
        calculator.addDirectCost(garbageCollection1.calculateTotalCostOfService());
        calculator.addIndirectCost(3000);
        ProfitMargin newMargin = new ProfitMargin(0.30);
        Quotes newQuoteForClientRodolfo = new Quotes(calculator,newMargin);
        double finalQuote = newQuoteForClientRodolfo.createNewQuote();
        System.out.println("New Quote for the client: " + finalQuote);






    }
}

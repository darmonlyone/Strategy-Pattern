
public class CATax implements TaxCalculator {
    @Override
    public double calculateTax(double purchase) {
        return purchase * 0.075;
    }
}
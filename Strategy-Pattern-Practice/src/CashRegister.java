
public class CashRegister {
    private double purchase;
    private double payment;

    private TaxCalculator taxCal;

    public CashRegister(TaxCalculator taxCal) {
        this.purchase = 0;
        this.payment = 0;
        this.taxCal = taxCal;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase = purchase + taxCal.calculateTax(purchase);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
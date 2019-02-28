public class Main {

    public static void main(String[] args) {

        CashRegister cashRegisterThailand = new CashRegister(new ThailandTax());
        cashRegisterThailand.recordPurchase(60);
        cashRegisterThailand.recordPurchase(40);
        cashRegisterThailand.calculateTax();
        cashRegisterThailand.enterPayment(200);
        System.out.println(cashRegisterThailand.giveChange());

        CashRegister cashRegisterNY = new CashRegister(new NYTax());
        cashRegisterNY.recordPurchase(60);
        cashRegisterNY.recordPurchase(40);
        cashRegisterNY.calculateTax();
        cashRegisterNY.enterPayment(200);
        System.out.println(cashRegisterNY.giveChange());


        CashRegister cashRegisterCA = new CashRegister(new CATax());
        cashRegisterCA.recordPurchase(60);
        cashRegisterCA.recordPurchase(40);
        cashRegisterCA.calculateTax();
        cashRegisterCA.enterPayment(200);
        System.out.println(cashRegisterCA.giveChange());

    }
}
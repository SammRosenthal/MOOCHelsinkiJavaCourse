public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if (this.balance - 2.50 >= 0.00) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance - 4.00 >= 0.00) {
            this.balance -= 4.00;
        }

    }
}

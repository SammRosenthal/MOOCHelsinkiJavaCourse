
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        if (cents < 0) {
            euros--;
            cents += 100;
        }

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        Money newMoney = new Money(this.euros + added.euros(), this.cents + added.cents());
        return newMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        Money newMoney = new Money(this.euros - decremented.euros(), this.cents - decremented.cents());
        return newMoney;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}

import java.util.Objects;

public class Money {

    private long amount;
    private String currency;

    public Money(double amount, String currency) {
        this.amount = Math.round(amount * 100);
        this.currency = currency;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Money money = (Money) o;
//
//        if (amount != money.amount) return false;
//        return Objects.equals(currency, money.currency);
//    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money money)) {
            return false;
        }
        return amount == money.amount && currency.equalsIgnoreCase(money.currency);
    }


//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Money money)) return false;
//
//        if (amount != money.amount) return false;
//        return Objects.equals(currency, money.currency);
//    }

    @Override
    public int hashCode() {
        int result = (int) (amount ^ (amount >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}








public class BankCard implements Credit, Debit {

    @Override
    public void creditMethod() {
        System.out.println("Add many");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void debitMethod() {
        System.out.println("Dell many");
    }
}

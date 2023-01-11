public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;

    }
    public void deposit(double sum){
        amount = amount + sum;
    }
    public void withDraw(int sum) throws LimitException{
        if (sum < amount){
            throw new LimitException("У вас недостаточна средсв для снятий суммы", amount );

        } else {
      amount = amount - sum;
            System.out.println("Вы сняли деньги в размере" + sum);
        }

    }
}

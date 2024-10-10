import java.util.ArrayList;

class Account {

    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     *get.
     */
    public Account() {
        this.balance = 0.0;
        this.transitionList = new ArrayList<>();
    }

    /**
     *get.
     * @param amount adw.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     *get.
     * @param amount asd.
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                this.balance -= amount;
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     *get.
     * @param amount asd.
     * @param operation asd.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        Transaction transaction = new Transaction(operation, amount, this.balance);
        transitionList.add(transaction);
    }

    /**
     *get.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            System.out.printf("Giao dich " + (i + 1) + ": ");
            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Nap tien $%.2f. ", transaction.getAmount());
                System.out.printf("So du luc nay: $%.2f.\n", transaction.getBalance());
            } else {
                System.out.printf("Rut tien $%.2f. ", transaction.getAmount());
                System.out.printf("So du luc nay: $%.2f.\n", transaction.getBalance());
            }
        }
    }
}



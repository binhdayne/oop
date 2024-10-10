import java.util.ArrayList;

class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Constructor that initializes a student with the specified name, ID, and email.
     * Group is set to the default value ("K62CB").
     * @param operation is the name of the student.
     * @param amount is the ID of the student.
     * @param balance is the email address of the student.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Gets the student's name.
     * @return the name of the student.
     */
    public String getOperation() {
        return operation;
    }
    
    /**
     * Sets the student's name.
     * @param operation is the name to set for the student.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    /**
     * Gets the student's name.
     * @return the name of the student.
     */
    public double getAmount() {
        return amount;
    }
    
    /**
     * Sets the student's name.
     * @param amount is the name to set for the student.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    /**
     * Gets the student's name.
     * @return the name of the student.
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Sets the student's name.
     * @param balance is the name to set for the student.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

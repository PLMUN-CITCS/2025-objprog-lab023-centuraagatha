class BankAccount {
    public String accountHolder;
    private double balance;
    protected String accountType;
}

public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }
}

public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
    }
}
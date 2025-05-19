public class Oops {
    public static void main(String[] args) {
        Age age = new Age();
        age.assignAge(10);
        Age age2 = new Age();
        age2.assignAge(19);

        System.out.println(age.age);
        System.out.println(age2.age);

        BankAccount bankAccount = new BankAccount(200);
        bankAccount.printBalance();
        bankAccount.printAccountType();
        BankAccount bankAccount1 = new BankAccount(2000, "Current");
        bankAccount1.printBalance();
        bankAccount1.printAccountType();

        bankAccount.setBalance(20000);
        System.out.println(bankAccount.getBalance());

        Car car = new Car("CAR12345");
        car.printNumberOfVehicle();
        car.honk();
        Bus bus = new Bus("BUS12345");
        bus.printNumberOfVehicle();
        bus.honk();
    }
}

abstract class AbstractClass {
    double balance;

    abstract void addMoney(double amount);

    abstract void canUserWithdrawMoney(double amount);

    void updateBalance(double _balance) {
        balance = _balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends AbstractClass {
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount) {
        if (super.getBalance() >= amount) {
            System.out.println("User can");
        } else {
            System.out.println("User cannot");
        }
    }
}

class CurrentAccount extends AbstractClass {
    double minimumLimit = 1000.0;

    void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    void canUserWithdrawMoney(double amount) {
        if (super.getBalance() + minimumLimit >= amount) {
            System.out.println("User can");
        } else {
            System.out.println("User cannot");
        }
    }
}

// Base Class

class Vehicle {
    String numberOfVehicle;

    public Vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk() {
        System.out.println("Honk!!!!!!!!!!!");
    }

    public void printNumberOfVehicle() {
        System.out.println(numberOfVehicle);
    }
}

// Derived Class

class Car extends Vehicle {
    public Car(String numberOfCar) {
        super(numberOfCar);
    }

    @Override
    public void honk() {
        System.out.println("Give me way!!!!!!!!!!!!");
    }
}

// Derived Class

class Bus extends Vehicle {
    public Bus(String numberOfBus) {
        super(numberOfBus);
    }
}

class Test {
    public void printTest() {
        System.out.println("hello1");
    }
}

class Age {
    int age;

    public void assignAge(int num) {
        age = num;
    }
}

class BankAccount {
    private double balance;
    private String accountType;

    public BankAccount(double _balance) {
        balance = _balance;
        accountType = "Savings";
    }

    public BankAccount(double _balance, String _accountType) {
        balance = _balance;
        accountType = _accountType;
    }

    public void setBalance(double _balance) {
        balance = _balance;
    }

    public void setAccountType(String _accountType) {
        accountType = _accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void printBalance() {
        System.out.println(balance);
    }

    public void printAccountType() {
        System.out.println(accountType);
    }
}

// public -> everywhere
// private -> current class
// protected -> current package and all other sub packages

// Default specifier for class is package protected
// Default specifier for variable is public

// You cannot create an object from abstract class

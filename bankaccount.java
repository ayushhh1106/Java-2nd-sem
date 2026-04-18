class bank {
    String name ;
    int balance;
    void setData(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    void display() {
        System.out.println(this.name);
        System.out.println(this.balance);
    }
        void invest(int amount) {
            balance += amount;
        }
        void withdraw(int amount) {
            if (balance >= amount) {
                balance = balance - amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

public class bankaccount {
    public static void main() {
        bank b1 = new bank();
        b1.setData("Ayush", 1000);
        b1.display();
        b1.invest(500); 
        b1.display();
        b1.withdraw(200);
        b1.display();
        b1.withdraw(2000);
        b1.display();   
    }
}

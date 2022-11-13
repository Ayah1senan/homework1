

public class fourth {
    public static void main(String[] args) {
        int salary=1000;
        double earningPresntage=0.05;
        double balance;
        balance= salary +(salary * earningPresntage);

        System.out.println("the salary after one year");
        System.out.println(balance);

        balance=balance+(salary * earningPresntage);
        System.out.println("the salary after two years");
        System.out.println(balance);
        balance=balance+(salary*earningPresntage);
        System.out.println("the salary after three years");
        System.out.println(balance);

        }
}

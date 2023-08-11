public class Main {
    public static void main(String[] args) {

      HDFCAcc AnkushAcc = new HDFCAcc("Ankush" , "Ankush@123" , 2000);
      System.out.print(AnkushAcc);

      //fetch balance
        System.out.println(AnkushAcc.fetchBalance("random"));
        System.out.println(AnkushAcc.fetchBalance("Ankush@123"));

        // add money
        System.out.println(AnkushAcc.addMoney(100000));

        // withdraw
        System.out.println(AnkushAcc.withdrawMoney(200000,"Ankush@123"));
        System.out.println(AnkushAcc.withdrawMoney(50000,"Ankush@123"));
        System.out.println(AnkushAcc.withdrawMoney(50000,"random"));

        // change password
        System.out.println(AnkushAcc.changePassword("Ankush@123","Ankush123"));

        System.out.println(AnkushAcc.fetchBalance("Ankush123"));

        // calculate interest
        System.out.println("Interest for 5 years on current balance will be :" + AnkushAcc.calculateInterest(5));
    }
}
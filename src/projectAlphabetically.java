import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class projectAlphabetically {
    public static class BankAccount implements Comparable {
        public BankAccount(String nm, double bal){
            name = nm;
            balance = bal;
        }
        public int compareTo(Object otherObject){
            BankAccount o = (BankAccount) otherObject;
            return name.compareTo(o.name);
        }
        public String name;
        public double balance;
    }

    public static void main(String[] args){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        int j;
        BankAccount[] ba = new BankAccount[5];//makes array of bankaccounts
        for(j = 0; j<ba.length; j++){
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter the name to whom this account belongs");
            name = sc.nextLine();
            System.out.println("Please enter the amount of the deposit");
            double amount = sc.nextDouble();
            System.out.println(" ");
            ba[j] = new BankAccount(name,amount);//instantiates ba[j]
        }

        Arrays.sort(ba);//sorts bankaccounts
        for(int i = 0; i < ba.length; i++){
            System.out.println(ba[i].name + ">>>" + ba[i].balance);
        }

    }
}

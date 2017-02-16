import java.text.NumberFormat;
import java.util.*;

public class projectComparator{
    public static class BankAccount{
        public BankAccount(String nm, double bal){
            name = nm;
            balance = bal;
        }
        public String name;
        public double balance;
    }
    public static class BA_comparator implements Comparator{
        public int compare(Object firstObject, Object secondObject){
            BankAccount a1 = (projectComparator.BankAccount) firstObject;
            BankAccount a2 = (projectComparator.BankAccount) secondObject;
            if(a1.balance < a2.balance){
                return -1;
            }
            else if(a1.balance > a2.balance){
                return 1;
            }
            else{
                return 0;
            }
        }
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
        Comparator comp = new BA_comparator();
        Arrays.sort(ba, comp);//sorts bankaccounts
        for(int i = 0; i < ba.length; i++){
            System.out.println(ba[i].name + ">>>" + ba[i].balance);
        }

    }

}

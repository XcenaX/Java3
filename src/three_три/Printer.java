package three_три;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Лебедевв on 17.02.2020.
 */
public class Printer {
    Customer[] customers;
    public  Printer(Customer[] customers){
        this.customers = customers;
    }
    public void printAll(){
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
    public void printWithDiaposon(int start, int end){
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getCardNumber() <= end && customers[i].getCardNumber() >= start){
                System.out.println(customers[i]);
            }
        }
    }
    public void printSorted(){
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFirstName().compareTo(o2.getLastName());
            }
        });
        printAll();
    }
}

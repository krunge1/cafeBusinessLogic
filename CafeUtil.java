import java.util.ArrayList;
import java.util.ListIterator;

public class CafeUtil {
    int getStreakGoal(){
        int numWeeks = 10;
        int drinksCount=0;
        int totalCount=0;
        while(drinksCount<=numWeeks){
            totalCount = totalCount + drinksCount;
            drinksCount++;
        }
        return totalCount;
    }

    double getOrderTotal(double[] prices){
        double itemTotal = 0;
        for (double price: prices){
        itemTotal+=price;
        }
        return itemTotal;
    }

    void displayMenu(ArrayList<String> menuItems){
        for(int item=0; item<menuItems.size(); item++){
            System.out.printf("%s %s \n",item, menuItems.get(item));
        }
    }

    void addCustomer(ArrayList<String> customers){
        int queue = 0;
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        queue = customers.size();
        System.out.println("There are " + queue + " people in front of you.");
        customers.add(userName);
        for (int customer=0; customer<customers.size(); customer++){
            System.out.printf("%s \n",customers.get(customer));
        }
    }

    void printPriceChart(String product, double price, int maxQuanity){
        double total = 0;
        int orderNumber = 1;
        double discount = .50;
        for (int count = 0; count < maxQuanity; count++){
            orderNumber += 1;
            total += price;
            System.out.printf(orderNumber + " - $%.2f\n", total);
        }
    }
}




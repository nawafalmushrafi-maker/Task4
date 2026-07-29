package idea.project.Task4.Task4.Task4.Task4;
import java.util.ArrayList;
import java.util.Collections;
public class InventoryManagementSystem {
    public static void main(String[] args){
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();
        productNames.add("Laptop");
        productQuantities.add(5);
        productPrices.add(750.50);
        productNames.add("Laptop");
        productQuantities.add(2);
        productPrices.add(350.50);
        productNames.add("PC");
        productQuantities.add(1);
        productPrices.add(1500.850);
        productNames.add("PC");
        productQuantities.add(2);
        productPrices.add(3500.850);
        productNames.add("Microphone");
        productQuantities.add(5);
        productPrices.add(250.50);
        productNames.add("Iphone 18");
        productQuantities.add(2);
        productPrices.add(750.50);
        productNames.add("iPad air");
        productQuantities.add(3);
        productPrices.add(750.50);
        productNames.add("Mouse");
        productQuantities.add(10);
        productPrices.add(300.50);
        productNames.add("Mouse pad");
        productQuantities.add(3);
        productPrices.add(50.500);
        productNames.add("USB 125 GB");
        productQuantities.add(20);
        productPrices.add(100.850);
        for(int i=0; i < productNames.size(); i++){
            System.out.println("Product "+i+": ");
            System.out.println("Name: "+productNames.get(i));
            System.out.println("Quantity: "+productQuantities.get(i));
            System.out.println("Price: "+productPrices.get(i));
        }
        IO.println("Enter Product Name: ");
        String proName = IO.readln();
        IO.println("Enter Quantity:");
        int proQuantity = Integer.parseInt(IO.readln());
        IO.println("Enter Price:");
        double proPrice = Double.parseDouble(IO.readln());
        productNames.add(proName);
        productQuantities.add(proQuantity);
        productPrices.add(proPrice);
        IO.println("Product added successfully");
        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());
        if (index >= 0 && index < productNames.size()) {
            IO.println("New Product Name: ");
            String updatedName = IO.readln();
            IO.println("New Quantity: ");
            int updatedQuantity = Integer.parseInt(IO.readln());
            IO.println("New Price: ");
            double updatedPrice = Double.parseDouble(IO.readln());
            productNames.set(index, updatedName);
            productQuantities.set(index, updatedQuantity);
            productPrices.set(index, updatedPrice);
            IO.println("Product updated successfully");
        } else {
            IO.println("Invalid index!");
        }
        IO.println("Please enter name of product you want to search for: ");
        String searchName = IO.readln();

        int searchIndex = -1;
        for (int i = 0; i < productNames.size(); i++) {
            if (productNames.get(i).equalsIgnoreCase(searchName)) {
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1) {
            System.out.println("Index: " + searchIndex);
            System.out.println("Quantity: " + productQuantities.get(searchIndex));
            System.out.println("Price: " + productPrices.get(searchIndex));
        } else {
            System.out.println("Product not found");
        }
        System.out.println("Total Products:"+productQuantities.size());
        double sum = 0;
        for(int i = 0; i<productPrices.size(); i++){
            sum += productPrices.get(i);
        }
        System.out.println("The total price is: "+sum);
        System.out.println("Inventory Value: "+ productQuantities.size() * sum);
        for(int i = 0; i<productNames.size(); i++){
            if(productQuantities.get(i)<5){
                System.out.println("Low Stock: "+productNames.get(i));
            }
        }
        for(int i = 0; i<productNames.size(); i++){
            if(productQuantities.get(i).equals(0)){
                System.out.println("Out of Stock: "+productNames.get(i));
            }
        }
        for(int i = 0; i<productNames.size(); i++){
            if(productQuantities.get(i)>= 5){
                System.out.println("Highest Stock: "+productNames.get(i));
            }
        }
        IO.println("Please enter product you want to remove by index: ");
        int removePro= Integer.parseInt(IO.readln());
        if (removePro >= 0 && removePro < productNames.size()) {
            String removedName = productNames.remove(removePro);
            productQuantities.remove(removePro);
            productPrices.remove(removePro);
            System.out.println("Product " + removedName + " removed successfully");
        } else {
            System.out.println("Product not found");
        }
        ArrayList<String>sortedProName = new ArrayList<>(productNames);
        Collections.sort(sortedProName);
        System.out.println("Sorted Product name: "+sortedProName);
        ArrayList<Double>sortedProPrice = new ArrayList<>(productPrices);
        Collections.sort(sortedProPrice);
        System.out.println("Sorted Product price"+ productPrices.reversed());
    }
}

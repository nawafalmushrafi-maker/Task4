package idea.project.Task4.Task4.Task4.Task4;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProductInventoryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();


        productNames.add("Keyboard");
        productQuantities.add(17);
        productPrices.add(25.99);
        productNames.add("Monitor");
        productQuantities.add(9);
        productPrices.add(120.99);
        productNames.add("Printer");
        productQuantities.add(9);
        productPrices.add(125.00);
        productNames.add("Tablet");
        productQuantities.add(6);
        productPrices.add(299.99);
        productNames.add("Headphones");
        productQuantities.add(11);
        productPrices.add(40.99);
        productNames.add("USB Drive");
        productQuantities.add(12);
        productPrices.add(17.50);
        productNames.add("Mouse");
        productQuantities.add(30);
        productPrices.add(18.99);
        productNames.add("Webcam");
        productQuantities.add(10);
        productPrices.add(52.25);
        productNames.add("Speaker");
        productQuantities.add(7);
        productPrices.add(80.20);
        productNames.add("Laptop");
        productQuantities.add(30);
        productPrices.add(888.99);
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Product " + i);
            System.out.println("Name: " + productNames.get(i));
            System.out.println("Quantity: " + productQuantities.get(i));
            System.out.println("Price: " + productPrices.get(i));
        }
        System.out.print("Enter Product Name: ");
        String name = input.nextLine();
        System.out.print("Enter The Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Enter The Price: ");
        double price = input.nextDouble();
        productNames.add(name);
        productQuantities.add(quantity);
        productPrices.add(price);
        System.out.println("Product added successfully");
        System.out.print("Enter product index: ");
        int index = input.nextInt();
        input.nextLine();
        if(index >= 0 && index < productNames.size()) {
            System.out.print("New Product Name: ");
            String newName = input.nextLine();
            System.out.print("New Quantity: ");
            int newQuantity = input.nextInt();
            System.out.print("New Price: ");
            double newPrice = input.nextDouble();
            productNames.set(index,newName);
            productQuantities.set(index,newQuantity);
            productPrices.set(index,newPrice);
            System.out.println("Product updated successfully");

        }
        input.nextLine();
        System.out.print("Search Product Name: ");
        String search = input.nextLine();
        if(productNames.contains(search)) {
            int i = productNames.indexOf(search);
            System.out.println("Product Index: " + i);
            System.out.println("Quantity: " + productQuantities.get(i));
            System.out.println("Price: " + productPrices.get(i));
        }
        else
        {

            System.out.println("Product not found");
        }
        int totalQuantity = 0;
        double totalValue = 0;
        for(int i = 0; i < productNames.size(); i++) {
            totalQuantity += productQuantities.get(i);
            totalValue += productQuantities.get(i) * productPrices.get(i);
        }
        System.out.println("Total Products: " + productNames.size());
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Inventory Value: " + totalValue);
        System.out.println("Low Stock:");
        for(int i = 0; i < productNames.size(); i++) {
            if(productQuantities.get(i) < 5 && productQuantities.get(i) > 0)
                System.out.println(productNames.get(i));
        }
        System.out.println("Out of Stock:");
        for(int i = 0; i < productNames.size(); i++) {
            if(productQuantities.get(i) == 0)
                System.out.println(productNames.get(i));
        }
        System.out.print("Remove Product Index: ");
        int remove = input.nextInt();
        if(remove >=0 && remove < productNames.size()) {
            productNames.remove(remove);
            productQuantities.remove(remove);
            productPrices.remove(remove);
            System.out.println("Product removed successfully");
        }
        for(int i = 0; i < productNames.size()-1; i++) {
            for(int j = i+1; j < productNames.size(); j++) {
                if(productPrices.get(i) > productPrices.get(j)) {
                    double p = productPrices.get(i);
                    productPrices.set(i,productPrices.get(j));
                    productPrices.set(j,p);
                    String n = productNames.get(i);
                    productNames.set(i,productNames.get(j));
                    productNames.set(j,n);
                    int q = productQuantities.get(i);
                    productQuantities.set(i,productQuantities.get(j));
                    productQuantities.set(j,q);
                }
            }
        }
        System.out.println("Sorted Products:");
        for(int i = 0; i < productNames.size(); i++) {
            System.out.println(productNames.get(i) + " " + productQuantities.get(i) + " " + productPrices.get(i));
        }
        input.close();
    }
}
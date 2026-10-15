/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 





public class GrocceryStoreIceTask {
    Item[] initialInventory = {
        new Item("Apple", Catergory.FRUITS, 5.50),
        new Item("Carrot", Catergory.VEGETABLES, 15),
        new Item("Milk", Catergory.DAIRY, 18.00),
        new Item("Sourdough", Catergory.BAKERY,28.50),
        new Item("Chicken", Catergory.MEAT, 90.00)
    };
    
    ArrayList<Item> inventory =
            new ArrayList<>(Arrays.asList(initialInventory));
   
     // Display code 
     public void displayItems() {
         for (Item item : inventory) {
             System.out.println("Name: " + item.getName());
             System.out.println("Catergory: " + item.getCatergory());
             System.out.printf("Price: R%.2f%n", item.getPrice());
             System.out.println("____________________");
             
         }
     }
     
     public void addItems(Item item) {
         inventory.add(item);
     }
     // Remove code 
     public void removeItem(String name) {
         for (Item item : inventory) {
             if (item.getName().equalsIgnoreCase(name)) {
                 inventory.remove(item);
                 System.out.println(name + " removed successfully.");
             return; 
             
             }
         }
         System.out.println("Item not found."); }
     
     public void displayByCatergory(Catergory catergory){
         for (Item item : inventory) {
           
                  // print the item details 
             if(item.getCatergory () == catergory) {
                 System.out.println("Name: " + item.getName());
                 System.out.println("Catergory: " + item.getCatergory());
                 System.out.printf("Price: R%.2f%n", item.getPrice());
                 System.out.println("_________________");
                 

             
         }
     }
     }
     
     
     public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
     GrocceryStoreIceTask store = new GrocceryStoreIceTask();
     
   System.out.println("===== GROCERY STORE MENU =====");
   System.out.println("1. Display all items");
   System.out.println("2. Add an item");
   System.out.println("3. Remove an item");
   System.out.println("4. Display items by catergory");
   System.out.println("5. Exit");
   System.out.print("Enter your choice: ");
   
   int choice = input.nextInt(); 
   
   switch (choice) {
       case 1:
           store.displayItems();
           break;
           
       case 2:
           System.out.println("Enter item name");
           input.nextLine();
           String name = input.nextLine();
           
           System.out.println("Choose category: FRUITS, VEGETABLES, DAIRY, BAKERY, MEAT");
           Catergory catergory = Catergory.valueOf(input.nextLine().toUpperCase());
           
           System.out.print("Enter price:  ");
           double price = input.nextDouble();
           
           store.addItems(new Item(name, catergory, price));
           System.out.println("Item added successfully.");
           break;
           
       case 3:
           System.out.println("Enter the item name to remove it");
           input.nextLine();
           String removeName = input.nextLine();
           
           store.removeItem(removeName);
           break;
         
               
       case 4:
           System.out.println("Choose a catergory: FRUITS, VEGETABLES, DAIRY, MEAT, BAKERY");
           input.nextLine();
           String catergoryChoice = 
                   input.nextLine().toUpperCase();
           
           Catergory selectedCategory =
           Catergory.valueOf(catergoryChoice);
           store.displayByCatergory(selectedCategory);
           break;
                 
           
       case 5:
           System.out.println("Goodbye!");
           
       default:
           System.out.println("Invalid choice.");
           
   }
      }
     
     
     
     
     
     
     
     
     
     
  }
    


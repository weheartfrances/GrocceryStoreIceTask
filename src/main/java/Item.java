/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author frances
 */
public class Item {
    
private String name;
private Catergory catergory;
private double price;
 
public Item(String name, Catergory catergory, double price) {
    this.name = name;
    this.catergory = catergory;
    this.price = price;        
}

public String getName() {
    return name;
}

public Catergory getCatergory(){
    return catergory;
}

public double getPrice(){
    return price;
}


}
 
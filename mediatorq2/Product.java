/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

/**
 *
 * @author HP
 */
class Product{
    String name;
    int units_shipped;
    int quantity_in_stock;
    float price;
    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity_in_stock = quantity;
        this.units_shipped = 0;
    }
}

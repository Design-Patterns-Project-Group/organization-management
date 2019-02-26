/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

class Product extends ProductInfo{
    int units_shipped;
    int quantity_in_stock;
    public Product(String name, float price, int quantity){
        super(name,price);
        this.quantity_in_stock = quantity;
        this.units_shipped = 0;
    }
}

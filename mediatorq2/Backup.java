/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Backup {
    
}
/*
package mediatorq2;

import java.util.ArrayList;
import java.util.List;

class Product{
    String name;
    int units_shipped;
    float price;
    public Product(String name, float price, int units_shipped){
        this.name = name;
        this.price = price;
        this.units_shipped = units_shipped;
    }
}
class ProductInfo{
    String name;
    float price;
    public ProductInfo(String name, float price){
        this.name = name;
        this.price = price;
    }
}

class Inventory{
    private final List<Product> products = new ArrayList<>();
    private final List<ProductInfo> productsInfo = new ArrayList<>();
    
    public void addProduct(Product prod){
        this.products.add(prod);
        this.productsInfo.add(new ProductInfo(prod.name,prod.price));
    }
    
    public List getProducts(){
        return this.products;
    }
    public List getProductsInfo(){
        return this.productsInfo;
    }
}

abstract class Mediator{
    public abstract void DisplayToUser();
    public abstract void DisplayToAdmin();
}
// ConcreteMediator
class ConcreteMediator extends Mediator{
    private final Inventory inventory;
    
    public ConcreteMediator(Inventory inventory){
        this.inventory = inventory;
    }
    @Override
    public void DisplayToUser(){
        List<ProductInfo> products = this.inventory.getProductsInfo();
        System.out.println("Name              Price");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i<products.size(); i++){
            ProductInfo current = products.get(i);
            System.out.println(current.name+"                   "+ current.price);
        } 
    }
    @Override
    public void DisplayToAdmin(){
        List<Product> products = this.inventory.getProducts();
        System.out.println("Name               Price            AmountInStock");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i<products.size(); i++){
            Product current = products.get(i);
            System.out.println(current.name+"              "+ current.price +"              "+current.units_shipped);
        }
        
    }
}
abstract class User{
    protected Mediator mediator;
    public String name;

    public User(Mediator _mediator){
        mediator = _mediator;
    }
}
// Friend1—first participant
class CommonUser extends User{
    public CommonUser(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public void Display(){
        mediator.DisplayToUser();
    }
    public void Sort(){
       mediator.sort();
    }
}
// Friend2—Second participant
class Admin extends User{
// Constructor
    public Admin(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public void Display(){
        mediator.DisplayToAdmin();
    }
    
}

public class MediatorQ2 {

    public static void main(String[] args){
        System.out.println("***Mediator Pattern Demo***\n");
        Inventory inv = new Inventory();
        ConcreteMediator m = new ConcreteMediator(inv);
        CommonUser user = new CommonUser(m,"kil");
        Admin admin = new Admin(m,"admin");
        inv.addProduct(new Product("a",12,10));
        inv.addProduct(new Product("b",13,10));
        inv.addProduct(new Product("c",14,10));
        
        admin.Display();
        user.Display();
        
        
    }
    
}
/*class MyTableModel extends AbstractTableModel{
    String [] colnames = {"Name","Price"};
    Object [][] data = {{1,1}};
    
    @Override
    public int getColumnCount(){
        return colnames.length;
    }
    
    @Override
    public int getRowCount(){
        return data.length;
    }
    
    @Override
    public String getColumnName(int col){
        return colnames[col];
    }
    
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }
    
    @Override
    public boolean isCellEditable(int row,int col){
        return col >= 1;
    }
    
    @Override
    public Object getValueAt(int row, int col){
        return data[row][col];
    }
    
    @Override
    public void setValueAt(Object value, int row, int col){
        data[row][col] = value;
        fireTableCellUpdated(row,col);
    }
    
}
*/

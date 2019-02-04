
package mediatorq2;

import java.util.ArrayList;
import java.util.Collections;
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
    public abstract List<ProductInfo> DisplayToUser(Boolean sort);
    public abstract List<Product> DisplayToAdmin(Boolean sort);
}
// ConcreteMediator
class ConcreteMediator extends Mediator{
    private final Inventory inventory;
    
    public ConcreteMediator(Inventory inventory){
        this.inventory = inventory;
    }
    @Override
    public List<ProductInfo> DisplayToUser(Boolean sort){
        List<ProductInfo> products = this.inventory.getProductsInfo();
        
        if (sort){
            List<String> productNames = new ArrayList<>();
            for(int i = 0; i<products.size(); i++){
                productNames.add(products.get(i).name);
            }
            Collections.sort(productNames);
            List<ProductInfo> sortedproducts = new ArrayList<>();
            for(int i = 0; i<products.size(); i++){
                for(int j = 0; j<products.size(); j++){
                    if(productNames.get(i).equals(products.get(j).name)){
                        sortedproducts.add(products.get(j));
                        break;
                    }
                }
            }
            products = sortedproducts;
        }
        System.out.println("Name              Price");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i<products.size(); i++){
            ProductInfo current = products.get(i);
            System.out.println(current.name+"                   "+ current.price);
        }
        return products;
    }
    @Override
    public List<Product> DisplayToAdmin(Boolean sort){
        List<Product> products = this.inventory.getProducts();
        
        if (sort){
            List<String> productNames = new ArrayList<>();
            for(int i = 0; i<products.size(); i++){
                productNames.add(products.get(i).name);
            }
            Collections.sort(productNames);
            List<Product> sortedproducts = new ArrayList<>();
            for(int i = 0; i<products.size(); i++){
                for(int j = 0; j<products.size(); j++){
                    if(productNames.get(i).equals(products.get(j).name)){
                        sortedproducts.add(products.get(j));
                        break;
                    }
                }
            }
            products = sortedproducts;
        }
        System.out.println("Name               Price            AmountInStock");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i<products.size(); i++){
            Product current = products.get(i);
            System.out.println(current.name+"              "+ current.price +"              "+current.units_shipped);
        }
        return products;
        
    }
}
abstract class User{
    protected Mediator mediator;
    public String name;

    public User(Mediator _mediator){
        mediator = _mediator;
    }
}
class CommonUser extends User{
    public CommonUser(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public void Display(Boolean sort){
        mediator.DisplayToUser(sort);
    }
    
}
class Admin extends User{
    public Admin(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public void Display(Boolean sort){
        mediator.DisplayToAdmin(sort);
    }
    
}

public class MediatorQ2 {

    public static void main(String[] args){
        System.out.println("***Mediator Pattern Demo***\n");
        Inventory inv = new Inventory();
        ConcreteMediator m = new ConcreteMediator(inv);
        CommonUser user = new CommonUser(m,"kil");
        Admin admin = new Admin(m,"admin");
        inv.addProduct(new Product("c",12,10));
        inv.addProduct(new Product("a",13,10));
        inv.addProduct(new Product("b",14,10));
        
        admin.Display(true);
        user.Display(true);
        
        
    }
    
}

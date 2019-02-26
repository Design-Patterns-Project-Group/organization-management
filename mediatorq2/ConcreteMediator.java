
package mediatorq2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ConcreteMediator extends Mediator{
    public IInventory inventory;
    
    public ConcreteMediator(){
        this.inventory = new Inventory();
    }
    @Override
    public List<ProductInfo> DisplayToUser(Boolean sort){
        List<ProductInfo> products = this.inventory.getProductsInfo();
        
        if (sort){
            Collections.sort(products, new SortByInfoName());
        }
        return products;
    }
    @Override
    public List<Product> DisplayToAdmin(Boolean sort){
        List<Product> products = this.inventory.getProducts();
        
        if (sort){
            Collections.sort(products, new SortByProdName());
        }
        return products;
    }
    
    @Override
    public void AddItem(String name, float price, int quantity){
        this.inventory.addProduct(new Product(name,price,quantity));
    }
    public void Buy(String name){
        this.inventory.sell(name);
    }
    
    class SortByInfoName implements Comparator<ProductInfo> {
        public int compare(ProductInfo o1, ProductInfo o2) {
            return o1.name.compareTo(o2.name);
        }   
    }
    class SortByProdName implements Comparator<Product> {
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }   
    }
}
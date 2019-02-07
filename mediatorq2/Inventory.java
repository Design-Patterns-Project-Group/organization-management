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
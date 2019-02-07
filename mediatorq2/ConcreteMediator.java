/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP
 */
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
        return products;
    }
}
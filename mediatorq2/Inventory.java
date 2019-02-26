/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.ArrayList;
import java.util.List;

class Inventory implements IInventory{
    private final List<Product> products = new ArrayList<>();
    private final List<ProductInfo> productsInfo = new ArrayList<>();
    
    @Override
    public void addProduct(Product prod){
        this.products.add(prod);
        this.productsInfo.add(new ProductInfo(prod.name,prod.price));
    }
    
    @Override
    public List getProducts(){
        return this.products;
    }
    @Override
    public List getProductsInfo(){
        return this.productsInfo;
    }
    @Override
    public void sell(String name){
        for(int i = 0; i<this.products.size();i++){
            if (this.products.get(i).name.equals(name)){
                this.products.get(i).quantity_in_stock--;
                this.products.get(i).units_shipped++;
                break;
            }
        }
    }
}
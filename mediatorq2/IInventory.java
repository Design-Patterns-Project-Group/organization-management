/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.List;

public interface IInventory {
    public void addProduct(Product prod);
    public List getProducts();
    public List getProductsInfo();
    public void sell(String name);
}
























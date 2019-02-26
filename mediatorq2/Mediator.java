/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.List;

abstract class Mediator{
    public abstract List<ProductInfo> DisplayToUser(Boolean sort);
    public abstract List<Product> DisplayToAdmin(Boolean sort);

    public abstract void AddItem(String name, float price, int quantity);
    public abstract void Buy(String name);
}


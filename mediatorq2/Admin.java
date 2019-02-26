/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

import java.util.List;

/**
 *
 * @author HP
 */
class Admin extends User{
    public Admin(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public List<Product> Display(Boolean sort){
        return mediator.DisplayToAdmin(sort);
    }
}

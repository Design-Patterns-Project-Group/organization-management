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

class CommonUser extends User{
    public CommonUser(Mediator mediator,String name){
        super(mediator);
        this.name = name;
    }
    public List<ProductInfo> Display(Boolean sort){
        return mediator.DisplayToUser(sort);
    }
}

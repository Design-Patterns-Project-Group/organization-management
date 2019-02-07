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
abstract class Mediator{
    public abstract List<ProductInfo> DisplayToUser(Boolean sort);
    public abstract List<Product> DisplayToAdmin(Boolean sort);
}
// ConcreteMediator

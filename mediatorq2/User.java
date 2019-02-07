/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorq2;

/**
 *
 * @author HP
 */

abstract class User{
    protected Mediator mediator;
    public String name;

    public User(Mediator _mediator){
        mediator = _mediator;
    }
}

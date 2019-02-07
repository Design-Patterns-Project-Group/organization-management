
package mediatorq2;

public class MediatorQ2 {

    public static void main(String[] args){
        System.out.println("***Mediator Pattern Demo***\n");
        Inventory inv = new Inventory();
        ConcreteMediator m = new ConcreteMediator(inv);
        CommonUser user = new CommonUser(m,"kil");
        Admin admin = new Admin(m,"admin");
        inv.addProduct(new Product("c",12,10));
        inv.addProduct(new Product("a",13,10));
        inv.addProduct(new Product("b",14,10));
        
        admin.Display(true);
        user.Display(true);
        
        
    }
    
}

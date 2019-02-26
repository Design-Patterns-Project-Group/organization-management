
package mediatorq2;

public class MediatorQ2 {

    public static void main(String[] args){
        System.out.println("***Mediator Pattern Demo***\n");
        ConcreteMediator m = new ConcreteMediator();
        CommonUser user = new CommonUser(m,"kil");
        Admin admin = new Admin(m,"admin");
        
        admin.Display(true);
        user.Display(true);
        
        
    }
    
}

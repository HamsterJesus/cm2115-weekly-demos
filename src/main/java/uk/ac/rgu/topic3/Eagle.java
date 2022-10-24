package uk.ac.rgu.topic3;

public class Eagle extends Bird implements CanFly, IsPresdator{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return this.name + ": Patriotic American caw";
    }

    @Override
    public void fly() {
        System.out.println("eagle flying frfr");
        
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }

   
    
    
}

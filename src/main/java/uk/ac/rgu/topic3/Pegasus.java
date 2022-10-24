package uk.ac.rgu.topic3;

public class Pegasus extends Horse implements CanFly{

    public Pegasus(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        System.out.println("Horse with wings flying lol");
        
    }

   
    
    
}

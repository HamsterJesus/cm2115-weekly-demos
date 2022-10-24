package uk.ac.rgu.topic3;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return this.name + ": Pengwuin";
    }
    
    
}

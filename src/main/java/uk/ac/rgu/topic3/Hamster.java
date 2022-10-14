package uk.ac.rgu.topic3;

public class Hamster extends Animal{
    public Hamster(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return this.name + " :squeek";
    }
    
}


   
    


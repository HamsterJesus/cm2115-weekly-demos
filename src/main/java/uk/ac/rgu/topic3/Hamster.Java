package uk.ac.rgu.topic3;

public class Hamster extends Animal{
   
    @param name
    public Hamster(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return this.name + " :squeek";
    }
}
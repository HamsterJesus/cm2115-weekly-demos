package uk.ac.rgu.topic5;

import uk.ac.rgu.topic5.Laptop.LaptopScreen;

public class app {
    

    public static void main(String[] args){
        
        Laptop laptop = new Laptop();
        LaptopScreen screen = laptop.new LaptopScreen(15, "200x300");
    }
    
}

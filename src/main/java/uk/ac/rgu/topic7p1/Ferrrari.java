package uk.ac.rgu.topic7p1;

public class Ferrrari implements Car{
    @Override
    public void accept(CarVisitor visitor){
        visitor.visit(this);
    }

    public void someFerrariMETH(){
        System.out.print("ferrari: epic ");
    }
    
}

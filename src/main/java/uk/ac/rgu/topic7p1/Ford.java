package uk.ac.rgu.topic7p1;

public class Ford implements Car{
    @Override
    public void accept(CarVisitor visitor){
        visitor.visit(this);
    }

    public void someFordMETH(){
        System.out.print("ford: epic ");
    }
}

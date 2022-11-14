package uk.ac.rgu.topic7p1;

public class CarServiceVisitor implements CarVisitor{
    @Override
    public void visit(Car car){
        
    }

    @Override
    public void visit(Ford car) {
        car.someFordMETH();
        
    }

    @Override
    public void visit(Ferrrari car) {
        // TODO Auto-generated method stub
        car.someFerrariMETH();
    }


}

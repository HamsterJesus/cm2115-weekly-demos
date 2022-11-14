package uk.ac.rgu.topic7;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public chair getChair() {
        // TODO Auto-generated method stub
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        // TODO Auto-generated method stub
        return new ModernTable();
    }
    
}

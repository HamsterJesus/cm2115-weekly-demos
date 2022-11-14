package uk.ac.rgu.topic7;

public class AntiqueFurnitureFactory implements FurnitureFactory{

    @Override
    public chair getChair() {
        // TODO Auto-generated method stub
        return new AntiqueChair();
    }

    @Override
    public Table getTable() {
        // TODO Auto-generated method stub
        return new AntiqueTable();
    }
    
}

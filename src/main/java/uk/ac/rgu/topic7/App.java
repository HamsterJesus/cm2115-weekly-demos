package uk.ac.rgu.topic7;

public class App {
    public static void main(String[] args){
        FurnitureFactory factory = new ModernFurnitureFactory();

        chair myChair = factory.getChair();
        System.out.println(myChair.getType());

        Table myTable = factory.getTable();
        System.out.println(myTable.getType());
    }
}

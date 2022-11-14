package uk.ac.rgu.topic7p1;

public class app {
    public static void main(String[] args){
        Car[] cars = {new Ford(), new Ferrrari()};
        CarVisitor visitor = new CarServiceVisitor();

        for(Car car : cars){
            car.accept(visitor);
        }
    }
}

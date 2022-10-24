package uk.ac.rgu.topic3;

public interface CanFly {
    
    public void fly();

    default int getFlyingDistance(){
        return-1;
    }

    
}

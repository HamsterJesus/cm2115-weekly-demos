package uk.ac.rgu.topic6;

public class ForwardPrintStartegy implements PrintStrategy{

    @Override
    public void print(String[] values) {
        // TODO Auto-generated method stub
        for(String value : values){
            System.out.println(value);
        }
    }
    
}

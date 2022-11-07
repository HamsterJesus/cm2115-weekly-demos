package uk.ac.rgu.topic6;

public class VerboseLogger implements Logger{
    private int numTimesUsed = 0;

    //singleton design pattern
    //define instance as null(empty/doesn't exist)
    private static VerboseLogger instance = null; //can't be final as it needs to be assigned

    //getter method for instance
    public static VerboseLogger getInstance(){
        if(instance == null){ //check if instance exists
            instance = new VerboseLogger(); //create instance
        }
        return instance; //return instance
    }

    private VerboseLogger(){

    }

    @Override
    public void log(String message) {
        // TODO Auto-generated method stub
        System.out.println("Verbose logger: " +message);
        System.out.println(this.numTimesUsed);
    }   
    
}

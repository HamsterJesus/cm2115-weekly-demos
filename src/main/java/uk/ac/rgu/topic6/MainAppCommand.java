package uk.ac.rgu.topic6;

public class MainAppCommand implements command{
    private MainApp instance;

    //getter fo main app
    public MainAppCommand(MainApp instance){
        this.instance = instance;
    }

    //run do something(logs message)
    @Override
    public void execute(){
        instance.doSomethingCom();
    }
}

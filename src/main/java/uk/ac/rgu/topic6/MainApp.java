package uk.ac.rgu.topic6;

import javafx.scene.effect.Light.Spot;
import javafx.scene.paint.Stop;

public class MainApp {
    private Logger logger; //create instance of logger

    //setter for logger
    public void setLogger(Logger logger){
        this.logger = logger;
    }

    public void doSomething(){
        if(this.logger != null){ //if logger exists
            logger.log("I'm doing something"); //send message log
        }
    }

    //command
    private static command[] commands = new command[10];

    private String[] words = {"computing", "fish", "frog", "elbow", "lloyd"};

    public void doSomethingCom(){
        System.out.println("Im doing command stuff");
    }

    public void doSomethingStrat(){
        System.out.println("Im doing strategy stuff");
    }


    public static void main(String[] args){
        MainApp app = new MainApp();

        VerboseLogger logger = VerboseLogger.getInstance();
        app.setLogger(logger);
        app.doSomething();

        System.out.print("App2");
        MainApp app2 = new MainApp();
        VerboseLogger logger2 = VerboseLogger.getInstance();
        app2.setLogger(logger2);
        app2.doSomething();

        //command
        MainApp instance = new MainApp();
        command doSomethingCommand = new MainAppCommand(instance);
        commands[0] = doSomethingCommand;

        Computer pc = new Computer();
        commands[1] = pc::turnOn;
        commands[0].execute();
        commands[1].execute();

        //strat
        ForwardPrintStartegy s = new ForwardPrintStartegy();
        instance.printWords(s);
        System.out.println("");

        PrintStrategy s2 = (values) ->{ //can put tpe in fornt e.g. (String[] values)
            for(int i=values.length -1; i>=0; i--){
                System.out.println(values[i]);
            }
        };

        instance.printWords(s2);
    }

    public void printWords(PrintStrategy printStrategy){
        printStrategy.print(this.words);
    }
}

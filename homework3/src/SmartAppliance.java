public abstract class SmartAppliance {
    String name;
    boolean isON = false;
    boolean isWorking = false;



    public abstract void performAction();
    public abstract void stopAction();


    public void turnOn(){
        System.out.println(name + " is now on!");
        isON = true;
    }

    public void turnOff(){
        System.out.println(name + " is now off!");
        isON = false;
        isWorking = false;
    }


    
    public abstract String details();
}

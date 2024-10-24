public class Fan extends SmartAppliance implements Adjustable {

    private int speed;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public void increaseSetting() {
        if (speed < 5) {
            speed++;
            System.out.println(name + " speed set to: " + speed);
        }
        else {
            System.out.println(name + " speed is set to max!");
        }
    }

    @Override
    public void decreaseSetting() {
        if (speed > 0) {
            speed--;
            System.out.println(name + " speed set to: " + speed);
        }
        else {
            System.out.println(name + " speed is set to min!");
        }
    }

    @Override
    public void performAction(){
        if (isON){
            System.out.println(name + " is now spining! speed: " + speed);
            isWorking = true;
        }
        else {
            System.out.println(name + " :turn on the fan first!");
        }
    }

    @Override
    public void stopAction() {
        if (isON){
            System.out.println(name + " is now not spining!");
            isWorking = false;
        }
        else {
            System.out.println(name + " is off!");
        }
    }

    @Override
    public String details() {
        {
            return "{" +
                " name='" + name + "'" +
                ", isON='" + isON + "'" +
                ", isWorking='" + isWorking + "'" +
                ", speed='" + speed +  "'" +
                "}";
        }
    }

}

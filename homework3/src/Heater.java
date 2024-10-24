public class Heater extends SmartAppliance implements Adjustable{
    private int temp;

    public Heater(String name) {
        this.name = name;
    }

    @Override
    public void increaseSetting() {
            temp += 2.0;
            System.out.println(name + " temperature set to: " + temp);
    }

    @Override
    public void decreaseSetting() {
        if (temp > 0) {
            temp -= 2.0;
            System.out.println(name + " temperature set to: " + temp);
        }
    }

    @Override
    public void performAction(){
        if (isON){
            System.out.println(name + " is now heating! temperature: " + temp);
            isWorking = true;
        }
        else {
            System.out.println(name + ": turn on the heater first!");
        }
    }

    @Override
    public void stopAction() {
        if (isON){
            System.out.println(name + " is now not heating!");
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
                ", temp='" + temp +  "'" +
                "}";
        }
    }
}

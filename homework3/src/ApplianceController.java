import java.util.ArrayList;

public class ApplianceController {

    private ArrayList<Heater> heater = new ArrayList<>();
    private ArrayList<Fan> fan = new ArrayList<>();
    private ArrayList<Light> light = new ArrayList<>();


    public void addAppliance(Heater appliance) {
        heater.add(appliance);
    }
    public void addAppliance(Fan appliance) {
        fan.add(appliance);
    }
    public void addAppliance(Light appliance) {
        light.add(appliance);
    }

    public void performAllActions(){
        for (Heater smartAppliance : heater) {
            smartAppliance.performAction();
        }

        for (Fan smartAppliance : fan) {
            smartAppliance.performAction();
        }

        for (Light smartAppliance : light) {
            smartAppliance.performAction();
        }
    }

    public void stopAllActions(){
        for (Heater smartAppliance : heater) {
            smartAppliance.stopAction();
        }

        for (Fan smartAppliance : fan) {
            smartAppliance.stopAction();
        }

        for (Light smartAppliance : light) {
            smartAppliance.stopAction();
        }
    }

    public void allOn() {
        for (Heater smartAppliance : heater) {
            smartAppliance.turnOn();
        }

        for (Fan smartAppliance : fan) {
            smartAppliance.turnOn();
        }

        for (Light smartAppliance : light) {
            smartAppliance.turnOn();
        }
    }
    public void allOff() {
        for (Heater smartAppliance : heater) {
            smartAppliance.turnOff();
        }

        for (Fan smartAppliance : fan) {
            smartAppliance.turnOff();
        }

        for (Light smartAppliance : light) {
            smartAppliance.turnOff();
        }
    }

    void showStatus() {
        for (Heater smartAppliance : heater) {
            System.out.println(smartAppliance.details());
        }

        for (Fan smartAppliance : fan) {
            System.out.println(smartAppliance.details());
        }

        for (Light smartAppliance : light) {
            System.out.println(smartAppliance.details());
        }
    }
}

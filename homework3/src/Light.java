public class Light extends SmartAppliance{

    private int brightness = 100;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void performAction() {
        if (isON) {
            System.out.println(name + " is now making light! with brightness of: " + brightness);
            isWorking = true;
        }
        else {
            System.out.println(name + ": turn on the light first!");
        }
    }

    @Override
    public void stopAction() {
        if (isON) {
            System.out.println(name + " is now not making light!");
            isWorking = false;
        }
        else {
            System.out.println(name + ": the light is off!");
        }
    }

    public void setBrightness(int brightness) {
        if (brightness > 0 && brightness <= 100){
            System.out.println(name + ": brightness set toa " + brightness);
            this.brightness = brightness;
        }
        else {
            System.out.println(name + ": range if from 1 to 100");
        }
    }

    @Override
    public String details() {
        {
            return "{" +
                " name='" + name + "'" +
                ", isON='" + isON + "'" +
                ", isWorking='" + isWorking + "'" +
                ", brightness='" + brightness +  "'" +
                "}";
        }
    }


}

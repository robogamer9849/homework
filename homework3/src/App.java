public class App {
    public static void main(String[] args) throws Exception {
        ApplianceController controller = new ApplianceController();
        Heater heater1 = new Heater("heater1");
        Fan fan1 = new Fan("fan1");
        Light light1 = new Light("light1");


        System.out.println("+++++++++++++++++++++++++");
        controller.addAppliance(heater1);
        controller.addAppliance(light1);
        controller.addAppliance(fan1);
        controller.showStatus();

        System.out.println("+++++++++++++++++++++++++");
        controller.performAllActions();
        controller.showStatus();

        System.out.println("+++++++++++++++++++++++++");
        controller.allOn();
        controller.showStatus();

        System.out.println("+++++++++++++++++++++++++");
        controller.performAllActions();
        controller.showStatus();

        System.out.println("+++++++++++++++++++++++++");
        controller.stopAllActions();
        controller.showStatus();

        System.out.println("+++++++++++++++++++++++++");
        heater1.increaseSetting();
        heater1.increaseSetting();
        heater1.decreaseSetting();

        light1.setBrightness(50);
        light1.setBrightness(0);
        light1.setBrightness(500);


        fan1.increaseSetting();
        fan1.increaseSetting();
        fan1.decreaseSetting();


        controller.allOff();
        controller.showStatus();

    }
}

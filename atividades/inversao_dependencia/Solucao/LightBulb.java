//Modificação na implementação da interface Troca.

public class LightBulb implements Troca {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}
//Agora a classe LightSwitch irá depender da interface Troca e 
//, não mais, da classe LightBulb.

public class LightSwitch {
    private Troca device;

    public LightSwitch(Troca device) {
        this.device = device;
    }

    public void press() {
        if (device != null) {
            if (device.isOn()){
                device.turnOff();
            } else {
                device.turnOn();
            }
        }
    }
}
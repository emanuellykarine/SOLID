//Com a criação dessa interface, ambas as classes LightBulb e LightSwitch 
//vão depender unicamente desta. Fazendo com que nenhuma classe de alto nível
//dependa de uma de baixo nível.

public interface Troca{
    void turnOn();
    void turnOff();
}

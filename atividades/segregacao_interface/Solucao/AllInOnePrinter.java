//Agora a classe AllInOnePrinter vai implementar as três interfaces
//e assim ela só vai utilizar o método que necessitar.

public class AllInOnePrinter implements Printer, Scanner, Fax {
   @Override
    public void print() {
        // Implementação do método print
    }

    @Override
    public void scan() {
        // Implementação do método scan
    }

    @Override
    public void fax() {
        // Implementação do método fax
    }
}
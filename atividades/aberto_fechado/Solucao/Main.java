//Agora a classe principal não irá aceitar modificações diretas
//possibilitando a extensão sem modificar o código da classe Shape.

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw();       
        rectangle.draw();    
        triangle.draw();     
    }
}

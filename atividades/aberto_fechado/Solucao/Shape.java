//Para que a classe shape obedeça o princípio aberto e fechado, é necessário 
//que a classe obedeça a hierarquia. Assim, vai impossibilitar a modificação da classe
//que já existe.


//A classe Shape e o método draw foram transformados em abstratos.
public abstract class Shape {
    public abstract void draw();
}

//Classes concretas que estendem a classe Shape e chamam o método draw de acordo com a forma correspondente.
    public class drawCircle extends Shape{
        public void draw(){
            System.out.println("Drawing a circle");
        }
    }

    private class drawRectangle extends Shape {
        public void draw(){
            System.out.println("Drawing a rectangle");
        }
    }

    private class drawTriangle extends Shape {
        public void draw(){
            System.out.println("Drawing a triangle");

        }
    }

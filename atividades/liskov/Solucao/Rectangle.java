//Na classe Rectangle não haverá muitas modificações;
//pois a classe que herda e precisa ser modificada será a Square que possui
//diferenças acerca dos seus lados.

public class Rectangle {
    protected int width;
    protected int height;

// Construtor 
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //Método para acessar o width.
    public void getWidth(int width){
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Método para acessar o height.
    public void getHeight(int height){
        return height;
    }

    public int calculateArea() {
        return width * height;
    }
}

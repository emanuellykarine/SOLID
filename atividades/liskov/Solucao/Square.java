/*A classe Square agora irá herdar de Rectangle e irá aceitar
apenas um valor de comprimento, já que o quadrado difere do retângulo.*/

public class Square extends Rectangle {
    //Construtor para aceitar um único tamanho.
    public Square(int tamanho) {
       super(tamanho, tamanho);
    }

//Nos métodos abaixo há a utilização do super para evitar complicações no código
//pois alguns métodos possuem nomes iguais. 
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
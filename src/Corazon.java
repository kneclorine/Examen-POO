public class Corazon extends Figura{
    @Override
    public void draw(){
        System.out.println("La figura seleccionada tiene forma de Corazón,\n"+
        "el color de su borde es "+this.getBorderColor()+",\n"+
        "su color de fondo es "+this.getBgColor()+",\n"+
        "su posicion en el lienzo es desde X = "+this.getRectangle().getLeft()+", Y = "+this.getRectangle().getTop()+
        ", hasta X = "+ this.getRectangle().getBottom()+", Y = "+this.getRectangle().getRight()+",\n"+
        "y su tamaño es de "+this.getRectangle().getWidth()+"x"+this.getRectangle().getHeight()+".");
        System.out.println();
    }
}

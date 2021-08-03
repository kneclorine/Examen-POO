public class Heart extends Shape{
    @Override
    public void draw(){
        System.out.println("La figura seleccionada tiene forma de Corazón,\n"+
        "el color de su borde es "+this.getBorderColor()+",\n"+
        "su color de fondo es "+this.getBgColor()+",\n"+
        "su posicion en el lienzo es desde X = "+this.getRectangle().left+", Y = "+this.getRectangle().top+
        ", hasta X = "+ this.getRectangle().bottom+", Y = "+this.getRectangle().right+",\n"+
        "y su tamaño es de "+this.getRectangle().width+"x"+this.getRectangle().height+".");
        System.out.println();
    }
}

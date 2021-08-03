public class App {
    public static void main(String[] args) throws Exception {
        
        Canvas lienzo = new Canvas();

        Shape figura1 = Service.createShape(Shapes.HEART);
        lienzo.addShape(figura1, new Rectangle(new Point(0, 0) , new Point(10, 20)));

        Shape figura2 = Service.createShape(Shapes.LIGHTNING);
        lienzo.addShape(figura2, new Rectangle(new Point(0, 25) , new Point(10, 30)));
        

        Point selection = new Point(0, 0); // Punto donde hacemos click para seleccionar una figura.
        Shape selectedShape = lienzo.getSelected(selection); //Figura que se encuentre en ese punto.

        if(selectedShape != null){
            selectedShape.setBorderColor("negro");
            selectedShape.setBgColor("cyan");
            selectedShape.draw();
        }
        
        selection = new Point(7, 28);
        selectedShape = lienzo.getSelected(selection); 
        
        if(selectedShape != null){
            selectedShape.setBorderColor("azul");
            selectedShape.setBgColor("verde");
            selectedShape.draw();
        }
    }
}

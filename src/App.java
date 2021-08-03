public class App {
    public static void main(String[] args) throws Exception {
        
        Canvas canvas = new Canvas();

        Shape shape1 = Service.createShape(Shapes.HEART);
        canvas.addShape(shape1, new Rectangle(new Point(0, 0) , new Point(10, 20)));

        Shape shape2 = Service.createShape(Shapes.LIGHTNING);
        canvas.addShape(shape2, new Rectangle(new Point(0, 25) , new Point(10, 30)));
        

        Point selection = new Point(0, 0); // Punto donde hacemos click para seleccionar una figura.
        Shape selectedShape = canvas.getSelected(selection); //Figura que se encuentre en ese punto.

        if(selectedShape != null){
            selectedShape.setBorderColor("negro");
            selectedShape.setBgColor("cyan");
            selectedShape.draw();
        }
        
        selection = new Point(7, 28);
        selectedShape = canvas.getSelected(selection); 
        
        if(selectedShape != null){
            selectedShape.setBorderColor("azul");
            selectedShape.setBgColor("verde");
            selectedShape.draw();
        }
    }
}

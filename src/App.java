public class App {
    public static void main(String[] args) throws Exception {
        
        Canvas canvas = new Canvas();

        SizeShape shape1 = Service.createShape(Shapes.HEART);
        canvas.addShape(shape1, new Rectangle(new Point(0, 0) , new Point(10, 20)));

        SizeShape shape2 = Service.createShape(Shapes.LIGHTNING);
        canvas.addShape(shape2, new Rectangle(new Point(0, 25) , new Point(10, 30)));
        

        Point selection = new Point(0, 0); // Punto donde hacemos click para seleccionar una figura.
        SizeShape selectedShape = canvas.getSelected(selection); //Figura que se encuentre en ese punto.
        ColorShape selectedColorShape = (Shape) selectedShape;
        DrawShape selectedDrawShape = (Shape) selectedColorShape;

        if(selectedShape != null){
            selectedColorShape.setBorderColor("negro");
            selectedColorShape.setBgColor("cyan");
            selectedDrawShape.draw();
        }
        
        selection = new Point(7, 28);
        selectedShape = canvas.getSelected(selection); 
        selectedColorShape = (Shape) selectedShape;
        selectedDrawShape = (Shape) selectedColorShape;

        if(selectedShape != null){
            selectedColorShape.setBorderColor("azul");
            selectedColorShape.setBgColor("verde");
            selectedDrawShape.draw();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        AddShapeToCanvas AddShapeToCanvas = new Canvas();

        SizeShape shape1 = Service.createShape(Shapes.HEART);
        AddShapeToCanvas.addShape(shape1, new Rectangle(new Point(0, 0) , new Point(10, 20)));

        SizeShape shape2 = Service.createShape(Shapes.LIGHTNING);
        AddShapeToCanvas.addShape(shape2, new Rectangle(new Point(0, 25) , new Point(10, 30)));
        
        GetSelectedShapeInCanvas getSelectedShapeInCanvas = (Canvas) AddShapeToCanvas;

        Point selection = new Point(0, 0); // Punto donde hacemos click para seleccionar una figura.
        SizeShape selectedShape = getSelectedShapeInCanvas.getSelected(selection); //Figura que se encuentre en ese punto.
        ColorShape selectedColorShape = (Shape) selectedShape;
        DrawShape selectedDrawShape = (Shape) selectedColorShape;

        if(selectedShape != null){
            selectedColorShape.setBorderColor("negro");
            selectedColorShape.setBgColor("cyan");
            selectedDrawShape.draw();
        }
        
        selection = new Point(7, 28);
        selectedShape = getSelectedShapeInCanvas.getSelected(selection); 
        selectedColorShape = (Shape) selectedShape;
        selectedDrawShape = (Shape) selectedColorShape;

        if(selectedShape != null){
            selectedColorShape.setBorderColor("azul");
            selectedColorShape.setBgColor("verde");
            selectedDrawShape.draw();
        }
    }
}

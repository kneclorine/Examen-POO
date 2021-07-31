public class App {
    public static void main(String[] args) throws Exception {
        
        Lienzo lienzo = new Lienzo();

        Figura figura1 = Servicio.createShape("CORAZON");
        lienzo.addShape(figura1, new Rectangle(new Point(0, 0) , new Point(10, 20)));

        Figura figura2 = Servicio.createShape("RAYO");
        lienzo.addShape(figura2, new Rectangle(new Point(0, 25) , new Point(10, 30)));
        

        Point selection = new Point(0, 0); // Punto donde hacemos click para seleccionar una figura.
        Figura selectedShape = lienzo.getSelected(selection); //Figura que se encuentre en ese punto.

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

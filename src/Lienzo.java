import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    private List<Figura> shapes = new ArrayList<Figura>();

    public List<Figura> getShapes(){
        return this.shapes;
    }

    public void addShape(Figura shape, Rectangle rectangle){
        shape.setRectangle(rectangle);
        this.shapes.add(shape);
    }

    public Figura getSelected(Point point){
        for(Figura shape : shapes){
            if(point.getX() >= shape.getRectangle().getLeft() && point.getX()<=shape.getRectangle().getBottom()
            && point.getY() >= shape.getRectangle().getTop() && point.getY() <= shape.getRectangle(). getRight()){
                return shape;
            }
        }
        return null;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Shape> shapes = new ArrayList<Shape>();

    public List<Shape> getShapes(){
        return this.shapes;
    }

    public void addShape(Shape shape, Rectangle rectangle){
        shape.setRectangle(rectangle);
        this.shapes.add(shape);
    }

    public Shape getSelected(Point point){
        for(Shape shape : shapes){
            if(point.x >= shape.getRectangle().left && point.x<=shape.getRectangle().bottom
            && point.y >= shape.getRectangle().top && point.y <= shape.getRectangle().right){
                return shape;
            }
        }
        return null;
    }
}
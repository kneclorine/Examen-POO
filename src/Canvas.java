import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<SizeShape> shapes = new ArrayList<SizeShape>();

    public List<SizeShape> getShapes(){
        return this.shapes;
    }

    public void addShape(SizeShape shape, Rectangle rectangle){
        shape.setRectangle(rectangle);
        this.shapes.add(shape);
    }

    public SizeShape getSelected(Point point){
        for(SizeShape shape : shapes){
            if(point.x >= shape.getRectangle().left && point.x<=shape.getRectangle().bottom
            && point.y >= shape.getRectangle().top && point.y <= shape.getRectangle().right){
                return shape;
            }
        }
        return null;
    }
}
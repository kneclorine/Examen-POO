import java.util.ArrayList;
import java.util.List;

public class Canvas implements AddShapeToCanvas, GetSelectedShapeInCanvas{
    public final List<SizeShape> shapes = new ArrayList<SizeShape>();

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
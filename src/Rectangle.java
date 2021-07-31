public class Rectangle {
    private final int left;
    private final int right;
    private final int top;
    private final int bottom;
    private final int height;
    private final int width;

    public Rectangle(Point start, Point end){
        this.left = start.getX();
        this.right = end.getY();
        this.top = start.getY();
        this.bottom = end.getX();
        this.width = this.bottom > this.left ? this.bottom - this.left : this.left - this.bottom;
        this.height = this.right > this.top ? this.right - this.top : this.top - this.right;
    }

    public int getLeft(){
        return this.left;
    }

    public int getRight(){
        return this.right;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

public class Rectangle {
    public final int left;
    public final int right;
    public final int top;
    public final int bottom;
    public final int height;
    public final int width;

    public Rectangle(Point start, Point end){
        this.left = start.x;
        this.right = end.y;
        this.top = start.y;
        this.bottom = end.x;
        this.width = this.bottom > this.left ? this.bottom - this.left : this.left - this.bottom;
        this.height = this.right > this.top ? this.right - this.top : this.top - this.right;
    }
}

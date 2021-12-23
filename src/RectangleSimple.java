public abstract class RectangleSimple extends ZoneRectangulaire {

    public RectangleSimple(int width, int height) {
        super(width, height);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}


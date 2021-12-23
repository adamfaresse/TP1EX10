public abstract class ZoneRectangulaire {
    private int width;
    private int height;
    protected int x = 0;
    protected int y = 0;


    public ZoneRectangulaire(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void setX(int x);
    public abstract void setY(int y);
    abstract void affiche();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


}

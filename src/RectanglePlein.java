public class RectanglePlein extends RectangleSimple {

    public RectanglePlein(int width, int height) {
        super(width, height);
    }

    @Override
    void affiche() {
        System.out.println("Rectangle " + this.getWidth() + "*" + this.getHeight()
                + " en " + "(" + this.getX() + "," + this.getY() + ")");
    }
}


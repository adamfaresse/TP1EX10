public class AgregatVertical extends Agregat {

    public AgregatVertical(ZoneRectangulaire zoneFirst, ZoneRectangulaire zoneSeconde) {
        super(Math.max(zoneFirst.getWidth(), zoneSeconde.getWidth()),zoneFirst.getHeight() + zoneSeconde.getHeight(), zoneFirst, zoneSeconde);
        zoneSeconde.setY(zoneFirst.getHeight());
    }

    @Override
    void affiche() {
        zoneFirst.affiche();
        zoneSecond.affiche();
    }

    @Override
    public void setX(int x) {
        this.x = x;
        zoneFirst.setX(x);
        zoneSecond.setX(zoneSecond.getX() + x);

    }

    @Override
    public void setY(int y) {
        this.y = y;
        zoneFirst.setY(y);
        zoneSecond.setY(zoneSecond.getY() + y);
    }
}

public abstract class Agregat extends ZoneRectangulaire {
    ZoneRectangulaire zoneFirst;
    ZoneRectangulaire zoneSecond;

    public Agregat(int width, int height, ZoneRectangulaire zoneFirst, ZoneRectangulaire zoneSecond) {
        super(width, height);
        this.zoneFirst = zoneFirst;
        this.zoneSecond = zoneSecond;
    }
}

public class Main {
    public static void main(String[] args) {
        RectanglePlein r = new RectanglePlein(10, 20);
        RectangleVide z1 = new RectangleVide(30, 25);
        RectangleVide z2 = new RectangleVide(40, 20);
        RectanglePlein e = new RectanglePlein(25, 35);
        Agregat c1 = new AgregatVertical(r, z1); // largeur:40, hauteur:25
        Agregat c2 = new AgregatVertical(z2, e); // largeur:65, hauteur:35
        Agregat c3 = new AgregatVertical(c1, c2); // largeur:65, hauteur:60
        c3.affiche(); // Affiche: Rectangle 10*20 en (0,0) Rectangle 25*35 en (0,65)
    }
}
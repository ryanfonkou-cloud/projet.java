class Point {
    double x, y;

    // Constructeur avec paramètres
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur par copie
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Constructeur par défaut
    Point() {
        this.x = 0;
        this.y = 0;
    }

    void afficher() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    double distance(Point p) {
        return Math.sqrt(
            (this.x - p.x) * (this.x - p.x) +
            (this.y - p.y) * (this.y - p.y)
        );
    }

    void deplacer(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
}

public class TestPoint {
    public static void main(String[] arguments) {

        Point p1 = new Point(3, 1);      // création
        Point p2 = new Point();          // (0,0)
        Point p3 = new Point(p1);        // copie de p1

        System.out.print("P2 : ");
        p2.afficher();                   // (0,0)

        p3.afficher();                   // (3,1)

        System.out.println(p1.distance(p2)); // distance

        p3.deplacer(-3, -2);             // déplacement
        p3.afficher();                   // (0,-1)
    }
}

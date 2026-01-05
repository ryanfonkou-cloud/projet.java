class Division {

    // 1️⃣ Méthode d’instance
    double diviserInstance(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro");
            return 0;
        }
        return a / b;
    }

    // 2️⃣ Méthode de classe (statique)
    static double diviserClasse(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro");
            return 0;
        }
        return a / b;
    }
}

public class TestDivision {
    public static void main(String[] args) {

        // Test méthode d’instance
        Division d = new Division();
        double r1 = d.diviserInstance(10, 2);
        System.out.println("Division (instance) : " + r1);

        // Test méthode de classe
        double r2 = Division.diviserClasse(10, 2);
        System.out.println("Division (classe) : " + r2);
    }
}

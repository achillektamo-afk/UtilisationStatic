class Etudiant {
    private String nom;
    private int age;
    private static int nombreEtudiant = 0;

    public Etudiant(String nom) {
        this.nom=nom;
        nombreEtudiant++;
    }

    public static int getNombre() {
        return nombreEtudiant;
    }
}


public class Main {
    public static void main(String[] args) {

        Etudiant c1 = new Etudiant("Achille");
        Etudiant c2 = new Etudiant("Alex");
        Etudiant c3 = new Etudiant("Marie");

        System.out.println("Le nombre d'etudiants créé est "+Etudiant.getNombre());



    }
}

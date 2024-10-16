package staticKeyword;

public class Elev {
    public String nume;
    public String prenume;
    public static String scoala = "Gheorghe Dima";
    public static int nrElevi = 0;

    public Elev(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        nrElevi++;
    }

    public void prezenta() {
        System.out.println("Numele este:" + nume);
        System.out.println("Prenumele este:" + prenume);
        System.out.println("Scoala este:" + scoala);
        System.out.println("Numarul de elevi de la scoala este:" + nrElevi);
    }

}

package obiectConstructor;

import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public class Masina {
    //constructor=are ca rol sa initieze variabilele unei clase
    //recunoaste, un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este "public"
    //intr-o clasa putem avea mai multi constructori care se diferentiaza rin numarul/tipuri de parametri
    //o clasa contine intotdeauna un constructor DEFAULT (ce nu are parametri)

    //obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multe obiecte care sa aiba valori diferite pentru proprietati
    //in momentul care avem un obiect de tipul unei clase putem accesa variabilele/metodele din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"!!!
    //structura: tipObiect numeObiect = new tipObiect(); (-- Masina Dacia =  new Masina (); --)


    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul fabricatiei este " + an);
        System.out.println("Culoarea: " + culoare);
        for (int index = 0; index < dotariInterioare.size(); index++) {
            System.out.println(dotariInterioare.get(index));
        }
        System.out.println("Motorizare: " + motorizare);
        calculPret();
    }

    //determinam impozitul in functie de anul de fabricatie
    //<2000->500 RON
    //2005-2015->300RON
    //<2020->100RON
    public void calculImpozit() {
        if (an <= 2000) {
            System.out.println("Impozitul pe masina este 500 RON");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("Impozitul este 300 RON");
        } else if (an >= 2020) {
            System.out.println("Impozitul este 100 RON");
        }
    }

    //determinam pretul standard si pretul final in functie de dotarile masinii
    public void calculPret() {
        if (pret != 0) {
            System.out.println("Pretul de pornire: " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("Pretul final este: " + pret);
        } else {
            int dotari = 0;
            for (int index = 0; index < dotariInterioare.size(); index++) {
                switch ((dotariInterioare).get(index)) {
                    case "-Radio":
                        dotari = dotari + 1000;
                        break;
                    case "-Airbag":
                        dotari = dotari + 800;
                        break;
                    case "-Aer conditionat":
                        dotari = dotari + 1500;
                        break;
                    case "-Navigatie":
                        dotari = dotari + 3000;
                        break;
                }
            }
            System.out.println("Pretul dotarilor este " + dotari);
            pretFinal = pret + dotari;
            System.out.println("Pretul final: " + pretFinal);
        }
    }

    public void calculReducere(int procentReducere) {
//        pretFinal = (100 - procentReducere) * pretFinal;
        int reducere = (pretFinal * procentReducere) / 100;
        pretFinal = pretFinal - reducere;
        System.out.println("S-a aplicat o reducere de " + procentReducere + "din pretul final.");
        System.out.println("Pretul final cu reducere este:" + pretFinal);
    }
}
//definire sportiv:
//capitan: boolean
//sport de echipa
//sport individual
//pozitie in echipa
//bonusul este in functie de sportiv
//facem un mix de sportivi cu situatii reale
//saaaaau cantina: felul 1+2+3+bautura etc
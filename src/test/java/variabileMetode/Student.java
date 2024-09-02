package variabileMetode;

import org.testng.annotations.Test;

public class Student {

    //clasa =sablon care defineste comportamentul unei entitati din viata reala
    //intr-un fisier Java, clasa este recunoscuta dupa cuvantul cheie "class"
    //este obligatoriu ca o clasa sa aiba un nume
    //intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora (nu se face asa ceva)
    //o clasa contine variabile si metode
    //variabila = proprietatea unei clase
    //variabila este de 2 feluri: globala si locala
    //variabila globala = se defineste la inceputul clase si are vizibilitate asupra intregului fisier
    //variabila locala = variabila definita intr-o metoda ce are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina un Access Control (ublic), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare (=> by default)

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean restante;

    //metoda = actiunea unei clase
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina: Access control (public) void + numeMetoda + () + {}
//concatenare = lipirea mai multor stringuri
   //println = afiseaza valoarea si ramane e randul curent
    //print = afiseaza valoarea si sare la randul urmator


    @Test
    public void PrezentareStudent () {
        nume = "Mirza";
        prenume = "Adela Raluca";
        varsta = 35;
        inaltime = 1.65;
        greutate = 80.0f;
        adresa = "Principala 130B, cod 407272";
        sex = 'f';
        restante = true;

//        System.out.println(nume+" "+prenume+" "+varsta+" ");
        System.out.println("Numele studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Inaltimea studentului este "+inaltime);
        System.out.println("Greutatea studentului este "+greutate);
        System.out.println("Adresa studentului este "+adresa);
        System.out.println("Sexul studentului este "+sex);
        System.out.println("Are restante studentul? "+restante);
    }


}

package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //In programare exista 2 tipuri de structuri: alternative si repetitive
    //Structuri alternative: if...then...else / switch...case

    @Test
    public void metodaTest (){
        //verificaPersoanaMajora(19);
        //verificaPersoanaMajora(17);
        //verificaPersoanaMajora(18);
//        verificNumarPar(-10);
//        verificNumarPar(11);
//        verificNumarPar(0);
//        verificNumarPar(10);
//        verificaNumarDivizibil(5);
//        verificaNumarDivizibil(6);
        zileleSaptamanii(8);
    }

    //Metoda ce verifica daca o persoana este majora:
    public void verificaPersoanaMajora (int varsta) {
        if (varsta >=18) {
            System.out.println("Persoana cu varsta de "+varsta+" ani este majora.");
        }else {
            System.out.println("Persoana cu varsta de "+varsta+" ani este minora.");
        }
    }

    //Verifica daca un numar este par
    //daca vrem catul unei impartiri => / (divide - div)
    //daca vrem restul unei impartiri => % (modulo - mod)
    public void verificNumarPar(int numar){
        if(numar > 0){
            {
                if(numar % 2==0) {
                    System.out.println("Numarul "+numar + " este pozitiv si par.");
                }else {
                    System.out.println("Numarul "+numar + " este pozitiv si impar.");
                }
            }
            System.out.println("Numarul "+numar+" este par");
        }else if (numar < 0){
            if(numar % 2==0) {
                System.out.println("Numarul "+numar + " este negativ si par.");
            }else {
                System.out.println("Numarul "+numar + " este negativ si impar.");
        }
            System.out.println("Numarul "+numar+" este impar");
        }else {
            System.out.println("Numarul "+numar+" este egal cu 0");
        }
    }

    //Verifica daca un numar este pozitiv si divizibil cu 5
    public void verificaNumarDivizibil (int nr) {
        if (nr % 5==0 && nr > 0) {
            System.out.println("Numarul "+nr+" este divibil cu 5 si este pozitiv.");
        }else{
            System.out.println("Numarul "+nr+" nu este divibil cu 5.");
        }
    }

    //Afisam zilele saptamanii
    public void zileleSaptamanii(int zi){
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Astazi nu este o zi a saptamanii");
        }
    }
}

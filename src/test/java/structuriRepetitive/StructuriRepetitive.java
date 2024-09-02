package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive: for/while/foreach/do...while

    @Test
    public void metodaTest(){
//    afisareNumereFor(50);
//    afisamNumereWhile(50);
    afisamNumerePare(50);
    }

    //afisam primele n numere
    public void afisareNumereFor (int capat) {
        for (int index=0; index<capat; index++) {
            System.out.println("Vreau sa afisez numarul "+index);
        }
    }

    //afisam primele n numere - while
    public void afisamNumereWhile (int capat) {
        int index=0;
        while (index<capat) {
            System.out.println("Vreau sa afisez numarul "+index);
            index++;
        }
    }

    //afisam numerele pare de la 0 la 50
    public void afisamNumerePare (int capat) {
        for (int index=0; index<=capat; index++) {
            if (index % 2 == 0){
                System.out.println("Vreau sa afisez numarul "+index);
                System.out.printf("");
            }
        }
    }
}

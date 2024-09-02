package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {
    @Test
    public void testMasinaMethod() {
//        Masina Dacia = new Masina("Dacia", "Logan", 2015, "alb",
//                Arrays.asList("-Aer conditionat", "-Airbag", "-Radio", "-Usi"), "benzina");
//        Dacia.prezentareMasina();
//        Dacia.calculImpozit();
//        System.out.println();
//
//        Masina viitoare = new Masina("Mazda", "Sportage", 2000, "neagra",
//                Arrays.asList("-Aer conditionat", "-Airbag", "-CD modern", "Cupe mobil"), "hibrid");
//        viitoare.prezentareMasina();
//        viitoare.calculImpozit();
//        System.out.println();

        Masina platita = new Masina("Skoda", "Elegance", 2020, "neagra",
                Arrays.asList("-Aer conditionat", "-Airbag", "-CD modern", "Cupe mobil"), "hibrid", 20000);
        platita.prezentareMasina();
        platita.calculImpozit();
//        platita.pretFinal(10);
    }
}

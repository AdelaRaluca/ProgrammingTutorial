package multimiCollections;

import org.testng.annotations.Test;

import java.util.*;

public class Collections {
//multimi: Array, List, Set, Map

    @Test
    public void test() {
//cursantiArray();
//    cursantiList();
//    masiniArray();
//    masiniList();
//    mapExample();
//    tariOrase();
        caietRetete();
    }

    //afisam cursantii de la cursul de automation
    public void cursantiArray() {
        String[] cursanti = new String[6];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Andrei";
        cursanti[3] = "Marie";
        cursanti[4] = "Rosa";
        cursanti[5] = "Andrei";
//    for (int index = 0; index <= 4; index++) {
//        System.out.println("Numele cursantului este " + cursanti[index]);}
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }
    }

    //v2-List
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Andrei");
        cursanti.add("Marie");
        cursanti.add("Rosa");
        cursanti.add("Andrei");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));
        }
    }

    //definim o multime de masini din care afisam masinile de pe pozitiile impare
    public void masiniArray() {
        String[] masini = new String[6];
        masini[0] = "Mazda";
        masini[1] = "Daewoo";
        masini[2] = "Renault";
        masini[3] = "MG";
        masini[4] = "Mimo";
        masini[5] = "Peugeot";
        for (int index = 0; index < masini.length; index++) {
            System.out.println("Aceasta este " + masini[index]);
        }
    }

    public void masiniList() {
        List<String> masini = new ArrayList<>();
        masini.add("Mazda");
        masini.add("Daewoo");
        masini.add("Renault");
        masini.add("MG");
        masini.add("Mimo");
        masini.add("Peugeot");
        for (int index = 0; index < masini.size(); index++) {
            if (index % 2 != 1) {
                System.out.println("Numele acestei masini este " + masini.get(index));
            }
        }
    }

    //map: key=value
    //parcurgerea se face pe baza cheilor (folosing un set)
    //nu se pot avea key duplicate
    //cheia trebuie sa fie unica!!!
    public void mapExample() {
        Map<String, String> elemente = new HashMap<>();
        elemente.put("masina", "Skoda");
        elemente.put("cursant", "Rares");
        elemente.put("telefon", "Samsung");
        for (String key : elemente.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + elemente.get(key));
        }
    }

    //map: key=value1,value2,value3...
    public void tariOrase() {
        Map<String, List<String>> elemente2 = new HashMap<>();

        List<String> oraseRo = Arrays.asList("Cluj", "Alba-Iulia", "Timisoara");
        List<String> oraseIT = Arrays.asList("Milano", "Roma", "Geneva");
        List<String> oraseSP = Arrays.asList("Alicante", "Cadiz", "Valencia");

        elemente2.put("Romania", oraseRo);
        elemente2.put("Italia", oraseIT);
        elemente2.put("Spania", oraseSP);

        for (String key : elemente2.keySet()) {
            System.out.println("Tara este " + elemente2);
            System.out.println("Orasele sunt " + elemente2.get(key));
        }
    }

    //tema -> exemplu complet tari orase capitale - multiple layers
    //ingrediente pentru retete de mancare
    public void caietRetete() {
        Map<String, List<String>> ingrediente = new HashMap<>();
        List<String> ingredienteSupaPui = Arrays.asList("Carne de pui", "Taitei", "Legume", "Apa");
        List<String> ingredienteSarmale = Arrays.asList("Varza", "Carne", "Orez", "Afumatura");
        List<String> ingredienteDesert = Arrays.asList("Faina", "Zahar", "Oua", "Branza");

        ingrediente.put("supaPui", ingredienteSupaPui);
        ingrediente.put("sarmale", ingredienteSarmale);
        ingrediente.put("desert", ingredienteDesert);

        for (String key : ingrediente.keySet()) {
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele sunt " + ingrediente.get(key));
        }
    }
}

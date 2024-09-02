package teme;

import org.testng.annotations.Test;

import java.util.*;

public class TariOraseMuntiApe {

    @Test
    public void test() {
//        tomaList();
        tomaMap();
    }

    public void tomaList() {
        Map<String, List<String>> tara = new HashMap<>();
        List<String> infoRomania = Arrays.asList("Capitala: Bucuresti", "Munti: Carpati", "Ape: Dunarea");
        List<String> infoFranta = Arrays.asList("Capitala: Paris", "Munti: Alpi", "Ape:Sena");
        List<String> infoGermania = Arrays.asList("Capitala: Berlin", "Munti:Alpi", "Ape: Rin");

        tara.put("Romania", infoRomania);
        tara.put("Franta", infoFranta);
        tara.put("Germania", infoGermania);

        for (String key : tara.keySet()) {
            System.out.println("Aceasta tara este " + key);
            System.out.println("Informatii despre aceasta tara avem " + tara.get(key));
        }

    }

    public void tomaMap() {
        //Creare Map pentru tari
        Map<String, Map<String, List<String>>> taraMap = new HashMap<>();
        //adaugare Map pentru Romania si info
        Map<String, List<String>> roMap = new HashMap<>();
        List<String> infoRo = new ArrayList<>();
        infoRo.add("Carpati");
        infoRo.add("Dunarea");
        roMap.put("Bucuresti", infoRo);
        taraMap.put("Romania", roMap);

        //adaugare Map pentru Franta si info
        Map<String, List<String>> frMap = new HashMap<>();
        List<String> infoFr = new ArrayList<>();
        infoFr.add("Alpi");
        infoFr.add("Sena");
        frMap.put("Paris", infoFr);
        taraMap.put("Franta", frMap);

        //adaugare Map pentru Germania si info
        Map<String, List<String>> gerMap = new HashMap<>();
        List<String> infoGer = new ArrayList<>();
        infoGer.add("Muntii Padurea Neagra");
        infoGer.add("Rin");
        gerMap.put("Berlin", infoGer);
        taraMap.put("Germania", gerMap);

        //accesare a valorilor
        for (String tara : taraMap.keySet()) {
            System.out.println("Tara: " + tara);
            Map<String, List<String>> capitaleMap = taraMap.get(tara);

            for (String capitala : capitaleMap.keySet()) {
                List<String> info = capitaleMap.get(capitala);
                String munti = info.get(0);
                String ape = info.get(1);
                System.out.println(" Capitala: " + capitala + "; Munti: " + munti + "; Ape: " + ape + ";");
                System.out.println();
            }
        }
//        for (String key : taraMap.keySet()) {
//            System.out.println("Tara este " + key);
//            System.out.println("Informatii despre aceasta tara sunt " + taraMap.get(key));
//        }
    }


}

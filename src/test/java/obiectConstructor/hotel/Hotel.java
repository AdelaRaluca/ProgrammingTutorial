package obiectConstructor.hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int numarEtaje;
    public List<String> facilitati;

    public Hotel() {
        nume = "Imperial House";
        adresa = "Str.Principala 130B";
        tara = "Romania";
        oras = "Cluj-Napoca";
        stele = "****";
        micDejun = true;
        numarCamere = 60;
        numarEtaje = 6;
        facilitati = Arrays.asList("Wifi", "Hartie igienica", "TV", "Mini-bar", "Loc de Parcare");
    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Tara hotelului este: " + tara);
        System.out.println("Oras hotelului este: " + oras);
        System.out.println("Numar stele hotelului este: " + stele);
        System.out.println("Mic dejun inclus: " + micDejun);
        System.out.println("Numar camere: " + numarCamere);
        System.out.println("Numar etaje: " + numarEtaje);
        System.out.println("Facilitati: " + facilitati);
    }

    public void pretOferta(HashMap<String, String> oferta) {
        System.out.println("Pretul de pornire este" + pretPornire);
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta cu valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale
                String[] parts = oferta.get(optiune).trim();
                int number = Integer.parseInt(parts[0]);

            }

        }
    }
}

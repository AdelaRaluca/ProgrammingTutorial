package accessControl;

public class Masina {

    public void metodaPublica() {

    }

    private void metodaPrivata() {

    }

    protected void metodaProtected() {

    }

    void metodaDefault() {

    }
    //public = vizibilitate in tot proiectul indiferent daca vorbim de mostenire/obiect;
    //private = vizibilitate in interiorul clasei;
    //default = vizibilitate in pachetul definit daca vorbim de mostenire/obiect;
    //        = nu este vizibilitate in momentul cand am iesit din pachet indiferent la nivel de mostenire/obiect;
    //protected = vizibilitate in interiorul pachetului/alt pachet cand vine vorba de mostenire;
    //          = vizibilitate in interiorul pachetului cand vine vorba de obiect;
    //          = nu este vizibilitate intr-un alt pachet cand vine vorba de obiect;
}

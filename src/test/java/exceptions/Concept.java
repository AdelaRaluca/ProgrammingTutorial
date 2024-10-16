package exceptions;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concept {

    @Test
    public void testMethod() throws FileNotFoundException {
//        printFile();
//        afisareColegi();
//        verificaVarsta(15);
        printFileV2();
    }

    public void printFile() {
        //checked
        String filePath = "E://fisier.txt";
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("A intrat pe ramura de Try! Fisierul exista");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe ramura de Catch! Fisierul nu exista");
        } finally {
            System.out.println("A intrat pe ramura de Finally! INDIFERENT daca a mers sau nu pe Catch tot se apeleaza si Finally");
        }
    }

    public void afisareColegi() {
        //unchecked
        String[] Colegi = new String[2];
        Colegi[0] = "Magda";
        Colegi[1] = "Rares";
        Colegi[2] = "Alex";

        for (int index = 0; index < Colegi.length; index++) {
            System.out.println("Numele colegului este" + Colegi[index]);
        }
    }

    public void verificaVarsta(int varsta) {
        //throw
        if (varsta < 18) {
            throw new RuntimeException("Persoana este minora");
        } else {
            System.out.println("Persoana e majora");
        }
    }

    public void printFileV2() throws FileNotFoundException {
        //throws
        String filePath = "E://fisier.txt";
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);

    }
}

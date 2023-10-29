package org.example;

import org.example.Departement;
import org.example.Employe;
import org.example.SocieteHashMap;

public class Main {
    public static void main(String[] args) {
        SocieteHashMap societeHashMap =new SocieteHashMap();
        Departement d1 = new Departement(1,"dp1");
        Departement d2 = new Departement(2,"dp1");
        Departement d3 = new Departement(3,"dp3");
        Employe e1 = new Employe("09643392",1,"feres","ben aissa");
        Employe e2 = new Employe("09643393",1,"feres","ben aissa");
        Employe e3 = new Employe("09643396",1,"feres","ben aissa");
        Employe e4= new Employe("19643392",1,"feres","ben aissa");
        Employe e5= new Employe("08643392",1,"feres","ben aissa");
        Employe e6= new Employe("08643392",1,"feres","ben aissa");

        societeHashMap.ajouterEmployeDepartement(e1,d1);
        societeHashMap.ajouterEmployeDepartement(e2,d1);
        societeHashMap.ajouterEmployeDepartement(e3,d1);
        societeHashMap.ajouterEmployeDepartement(e4,d2);
        societeHashMap.ajouterEmployeDepartement(e5,d2);

        societeHashMap.afficherLesDepartements();
        societeHashMap.afficherLesEmployes();
        societeHashMap.afficherLesEmployesLeursDepartements();
        societeHashMap.afficherDepartement(e1);
        societeHashMap.afficherDepartement(e6);


    }
}
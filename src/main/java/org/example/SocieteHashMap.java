package org.example;

import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe,Departement> hashMapSociete = new HashMap<>();
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hashMapSociete.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hashMapSociete.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        hashMapSociete.forEach(
                (e,d)->
                {
                    System.out.println(e);
                    System.out.println(d);
                }
        );
    }

    @Override
    public void afficherLesEmployes() {
        hashMapSociete.forEach(
                (e,d)->
                {
                    System.out.println(e);
                }
        );
        //        for (org.example.Employe e : hashMapSociete.keySet())
        //            System.out.println(e);
    }

    @Override
    public void afficherLesDepartements() {
        hashMapSociete.forEach(
                (e,d)->
                {
                    System.out.println(d);
                }
        );
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(hashMapSociete.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return hashMapSociete.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return hashMapSociete.containsValue(d);
    }
}

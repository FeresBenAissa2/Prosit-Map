package org.example;

import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe,Departement> treeMapSociete = new TreeMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        treeMapSociete.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        treeMapSociete.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        treeMapSociete.forEach(
                (e,d)->
                {
                    System.out.println(e);
                    System.out.println(d);
                }
        );
    }

    @Override
    public void afficherLesEmployes() {
        treeMapSociete.forEach(
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
        treeMapSociete.forEach(
                (e,d)->
                {
                    System.out.println(d);
                }
        );
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(treeMapSociete.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return treeMapSociete.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return treeMapSociete.containsValue(d);
    }
}

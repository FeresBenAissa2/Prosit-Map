package org.example;

import java.util.Collection;
import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int identifiant;
    private String nom;

    public Departement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return identifiant == that.identifiant && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifiant, nom);
    }

    @Override
    public int compareTo(Departement o) {
        return this.identifiant-o.getIdentifiant();
    }
}

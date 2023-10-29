package org.example;

import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private String cin;
    private int matricule;
    private String nom;
    private String  prenom;

    public Employe (){
        this.cin = "0";
        this.matricule = 0;
        this.nom = "";
        this.prenom = "";
    }
    public Employe(String cin, int matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "org.example.Employe{" +
                "cin='" + cin + '\'' +
                ", matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return matricule == employe.matricule && Objects.equals(cin, employe.cin) && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, matricule, nom, prenom);
    }

    @Override
    public int compareTo(Employe o) {
        return this.cin.compareTo(o.getCin());
    }
}

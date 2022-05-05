package net.niksune.TestSpring.beans;

public class Animal {

    private int ID;
    private String nom;
    private String espece;
    private int age;

    public Animal(int ID, String nom, String espece, int age) {
        this.ID = ID;
        this.nom = nom;
        this.espece = espece;
        this.age = age;
    }

    public Animal() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package main.java.com.example;

public class Estacio {
    private int ID;
    private String Nom;
    private String Adreça;
    private String Horari;

    @Override
    public String toString() {
        return "Estacio [ID=" + ID + ", Nom=" + Nom + ", Adreça=" + Adreça + ", Horari=" + Horari + "]";
    }

    public Estacio(int iD, String nom, String adreça, String horari) {
        ID = iD;
        Nom = nom;
        Adreça = adreça;
        Horari = horari;
    }
    
    public int getID() { return ID;}
    public String getNom() {return Nom;}
    public String getAdreça() {return Adreça;}
    public String getHorari() {return Horari;}


    public void setID(int iD) {
        ID = iD;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public void setAdreça(String adreça) {
        Adreça = adreça;
    }
    public void setHorari(String horari) {
        Horari = horari;
    }
}

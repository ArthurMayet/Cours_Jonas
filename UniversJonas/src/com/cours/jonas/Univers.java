package com.cours.jonas;

import java.util.ArrayList;

public class Univers {
    String taille = "infini";
    int nombre = 1;
    ArrayList<Galaxy> galaxyArrayList;

    public Univers(String taille, int nombre){
        this.taille = taille;
        this.nombre = nombre;
    }
    public String getNombre() {
        return "Il n'en existe a l'heure actuelle qu' " + this.nombre + "seul et unique";
    }

    public String getTaille() {
        return "Notre univers a une taille" + this.taille +
                "meme si on dit qu'il s'étend (alors dans quoi s'étend-il. héhé)";
    }

    public ArrayList<Galaxy> getGalaxy() {
        return galaxyArrayList;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Univers {
    String taille = "infini";
    int nombre = 1;
    ArrayList<Galaxy> galaxyArrayList;
    //difference???
    //List<Galaxy> galaxyList = new ArrayList<>();

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

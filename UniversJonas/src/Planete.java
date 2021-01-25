public class Planete {
    String name;
    long nombreHabitant;
    int diametre;
    int nombreSateliteNaturel;
    int distanceEtoile;

    public Planete(String name, long nombreHabitant, int diametre, int nombreSateliteNaturel, int distanceEtoile){
        this.name = name;
        this.diametre = diametre;
        this.distanceEtoile = distanceEtoile;
        this.nombreHabitant = nombreHabitant;
        this.nombreSateliteNaturel = nombreSateliteNaturel;
    }

    public String getName() {return this.name;}

    public long getNombreHabitant() {return this.nombreHabitant;}

    public int getDiametre() {return this.diametre;}

    public int getDistanceEtoile() {return this.distanceEtoile;}

    public int getNombreStatteliteNaturel() {return this.nombreSateliteNaturel;}

    public void setDiametre(int diametre) {this.diametre = diametre;}

    public void setDistanceEtoile(int distanceEtoile) {this.distanceEtoile = distanceEtoile;}

    public void setNombreHabitant(int nombreHabitant) {this.nombreHabitant = nombreHabitant;}

    public void setNombreStatteliteNaturel(int nombreStatteliteNaturel) {this.nombreSateliteNaturel = nombreStatteliteNaturel;}
}

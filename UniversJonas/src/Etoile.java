import java.util.ArrayList;

public class Etoile {
    String name;
    String diametre;
    String masse;
    String composition;
    ArrayList<Planete> planetesArrayList;

    public Etoile(String name, String diametre, String masse, String composition, ArrayList<Planete> planetesArrayList) {
        this.name =name;
        this.diametre = diametre;
        this.masse = masse;
        this.composition = composition;
        this.planetesArrayList = planetesArrayList;
    }

    public String getName() {
        return this.name;
    }

    public String getComposition() {
        return this.composition;
    }

    public String getDiametre() {
        return this.diametre;
    }

    public String getMasse() {
        return this.masse;
    }

    public String addPlanete(Planete planete){
        planetesArrayList.add(planete);
        return "New list of planete:" + planetesArrayList;
    }
    public ArrayList<String> getPlaneteName() {
        ArrayList<String> PlaneteNameList= new ArrayList<>();
        String PlaneteName;
        for (Planete planete : planetesArrayList) {
            PlaneteName = planete.getName();
            PlaneteNameList.add(PlaneteName);
        }
        return PlaneteNameList;
    }
    public String description(){
        return "Le " + this.name + " a une masse de " + this.masse + " et un diametre de " +
                this.diametre + ", il est composé d'atomes de (d')" + this.composition + ". Son systeme " +
                "contient la liste de planètes suivantes: " + String.join(", ", getPlaneteName());
    }
}

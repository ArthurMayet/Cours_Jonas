import java.util.*;

import static java.lang.StrictMath.*;

public class test {
    public static void main(String[] args) {
        Planete mercure = new Planete("Mercure",0, 4880, 0, 50000000);
        Planete terre = new Planete("Terre",7000000000L, 12742, 1, 150000000);
        Planete mars = new Planete("Mars",0, 6780, 2, 220000000);
        ArrayList<Planete> planeteList = new ArrayList<>();
        Etoile soleil = new Etoile("Soleil","1,4 de Millions km", "2.10^30 kg", "hygrogenes et d'héliums", planeteList);
        System.out.println(soleil.addPlanete(mercure));
        System.out.println(soleil.addPlanete(terre));
        System.out.println(soleil.addPlanete(mars));
        System.out.println(soleil.description());
        System.out.println("The distance between " + terre.getName() + " and " + mars.getName() + " is " + Distance(terre, mars) + " km!!");
    }
    public static int Distance(Planete planete1, Planete planete2){
        return abs(planete1.distanceEtoile - planete2.distanceEtoile);
    }

}

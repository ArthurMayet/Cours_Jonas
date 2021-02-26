package com.cours.jonas;

import java.util.*;

import static java.lang.StrictMath.*;

public class test {

    public static void recursiveFunction(List<? extends Element> Element) {
        for (Element element : Element){
            if (element instanceof Planete) {
                System.out.println(element.getName());
            }else{
                System.out.println(element.getName());
                recursiveFunction(element.listElement());
            }
        }
    }

    public static void main(String[] args) {
        Planete mercure = new Planete("Mercure",0, 4880, 0, 50000000);
        Planete terre = new Planete("Terre",7000000000L, 12742, 1, 150000000);
        Planete mars = new Planete("Mars",0, 6780, 2, 220000000);
        Etoile soleil = new Etoile("Soleil","1,4 de Millions km", "2.10^30 kg", "hygrogenes et d'héliums");
        Planete proximab = new Planete("Proxima Centauri b", 0,7550,5,44444444);
        Planete proximac = new Planete("Proxima Centauri C", 0,8700,3,33333333);
        Etoile proxima = new Etoile("Proxima du Centaure","214 550 km", "12,3% du Soleil", "éléments idéfinis");
        Galaxy voieLactee = new Galaxy("Voie Lactée");
        System.out.println(proxima.addPlanete(proximab));
        System.out.println(proxima.addPlanete(proximac));
        System.out.println(soleil.addPlanete(terre));
        System.out.println(soleil.addPlanete(mars));
        System.out.println(soleil.description());
        System.out.println(soleil.addPlanete(mercure));
        System.out.println(voieLactee.addEtoile(proxima));
        System.out.println(voieLactee.addEtoile(soleil));
        System.out.println("The distance between " + terre.getName() + " and " + mars.getName() + " is " + Distance(terre, mars) + " km!!");
        recursiveFunction(voieLactee.listElement());
    }
    public static int Distance(Planete planete1, Planete planete2){
        return abs(planete1.distanceEtoile - planete2.distanceEtoile);
    }
}

package com.cours.jonas;

import java.util.ArrayList;
import java.util.List;

public class Etoile implements Element{
    String name;
    String diametre;
    String masse;
    String composition;
    List<Planete> planetesArrayList = new ArrayList<>();

    public Etoile(String name, String diametre, String masse, String composition) {
        this.name =name;
        this.diametre = diametre;
        this.masse = masse;
        this.composition = composition;
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

    public List<Planete> addPlanete(Planete planete){
        planetesArrayList.add(planete);
        return planetesArrayList;
    }

    @Override
    public List<Planete> listElement() {
        List<Planete> PlaneteNameList= new ArrayList<>();
        for (Planete planete : planetesArrayList) {
            PlaneteNameList.add(planete);
        }
        return PlaneteNameList;
    }

    public String description(){
        return "Le " + this.name + " a une masse de " + this.masse + " et un diametre de " +
                this.diametre + ", il est composé d'atomes de (d')" + this.composition + ". Son systeme " +
                "contient la liste de planètes suivantes: ";
                //+ String.join(", ", getElementList());
    }
}
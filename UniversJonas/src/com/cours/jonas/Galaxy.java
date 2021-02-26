package com.cours.jonas;

import java.util.ArrayList;
import java.util.List;

public class Galaxy implements Element {
    String name;
    List<Etoile> etoilesList = new ArrayList<>();

    public Galaxy(String name) {
        this.name = name;
    }

    public List addEtoile(Etoile etoile){
        etoilesList.add(etoile);
        return etoilesList;
    }

    @Override
    public List<Etoile> listElement() {
        List<Etoile> EtoileNameList= new ArrayList<>();
        for (Etoile etoile : etoilesList) {
            EtoileNameList.add(etoile);
        }
        return EtoileNameList;
    }

    public String getName() {return this.name;}

}

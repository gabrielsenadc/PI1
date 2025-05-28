package br.ufes.inf.mvnp1;

import java.util.Comparator;

public class CompareCountryFemale implements Comparator<Country> {
    public int compare(Country c1, Country c2){
        if(c1.getFemale() > c2.getFemale()) return -1;
        return 1;
    }
}

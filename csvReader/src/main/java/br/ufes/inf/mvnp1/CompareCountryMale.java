package br.ufes.inf.mvnp1;

import java.util.Comparator;

public class CompareCountryMale implements Comparator<Country> {
    public int compare(Country c1, Country c2){
        if(c1.getMale() > c2.getMale()) return -1;
        return 1;
    }
}

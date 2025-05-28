package br.ufes.inf.mvnp1;

import java.util.LinkedList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        Leitor l = new Leitor(2020, "female", "female-and-male-life-expectancy-at-birth-in-years.csv");
        LinkedList<Country> list = l.getList();

        int i = 1;
        for(Country c : list){
            System.out.println(i + "° - " + c);
            i++;
        }
    }
}

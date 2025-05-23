package br.ufes.inf.mvnp1;

import java.io.FileReader;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("female-and-male-life-expectancy-at-birth-in-years.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

        LinkedList<Country> list = new LinkedList<Country>();
        for (CSVRecord record : records) {
            String country = record.get(0);
            String year = record.get(2);
            String male = record.get(3);
            String female = record.get(4);

            if(year.equals("2020")) list.add(new Country(country, Float.parseFloat(male), Float.parseFloat(female)));

        }

        Collections.sort(list, new CompareCountry());

        int i = 1;
        for(Country c : list){
            System.out.println(i + "° - " + c);
            i++;
        }
    }
}

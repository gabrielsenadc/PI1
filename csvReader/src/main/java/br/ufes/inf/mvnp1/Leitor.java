package br.ufes.inf.mvnp1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Leitor {
    private String year;
    private String gender;
    private String fileName;
    private LinkedList<Country> list = new LinkedList<Country>();


    public Leitor(int year, String gender, String fileName) throws FileNotFoundException, IOException{
        this.year = "" + year;
        this.gender = gender;
        this.fileName = fileName;

        Reader in = new FileReader(fileName);
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

        for (CSVRecord record : records) {
            String country = record.get(0);
            String yearLine = record.get(2);
            String male = record.get(3);
            String female = record.get(4);

            if(yearLine.equals(this.year)) this.list.add(new Country(country, Float.parseFloat(male), Float.parseFloat(female)));

        }

        if(gender.equals("female")) Collections.sort(this.list, new CompareCountryFemale());
        if(gender.equals("male")) Collections.sort(this.list, new CompareCountryMale());
    }

    public LinkedList<Country> getList(){
        return this.list;
    }


}

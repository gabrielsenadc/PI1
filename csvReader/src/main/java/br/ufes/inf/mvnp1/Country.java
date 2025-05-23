package br.ufes.inf.mvnp1;

public class Country {
    private String name;
    private float male;
    private float female;

    public Country(String name, float male, float female) {
        this.name = name;
        this.male = male;
        this.female = female;
    }

    public float getMale(){
        return male;
    }

    public float getFemale(){
        return female;
    }

    @Override
    public String toString() {
        return name + " " + female;
    }


}

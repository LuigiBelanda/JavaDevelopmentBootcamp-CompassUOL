package list_collections.Equality;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // O método equals() / contains() só dará TRUE se 
        // os o que estivermos comparando tiver ambos a mesma
        // referência, se não da FALSE

        City paris = new City("Paris", 2161000);
        City paris2 = paris;

        System.out.println(paris.equals(paris2));

        // City copy = paris;

        // System.out.println(paris.equals(copy));
        // copy.setPopulation(2059003);
        // paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));
        
        System.out.println(cities.contains(paris));
    }

}
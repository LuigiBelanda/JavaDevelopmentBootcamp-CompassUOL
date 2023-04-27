package immutable_objects;

public class Mutable {
    public static void main(String[] args) {

        // **************** Immutable Object ****************
        Integer applesWrapper = 5;

        Integer applesWrapper2 = applesWrapper;     // SAFE
        applesWrapper2 = 10;

        System.out.println(applesWrapper);
        System.out.println(applesWrapper2);

        // **************** Mutable Object ****************
        
        City_mutable city = new City_mutable("Paris", 2161000);
        City_mutable secondCity = city;            // DANGEROUS

        city.setPopulation(2261000);
        secondCity.setPopulation(2263400);
        city.setPopulation(2163400);
        secondCity.setPopulation(2443400);
        
    }
}
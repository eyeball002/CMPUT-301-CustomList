import static org.junit.Assert.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        City c = new City("Edmonton", "AB");

        // We are going to compare length of list before and after addCity.
        int size = list.getCount();

        // We try to add the city.
        list.addCity(c);

        // See if addCity changed the list length.
        assertEquals(size + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        // Add city, and see if it exists within the list.
        City c = new City("Edmonton", "AB");
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    @Test
    public void removeCityTest() {
        // Add city on an empty list, remove it, then check if getCount() is still zero.
        City c = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(c);
        list.removeCity(c);
        assertEquals(size, list.getCount());
    }

    @Test
    public void countCitiesTest() {
        // Get city count before and after adding cities.
        City c1 = new City("Edmonton", "AB");
        City c2 = new City("Vancouver", "BC");
        int size = list.getCount();

        assertEquals(size, list.countCities());

        list.addCity(c1);
        assertEquals(size + 1, list.countCities());

        list.addCity(c2);
        assertEquals(size + 2, list.countCities());
    }
}

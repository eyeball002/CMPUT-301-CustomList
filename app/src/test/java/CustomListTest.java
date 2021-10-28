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
}

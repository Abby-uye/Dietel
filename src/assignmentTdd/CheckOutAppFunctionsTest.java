package tdd;

import Assignments.CheckOutAppFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CheckOutAppFunctionsTest {
    @Test
    void canCreateStore(){
        CheckOutAppFunctions app = new CheckOutAppFunctions();
        assertNotNull(app);
    }
@Test
void testThatCanGetStoreName(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    app.setStoreName("Regius Portus");
    assertEquals("regius portus",app.getStoreName());
}
    @Test
    void testThatCanGetPhoneNumber(){
        CheckOutAppFunctions app = new CheckOutAppFunctions();
        app.setPhoneNumber("09071272729");
        assertEquals("09071272729",app.getPhoneNumber());
    }
@Test
void testThatCanSetStoreLocation(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    app.setStoreLocation("Surulere Lagos");
    assertEquals("surulere lagos",app.getStoreLocation());
}
@Test
 void testThatCanCheckDateAndTime(){


}
@Test
    void testThatCanGetCustomerName(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    app.setCustomerName("Uye");
    assertEquals("uye",app.getCustomerName());
}
@Test
    void testThatCanGetCashierName(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    app.setCashierName("Uye");
    assertEquals("uye",app.getCashierName());
}
@Test
    void testThatCanSaveCustomersItemInAnArrayList(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    ArrayList<String> expected = new ArrayList<>();
    expected.add("Bread");
    assertEquals(expected,app.saveCustomerItem("Bread"));
}
    @Test
    void testThatCanSaveNumberOfItems(){
        CheckOutAppFunctions app = new CheckOutAppFunctions();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected,app.numberOfItems(2));
    }
@Test
    void testThatCanSavePriceOfItems(){
    CheckOutAppFunctions app = new CheckOutAppFunctions();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(700);
    assertEquals(expected,app.priceOfItems(700));
}


}
package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TableTest {
    @Test
    public void testThatTableExist(){
        Table myTable = new Table();
        assertNotNull(myTable);
    }
}

package tdd;

import ClassWork.GeoPoliticalZones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZonesTdd {
    @Test
    void testThatCanGetGeoPoliticalZones(){
        GeoPoliticalZones[] result = GeoPoliticalZones.values();
        assertSame(result,GeoPoliticalZones.politicalZones("imo"));

    }

}
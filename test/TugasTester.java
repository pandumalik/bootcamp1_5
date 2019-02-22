/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import tugas.Tugas;

/**
 *
 * @author Pandu
 */
public class TugasTester {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        String act = Tugas.uniqueCounter(5);
        int perkiraan = 5;
        assertEquals(perkiraan, act.length());
    }

    @Test
    public void differs() {
        String expected = "qw";
        String yeye = "";
        int same = 0;
        //String [] array = {};
        //List<String> comp = new ArrayList<>();
        while (!expected.equals(yeye)) {
            String hasString = Tugas.uniqueCounter(2);
            System.out.println(hasString);
            //comp.add(hasString);
            yeye = hasString;
            same++;
        }
        System.out.println("the expected " + expected + " doesnt match with " + same + " char before");
        assertEquals(expected, yeye);
    }

    @Test
    public void undiffers() {
        String expected = "qw";
        String yeye = "";
        int same = 0;
        //String [] array = {};
        // List<String> comp = new ArrayList<>();

        for (int x = 0; x < 1000; x++) {
            String hasString = Tugas.nonUniqueCounter(2);
            if (expected.equals(yeye)) {
                same++;
            }
            yeye = hasString;
            System.out.println(same + 1 + " . " + yeye);
        }
        System.out.println("The EXPECTED Character of ' " + expected + " ' shown " + same + " times");
    }
}

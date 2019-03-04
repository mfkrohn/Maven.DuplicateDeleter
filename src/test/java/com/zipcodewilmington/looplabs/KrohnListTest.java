package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Test;

public class KrohnListTest {

    @Test
    public void removeTest(){
        Integer[] testArray = new Integer[]{1,2,3,4,5,6,7};
        Integer indexToRemove = 4;
        Integer[] expectedArray = new Integer[]{1,2,3,4,6,7};

        KrohnIntList krohnList = new KrohnIntList(testArray);

        krohnList.removeAtIndex(indexToRemove);
        Integer[] actualArray = krohnList.toArray();


        Assert.assertArrayEquals(expectedArray,actualArray);

    }

    @Test
    public void occurrencesTest(){
        Integer[] testArray = new Integer[]{1,2,3,4,4,4,7};
        Integer indexToCount = 4;
        Integer expectedOcc = 3;

        KrohnIntList krohnList = new KrohnIntList(testArray);

        Integer actualOcc = krohnList.occurrences(indexToCount);

        Assert.assertEquals(expectedOcc,actualOcc);
    }

    @Test
    public void removeAllButOne(){
        Integer[] testArray = new Integer[]{1,4,3,4,5,4,4};
        Integer indexToRemove = 4;
        Integer[] expectedArray = new Integer[]{1,4,3,5};

        KrohnIntList krohnList = new KrohnIntList(testArray);

        krohnList.removeAllButOne(indexToRemove);
        Integer[] actualArray = krohnList.toArray();


        Assert.assertArrayEquals(expectedArray,actualArray);

    }
}

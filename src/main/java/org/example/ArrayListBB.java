package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBB {
    public ArrayList<String> newArray44 = new ArrayList<String>();
    public static String[] newObjectArray22 = new String[10];

    public static Integer size= 0;


    @Test
    @Before
    public void startTest() {

        newArray44.add("a");
        newArray44.add("b");
        newArray44.add("c");

        String[] sentence = {"The", "Quick", "Brown", "Fox", "Jumped", "Over", "The", "Fence"};

        for(int i = 0; i < sentence.length; i++){
            newObjectArray22[i] = sentence[i];
            System.out.println(sentence[i]);
            size++;
        }
    }

    @Test
    public void DeleteLast(){


        newArray44.remove(2);

        Assert.assertEquals(2, newArray44.size());
        Assert.assertEquals("a", newArray44.get(0));
        Assert.assertEquals("b", newArray44.get(1));


    }


    public  static void delete(int index){
        for (int j = index; j < size -1; j++){
            newObjectArray22[j] = newObjectArray22[j + 1];
        }

        if(index == size) { // index is the last element
            newObjectArray22[index] = null;
        }
        else {            // index is not the last element
            newObjectArray22[size -1] = null;
        }

        size--;
    }

    public static void main(String[] args) {
        String[] sentence = {"The", "Quick", "Brown", "Fox", "Jumped", "Over", "The", "Fence"};

        for(int i = 0; i < sentence.length; i++){
            newObjectArray22[i] = sentence[i];
            System.out.println(i + ") " + sentence[i]);
            size++;
        }
        delete(3);
        System.out.println("Object 3  After Deleting previous 3 : " + newObjectArray22[3]);
    }



}

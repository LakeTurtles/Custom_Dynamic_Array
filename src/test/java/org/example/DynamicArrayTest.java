package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class DynamicArrayTest {

    private DynamicArray array;
    private static Integer count = 0;

    @Before
    public void setUp() throws Exception {
        array = new DynamicArray<>(2);
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        array.add("f");
    }



    @Test
    public void set() {
        array.set(0, "t");
        Assert.assertEquals("t", array.get(0));
    }



    @Test
    public void get() {

        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("b", array.get(1));


    }



    @Test
    public void insert() {
        array.insert(2, "l");
        Assert.assertEquals("l", array.get(2) );
    }



    @Test
    public void delete() {
        array.delete(0);

        Assert.assertEquals("b", array.get(0));
    }



    @Test
    public void isEmpty() {

        Assert.assertEquals(false, array.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertEquals(true, array.Contains("a"));

    }



    @Test
    public void throwsIndexOutOfBounceExceptionIfTooBig(){

        Assert.assertThrows(IndexOutOfBoundsException.class, () -> array.set(88, "a"));

    }




    @After
    public void tearDown() throws Exception {
        System.out.println("J Unit Test #### TearDown : " + count++  );


    }


    @AfterClass
    public static void finishAllTest(){
        System.out.println("All J Unit Test Completed.");
                System.exit(0);
    }



}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class newSortingTest {
    @Test
    //Test quick sort method with a unsorted array of integers
    void newSorting1(){
        newSorting test = new newSorting();
        int[] a = {1,6,8,9,7,3};
        int size = a.length;
        test.newSorting(a,size);
        assertArrayEquals(new int[]{1,3,6,7,8,9}, a);
    }
    @Test
    //Test quick sort with a unsorted char array.
    public void newSorting2(){
        newSorting test = new newSorting();
        int[] a = {'e','m','i','l','i','a','n','o'};
        int size = a.length-1;
        test.newSorting(a,size);
        assertArrayEquals(new int[]{'a','e','i','i','m','n','o'}, a);

    }
    @Test
    //Test an unsorted array of char using merge sort.
    public void newSorting3(){
        newSorting test = new newSorting();
        int[] a = {'e','m','i','l','i','a','n','o'};
        int size = a.length+1;
        test.newSorting(a,size);
        assertArrayEquals(new int[]{'a','e','i','i','m','n','o'}, a);

    }
    @Test
    //Test a mixture of negative and positive integers and also characters using quick sort.
    public void newSorting4(){
        newSorting test = new newSorting();
        int[] a = {-1,'e', 4,-6,7,'d'};
        int size = a.length-1;
        test.newSorting(a,size);

    }
    @Test
    //Test a mixture of negative and positive along with characters using merge sort.
    public void newSorting5(){
        newSorting test = new newSorting();
        int[] a = {-1,'e', 4,-6,7,'d'};
        int size = 1000;
        test.newSorting(a,size);

    }


}
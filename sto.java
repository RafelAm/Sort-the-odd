import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }
    
    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
    
    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }
}


public class Main{
    public static int[] sortArray(int[] array) {

        int impares = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                impares++;
            }
        }
        int[] sort = new int[impares];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                sort[index++] = array[i];
            }
        }
        int temp = 0;
        for(int i = 0; i < impares - 1; i++){
            for(int j = 0; j < impares - i - 1; j++ ){
                if(sort[j] > sort[j + 1]){
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }


        index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] = sort[index++];
            }
        }



        return array;
    }
}

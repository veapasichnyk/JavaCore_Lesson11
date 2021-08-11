import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main ( String [] arg) {

        RandomOfValue random = new RandomOfValue ();

        Integer [] arrayOfIntegers = { random.getRandom ( 10, 100), random.getRandom ( 0, 100), random.getRandom ( 0, 10)};
        System.out.println ("Given array: " + Arrays.toString ( arrayOfIntegers ) );

        Arrays.sort ( arrayOfIntegers );
        System.out.println ("The array is sorted in ascending order: " + Arrays.toString ( arrayOfIntegers ) );

        Arrays.sort ( arrayOfIntegers, Collections.reverseOrder () );
        System.out.println ("The array is sorted in descending order: " + Arrays.toString ( arrayOfIntegers ) );
    }
}

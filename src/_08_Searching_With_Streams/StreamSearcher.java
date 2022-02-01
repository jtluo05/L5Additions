package _08_Searching_With_Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSearcher {
    /*
     * Use stream methods to return the number of times a string appears
     * in the array of strings.
     *
     * The filter() and count() stream methods may be useful here.
     */
    public long containsCount(String[] strArr, String strToCount) {
    	Stream<String> array = Arrays.stream(strArr);
    	array.filter(strToCount);
    	array.count();
        return 0;
    }
}

package homr.java.spring.batch.learn.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.Arrays;
import java.util.List;

public class ListReader implements ItemReader<Integer> {

    public static final List<Integer> integerList = Arrays.asList(1, 4, 3, 2, 5, 6, 8, 9, 0);
    @Override
    public Integer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        for (int number : integerList
             ) {
            return number;

        }
        return null;
    }
}

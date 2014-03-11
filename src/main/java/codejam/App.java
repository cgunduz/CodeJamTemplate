package codejam;

import utils.IoUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cgunduz on 3/11/14.
 */
public class App {

    public static void main(String args[])
    {
        List<List<String>> input = IoUtils.mapFileToStringList("deneme.txt");

        for(List<String> stringList : input)
        {
            for(String s : stringList)
            {
                System.out.println(s);
            }
            System.out.println("End of line");
        }

        IoUtils.mapStringListToFile(Arrays.asList("Deneme girisi", "asdasd" , " 123 412 ssss"));
    }
}

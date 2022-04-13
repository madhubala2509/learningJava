package hackerRank.dsArrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;
        List<List<Integer>> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(new ArrayList<>());
        }
        for(int i=0;i<queries.size();i++){
            int choice = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            //System.out.println(choice+" "+x+" "+y);
            if(choice==1){
                int index = ((x^lastAnswer)%n);
                input.get(index).add(y);
            }
            else {
                List<Integer> seq = input.get((x ^ lastAnswer) % n);
                lastAnswer = seq.get(y % seq.size());
                result.add(lastAnswer);
            }
        }
        return result;
    }

}

public class dynamicArray{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result3.dynamicArray(n, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

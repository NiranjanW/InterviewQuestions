package solutions.problem2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sum2020 {
   
    public static void main(String[] args) throws IOException{
        // File directory = new File("./");
        // System.out.println(directory.getAbsolutePath());

        List<String> data = Files.readAllLines(new File("./solutions/problem2/data.txt").toPath() ,Charset.defaultCharset());
        List<Integer> data2 = data.stream().map(Integer::parseInt).collect(Collectors.toList());
        sum(data2);
        // for (int i= 0; i < data.toString().length(); i++)
        // data.stream()
        //     .map ( s -> s.split ("\n"))
        //     .collect(Collectors.joining(","));
        // for (String line :data){
        //     System.out.println(line);
        // }
    }

     static void sum(List<Integer> data2) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < data2.size(); i++){
            for ( int j = i+1 ; j< data2.size(); j++){
                if (  data2.get(i) +data2.get(j) == 2020){
                    result.add(data2.get(i));
                    result.add(data2.get(j));
                    System.out.println(result);
                }
            }
        }
 }
}


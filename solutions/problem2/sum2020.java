package solutions.problem2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;




public class sum2020 {
   
    public static void main(String[] args) throws IOException{
        // File directory = new File("./");
        // System.out.println(directory.getAbsolutePath());

        List<String> data = Files.readAllLines(new File("./solutions/problem2/data.txt").toPath() ,Charset.defaultCharset());
        List<Integer> data2 = data.stream().map(Integer::parseInt).collect(Collectors.toList());
        sum2(data2);
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

    static void sum1( List<Integer> data) {
        HashSet<Integer> set = new HashSet<>(data);
        // set.forEach( ele -> System.out.println(ele.toString()));
    
       for ( Integer s : set){
           if (set.contains(2020 - s)){
            System.out.printf("First number :%s , NextNumber :%s" ,s.toString(), Integer.toString(2020-s));
           }

       }
    }
       static void sum2(List<Integer> data){
           HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
           
           for ( int i=0 ; i < data.size() ; i++ ) {
               hm.put(data.get(i), 2020-data.get(i));
           }
           for ( Entry<Integer,Integer> it:hm.entrySet()){
               if ( hm.containsValue(it.getKey()) ){
                   System.out.printf("First number :%s , NextNumber :%s" ,it.getKey(), it.getValue());
                   break;
               }

           }


       }
    //     for (int i = 0; i < data.size(); i++){
    //         set.add(data.get(i));
    //         if (set.contains(2020-data.get(i))){
    //             System.out.println(data.get(i) * 2020-data.get(i));
    //         }

    // }
 
}
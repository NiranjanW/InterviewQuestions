package solutions.problem3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class wordCount {

public static void main(String[] args)  {
   String data = readFile("/Users/itnxw/python/home//interviewProblems/solutions/problem3/data/Alice.txt");
   List<String> words = new ArrayList<String>();
   Map<String , Integer> counts = new HashMap<String , Integer>();
   for (String word : data.split(" ")) {
       words.add(word.toLowerCase());

   }
   for (String word :words){
       counts.put(word, Collections.frequency(words , word));
   }
       Iterator<Map.Entry<String, Integer>> iterator = counts.entrySet().iterator();
       while (iterator.hasNext()) {
           Map.Entry<String, Integer> entry = iterator.next();
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }
}

static String readFile(String fh) {
    // String file = "Alice.txt";
    // Path path = Paths.get("/solutions/problem3/data",file);
    File  file = new File(fh);
    String result="";
    try {
        InputStream inputStream =new DataInputStream( new FileInputStream(file) );
        result = new BufferedReader(new InputStreamReader(inputStream))
                        .lines().collect(Collectors.joining("\n"));
                        System.out.println(result);
      

    } catch (Exception e) {
        e.printStackTrace();        //TODO: handle exception
    }

      return result;
    
}

// static void wordCount(List<String> lines){
//     Map<String, Long> commonWords = lines
//         .parallelStream()
//         .map(lines -> lines.split(" ")
//         .flatMap(Array::stream)
//         .map(s -> s.toLowerCase())
        
//         )
// }

}
package utils;

import data.model.Graph;
import data.model.GraphImpl;
import javafx.util.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

   public static Graph readGraph(String path) {
       Graph graph = null;

       try {
           FileInputStream fileInputStream = new FileInputStream(path);

           BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));

           String strLine;

           List<List<Pair<Integer, Integer>>> graphList = new ArrayList<>();

           while ((strLine = br.readLine()) != null){

               String newString = strLine.trim().replaceAll(" +", " ");
               //strLine.replaceAll("   ", " ");
               //strLine.replaceAll("  ", " ");

               List<Pair<Integer, Integer>> list = new ArrayList<>();

               String[] strings = newString.split(" ");
               for(int i = 0; i < strings.length; i++){
                    Pair<Integer, Integer> pair = new Pair<>(Integer.parseInt(strings[i]), 1);
                    list.add(pair);
               }

               graphList.add(list);
           }

           graph = new GraphImpl(graphList);
       } catch (Exception ex) {
           System.out.println("Ошибка при чтении файла: "+path);
       }

       return graph;

   }

}

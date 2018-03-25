package main;

import algo.Dihotomy;
import data.model.Graph;
import utils.FileUtils;
import utils.GraphUtils;

public class Main {


    public static void main(String[] args) {

        Graph graph = FileUtils.readGraph("C:\\Users\\rus\\IdeaProjects\\graph\\files\\vertices-0.txt");

        Dihotomy dihotomy = new Dihotomy(graph);




        String str = "";
    }
}
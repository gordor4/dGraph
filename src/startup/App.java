package startup;

import algo.Dihotomy;
import data.model.Graph;
import draw.GraphView;
import utils.FileUtils;

import javax.swing.*;


public class App {
    public static void main(String[] args) {

        Graph graph = FileUtils.readGraph(".\\files\\vertices-0.txt");

        Dihotomy dihotomy = new Dihotomy(graph);

        String str = "";

        GraphView frame = new GraphView(graph);
    }
}

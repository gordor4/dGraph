package algo;

import data.model.Graph;
import utils.GraphUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dihotomy {
    Graph graph;

    public Dihotomy(Graph graph) {
        this.graph = graph;
    }

    public List<Graph> solve() {
        GraphUtils graphUtils = new GraphUtils(graph);
        graphUtils.findComps();

        if(graphUtils.isOneComponent()) {
            System.out.println("В графе один компонент связности");
        }

        Random random = new Random();

        random.nextInt(graph.getVertexNumber());

        int e1 = random.nextInt(graph.getVertexNumber());
        int e2 = random.nextInt(graph.getVertexNumber());

        dijkstra(e1, e2);

        List<Graph> dihotomy = new ArrayList<>();


        return dihotomy;
    }

    public void dijkstra(int start, int target) {

    }
}

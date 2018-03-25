package utils;

import data.model.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils {
    private boolean[] used;
    private List<Integer> comp = new ArrayList<>();


    private Graph graph;
    private int componentCount = 0;

    public GraphUtils(Graph graph) {
        this.graph = graph;
        used = new boolean[graph.getVertexNumber()];
    }

    public void dfs(int v) {
        comp.add(v);
        for(int i = 0; i< graph.getVertex(v).size(); i++) {
            used[v] = true;
            int to = graph.get(v, i);
            if(!used[to]) {
                dfs(to);
            }
        }
    }

    public void findComps() {
        int n = graph.getVertexNumber();

        for(int i = 0; i < n; i++) {
            used[i] = false;
        }

        for(int j = 0; j < n; j++) {
            if(!used[j]) {
                comp.clear();
                dfs (j);
                componentCount++;
            }
        }
    }

    public boolean isOneComponent() {
        return componentCount == 1 ? true : false;
    }

}

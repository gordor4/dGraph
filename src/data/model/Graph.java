package data.model;

import javafx.util.Pair;

import java.util.List;

public interface Graph {

    void addVertex();

    void addEdge();

    void deleteVertex();

    void deleteEdge();

    int getVertexNumber();

    int getEdgeNumber();

    List<Pair<Integer, Integer>> getVertex(int i);

    Integer get(int i, int j);

    Integer getVertexEdge(int i);

    List<Integer> getVertexEdges(int k);
}

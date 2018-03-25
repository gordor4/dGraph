package data.model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GraphImpl implements Graph {

    List<List<Pair<Integer, Integer>>> lists;

    public GraphImpl() {}

    public GraphImpl(List<List<Pair<Integer, Integer>>> lists) {
        this.lists = lists;
    }

    public List<List<Pair<Integer, Integer>>> getLists() {
        return lists;
    }

    @Override
    public List<Integer> getVertextEdges(int k) {
        List<Integer> values = new ArrayList<>();
        for(Pair<Integer, Integer> val : lists.get(k)) {
            values.add(val.getKey());
        }
        return values;
    }

    @Override
    public void addEdge() { }

    @Override
    public void addVertex() { }

    @Override
    public void deleteEdge() { }

    @Override
    public void deleteVertex() { }

    @Override
    public int getEdgeNumber() {
        int edgeCount = 0;
        Iterator<List<Pair<Integer, Integer>>> iterator = lists.iterator();

        while(iterator.hasNext()) {
            edgeCount += iterator.next().size();
        }

        return edgeCount;
    }

    @Override
    public int getVertexNumber() {
        return lists.size();
    }

    @Override
    public List<Pair<Integer, Integer>> getVertex(int i) {
        return lists.get(i);
    }

    @Override
    public Integer get(int i, int j) {
        return lists.get(i).get(j).getKey();
    }

    @Override
    public Integer getVertexEdges(int i) {
        return lists.get(i).size();
    }
}

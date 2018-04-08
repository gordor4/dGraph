package draw;

import data.model.Graph;

import java.io.File;
import java.io.IOException;
import static guru.nidi.graphviz.model.Factory.*;

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;


public class GraphView {

    private Graph graph;



    public GraphView(Graph graphModel) {

        guru.nidi.graphviz.model.Graph g = graph("example1").directed().with(node("a").link(node("b")));
        try {
            guru.nidi.graphviz.engine.Graphviz.fromGraph(g).width(200).render(guru.nidi.graphviz.engine.Format.PNG).toFile(new File("example/ex1.png"));
        } catch (IOException e) {}

    }
}

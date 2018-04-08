package draw;

import data.model.Graph;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;


public class GraphView {

    private Graph graph;



    public GraphView(Graph graphModel) {

        

//        try {
//            //MutableGraph g = Parser.read(getClass().getResourceAsStream("graph.properties"));
//
//
//
//            File file = new File(".\\res\\graph.dot");
//
//            MutableGraph g = Parser.read(file);
//            Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/ex4-1.png"));
//
//        } catch (IOException e) {}
    }

}

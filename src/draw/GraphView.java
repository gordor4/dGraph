package draw;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import data.model.Graph;
import javafx.util.Pair;

import javax.swing.*;
import java.util.List;

public class GraphView extends JFrame {

    private Graph graph;

    public GraphView(Graph graph) {
        this.graph = graph;

    }
}

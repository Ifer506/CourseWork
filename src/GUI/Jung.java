//import edu.uci.ics.jung.algorithms.layout.CircleLayout;
//import edu.uci.ics.jung.graph.DirectedSparseGraph;
//import edu.uci.ics.jung.visualization.VisualizationImageServer;
//
//import javax.swing.*;
//import java.awt.*;
///**
// * First JUNG example:
// * Three vertices and three directed vertices connecting the edges.
// *
// * @author Arieh 'Vainolo' Bibliowicz
// *
// */
//public class Jung {
//    public static void main(String[] args) {
//        DirectedSparseGraph <String><String> d = new DirectedSparseGraph<String><String>();
//        d.addVertex(2);
//        d.addVertex(3);
//        d.addVertex(5);
//        d.addEdge(4, 5, 3);
//        d.addEdge(3, 2, 5);
//        d.addEdge(2, 5, 1);
//        VisualizationImageServer<String, String> vs = new VisualizationImageServer<String, String>(new CircleLayout<String, String>(d), new Dimension(200, 200));
//
//        JFrame frame = new JFrame();
//        frame.getContentPane().add(vs);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//}
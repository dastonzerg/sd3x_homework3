import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    // Test 1
    Maze maze1=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeLarge1.txt");
    Maze maze2=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeLarge2.txt");
    Maze maze3=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeLarge3.txt");
    Maze maze4=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeMedium.txt");
    Maze maze5=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeSmall.txt");
    
//    List<Maze.Move> moveList1=maze1.solveMaze();
//    for(Maze.Move move:moveList1)
//    {
//      if(move==Maze.Move.UP)
//      {
//        out.println("UP");
//      }
//      if(move==Maze.Move.DOWN)
//      {
//        out.println("DOWN");
//      }
//      if(move==Maze.Move.LEFT)
//      {
//        out.println("LEFT");
//      }
//      if(move==Maze.Move.RIGHT)
//      {
//        out.println("RIGHT");
//      }
//    }
//    
//    List<Maze.Move> moveList2=maze2.solveMaze();
//    for(Maze.Move move:moveList2)
//    {
//      if(move==Maze.Move.UP)
//      {
//        out.println("UP");
//      }
//      if(move==Maze.Move.DOWN)
//      {
//        out.println("DOWN");
//      }
//      if(move==Maze.Move.LEFT)
//      {
//        out.println("LEFT");
//      }
//      if(move==Maze.Move.RIGHT)
//      {
//        out.println("RIGHT");
//      }
//    }
//    
//    List<Maze.Move> moveList3=maze3.solveMaze();
//    for(Maze.Move move:moveList3)
//    {
//      if(move==Maze.Move.UP)
//      {
//        out.println("UP");
//      }
//      if(move==Maze.Move.DOWN)
//      {
//        out.println("DOWN");
//      }
//      if(move==Maze.Move.LEFT)
//      {
//        out.println("LEFT");
//      }
//      if(move==Maze.Move.RIGHT)
//      {
//        out.println("RIGHT");
//      }
//    }
//    
//    List<Maze.Move> moveList4=maze4.solveMaze();
//    for(Maze.Move move:moveList4)
//    {
//      if(move==Maze.Move.UP)
//      {
//        out.println("UP");
//      }
//      if(move==Maze.Move.DOWN)
//      {
//        out.println("DOWN");
//      }
//      if(move==Maze.Move.LEFT)
//      {
//        out.println("LEFT");
//      }
//      if(move==Maze.Move.RIGHT)
//      {
//        out.println("RIGHT");
//      }
//    }
    
    List<Maze.Move> moveList5=maze5.solveMaze();
    for(Maze.Move move:moveList5)
    {
      if(move==Maze.Move.UP)
      {
        out.println("UP");
      }
      if(move==Maze.Move.DOWN)
      {
        out.println("DOWN");
      }
      if(move==Maze.Move.LEFT)
      {
        out.println("LEFT");
      }
      if(move==Maze.Move.RIGHT)
      {
        out.println("RIGHT");
      }
    }
    // Test 2
//    Graph graph=new Graph(15);
//    graph.addEdge(0, 1);
//    graph.addEdge(0, 2);
//    graph.addEdge(0, 3);
//    graph.addEdge(0, 4);
//    graph.addEdge(0, 5);
//    graph.addEdge(1, 6);
//    graph.addEdge(1, 7);
//    graph.addEdge(2, 7);
//    graph.addEdge(2, 8);
//    graph.addEdge(2, 9);
//    graph.addEdge(3, 9);
//    graph.addEdge(4, 10);
//    graph.addEdge(5, 11);
//    graph.addEdge(6, 12);
//    graph.addEdge(7, 12);
//    graph.addEdge(8, 12);
//    graph.addEdge(9, 12);
//    graph.addEdge(10, 12);
//    graph.addEdge(11, 14);
//    graph.addEdge(12, 13);
//    graph.addEdge(14, 13);
//    
//    out.println(graph.numShortestPaths(12, 0));
    
//    Graph g1=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\completeGraph.txt");
//    out.println(g1.numShortestPaths(0, 5));
//    
//    Graph g2=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\largeGridGraph.txt");
//    out.println(g2.numShortestPaths(0, 5));
//    
//    Graph g3=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\maxPaths1LevelGraph.txt");
//    out.println(g3.numShortestPaths(0, 5));
//    
//    Graph g4=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\maxPaths5LevelGraph.txt");
//    out.println(g4.numShortestPaths(0, 5));
//    
//    Graph g5=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\smallGraph.txt");
//    out.println(g5.numShortestPaths(0, 5));
//    
//    Graph g6=Graph.createGraph("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\twoCliquesTwoEdges.txt");
//    out.println(g6.numShortestPaths(0, 5));
  }
}

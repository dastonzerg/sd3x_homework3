import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    // Test 1
//    Maze maze=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeMedium.txt");
//    List<Integer> adj=maze.g.neighbors(3);
//    List<Maze.Move> adjDir=maze.g.neighborsDir(3);
//    for(Maze.Move dir:adjDir)
//    {
//      if(dir==Maze.Move.UP)
//      {
//        out.println("UP");
//      }
//      if(dir==Maze.Move.DOWN)
//      {
//        out.println("DOWN");
//      }
//      if(dir==Maze.Move.LEFT)
//      {
//        out.println("LEFT");
//      }
//      if(dir==Maze.Move.RIGHT)
//      {
//        out.println("RIGHT");
//      }
//    }
//    
//    for(Integer node:adj)
//    {
//      out.println(node);
//    }
//    
//    out.println(maze.endVertex);
//    
//    List<Maze.Move> moveList=maze.solveMaze();
//    for(Maze.Move move:moveList)
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
    
    // Test 2
    Graph graph=new Graph(11);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(0, 3);
    graph.addEdge(0, 4);
    graph.addEdge(4, 9);
    graph.addEdge(1, 5);
    graph.addEdge(2, 5);
    graph.addEdge(3, 6);
    graph.addEdge(3, 8);
    graph.addEdge(6, 5);
    graph.addEdge(9, 7);
    graph.addEdge(5, 7);
    graph.addEdge(8, 7);
    graph.addEdge(8, 10);
    graph.addEdge(7, 10);
    
    out.println(graph.numShortestPaths(0, 7));
  }
}

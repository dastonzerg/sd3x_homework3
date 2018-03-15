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
    Graph graph=new Graph(15);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(0, 3);
    graph.addEdge(0, 4);
    graph.addEdge(0, 5);
    graph.addEdge(1, 6);
    graph.addEdge(1, 7);
    graph.addEdge(2, 7);
    graph.addEdge(2, 8);
    graph.addEdge(2, 9);
    graph.addEdge(3, 9);
    graph.addEdge(4, 10);
    graph.addEdge(5, 11);
    graph.addEdge(6, 12);
    graph.addEdge(7, 12);
    graph.addEdge(8, 12);
    graph.addEdge(9, 12);
    graph.addEdge(10, 12);
    graph.addEdge(11, 14);
    graph.addEdge(12, 13);
    graph.addEdge(14, 13);
    
    out.println(graph.numShortestPaths(0, 12));
  }
}

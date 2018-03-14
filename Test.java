import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    Maze maze=new Maze("C:\\Users\\dasto\\Desktop\\homework-3\\test\\files\\mazeMedium.txt");
    List<Integer> adj=maze.g.neighbors(3);
    List<Maze.Move> adjDir=maze.g.neighborsDir(3);
    for(Maze.Move dir:adjDir)
    {
      if(dir==Maze.Move.UP)
      {
        out.println("UP");
      }
      if(dir==Maze.Move.DOWN)
      {
        out.println("DOWN");
      }
      if(dir==Maze.Move.LEFT)
      {
        out.println("LEFT");
      }
      if(dir==Maze.Move.RIGHT)
      {
        out.println("RIGHT");
      }
    }
    
    for(Integer node:adj)
    {
      out.println(node);
    }
    
    out.println(maze.endVertex);
    
    List<Maze.Move> moveList=maze.solveMaze();
    for(Maze.Move move:moveList)
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
  }
}

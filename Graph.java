
import java.util.*;

/**
 * A undirected graph class
 * 
 * Also includes functions for running dfs and bfs
 *
 */
public class Graph 
{
	
	private int n; //number of vertices
	private LinkedList<Integer>[] adj; //adjacency list
	private LinkedList<Maze.Move>[] adjDir;
	
	/**
	 * Constructs a graph with n vertices (containing no edges)
	 * 
	 * @param n - the number of vertices in the graph
	 */
	@SuppressWarnings("unchecked")
	public Graph(int n) 
	{
		this.n = n;
		adj = (LinkedList<Integer>[]) new LinkedList[n];
		adjDir=(LinkedList<Maze.Move>[])new LinkedList[n];
		for (int i = 0; i <= n-1; i++) 
		{
			adj[i] = new LinkedList<Integer>();
			adjDir[i]=new LinkedList<Maze.Move>();
		}
	}
	
	/**
	 * add an edge between vertices v and w
	 */
	public void addEdge(int v, int w, Maze.Move dir)  // Here the dir could only be RIGHT or DOWN
	{
		adj[v].add(w); //add w to v's adjacency list
		adjDir[v].add(dir);
		adj[w].add(v);
		if(dir==Maze.Move.RIGHT)
		{
		  adjDir[w].add(Maze.Move.LEFT);
		}
		else if(dir==Maze.Move.DOWN)
		{
		  adjDir[w].add(Maze.Move.UP);
		}
	}
	
	/**
	 * outputs the neighbors of a vertex v
	 */
	public List<Integer> neighbors(int v) 
	{
		return adj[v];
	}
	
	public List<Maze.Move> neighborsDir(int v)
	{
	  return adjDir[v];
	}
	
	/**
	 * @return the number of vertices in the graph
	 */
	public int size() 
	{
		return n;
	}
	
	/**
	 * returns the number of shortest paths from s to t
	 * 
	 * ex. if the shortest path from s to t is of length 4, and there
	 * are two distinct paths from s to t of length 4, then you should return 2
	 * 
	 * @param s the source vertex
	 * @param t the destination vertex
	 * @return
	 */
	public int numShortestPaths(int s, int t) 
	{
		//TODO
		return -1;
	}
}

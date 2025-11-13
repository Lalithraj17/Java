import java.util.*;
public class graph {
    static class Edge 
    {
        int src;
        int des;
        public Edge(int s, int d)
        {
            this.des = d;
        }
    }
    public static void CreateGraph(ArrayList<Edge>[] graph)
    {
        for(int i=0; i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void main(String[] args)
    {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
        System.out.println("Graph created successfully");
        for (int i=0;i<v;i++)
        {
            System.out.print(i+" ----> ");
            for (int j=0;j<graph[i].size();j++)
            {
            Edge e = graph[i].get(j);
            System.out.print(e.des+" ");
            }
            System.out.println();
        }
    }
}
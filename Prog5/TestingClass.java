/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestingClass
{
    public TestingClass(){
        //Build the graph
        int s, t;
        Graph g = new Graph();
        g.addVertex(0,1);        g.addVertex(0,2);        g.addVertex(1,2);        g.addVertex(1,3);
        g.addVertex(2,3);        g.addVertex(2,4);        g.addVertex(2,5);        g.addVertex(3,4);
        g.addVertex(3,5);        g.addVertex(4,5);

        //g.toString();

        s=0;t=5;
        String r = s+"";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g.longestPath(s,t, r));
        s=0;t=3; r = s+"";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g.longestPath(s,t, r));
        s=0;t=1; r = s+"";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g.longestPath(s,t, r));

        s = 5;t = 10;         
        Graph g6 = new Graph();        
        g6.addVertex(5,11); g6.addVertex(7,8);g6.addVertex(7,11);g6.addVertex(3,8);
        g6.addVertex(3,10);g6.addVertex(11,2);g6.addVertex(11,9);g6.addVertex(11,10);
        g6.addVertex(8,9);        
        String r6 = s + " ";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g6.longestPath(s,t, r6));
        s=5;t=2;r6 = s+" ";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g6.longestPath(s,t, r6));
        s=7;t=2;r6 = s+" ";
        System.out.println("Longest Path from: " + s + " to "+  t);
        System.out.println(g6.longestPath(s,t, r6));
    }

    public static void Main(String[] args) {
        new TestingClass();        
    }
}

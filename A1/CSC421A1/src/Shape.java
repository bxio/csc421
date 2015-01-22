/**
 *
 * @author bill
 */
public abstract class Shape {
    private int id;
    private Shape[] connectedTo;
    private Edge[] edges;
    
    public int getId(){
        return this.id;
    }
    
    public int getNumEdges(){
       return edges.length;
    }
    
    public String toString(){
        return ("ID: "+this.id+", I am a "+this.getNumEdges()+" sided shape.");
    }
}

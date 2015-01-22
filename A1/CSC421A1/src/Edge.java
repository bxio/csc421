/**
 *
 * @author bill
 */
public class Edge {
    private int id;
    private Point from;
    private Point to;
    private Shape belongsTo;
    
    public int getId() {
        return id;
    }

    public Point getFrom() {
        return from;
    }

    public void setFrom(Point from) {
        this.from = from;
    }

    public Point getTo() {
        return to;
    }

    public void setTo(Point to) {
        this.to = to;
    }

    public Shape getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(Shape belongsTo) {
        this.belongsTo = belongsTo;
    }
    
    /**
     *
     * @param s The shape in question
     * @return True if this edge is a part of that shape.
     */
    public boolean isAPartOf(Shape s){
        if(belongsTo.equals(s)){
            return true;
        }else{
            return false;
        }
    }
    
    public Edge (int id){
        this.id = id;
    }
}

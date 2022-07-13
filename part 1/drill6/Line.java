package lesson1.drill6;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = new Point(start);
        this.end = new Point(end);
    }
    public Line(Line other){
        this(other.start, other.end);
    }

    public Point getStart(){
        return this.start;
    }

    public Point getEnd(){
        return this.end;
    }

    public void setStart(Point start){
        this.start = new Point(start);
    }

    public void setEnd(Point end){
        this.end = new Point(end);
    }

    public double distance(){
        int ySolution = (this.end.getY()-this.start.getY())*(this.end.getY()-this.start.getY());
        int xSolution = (this.end.getX()-this.start.getX())*(this.end.getX()-this.start.getX());

        return Math.sqrt(xSolution+ySolution);
    }

    public double slope(){
        int ySolution = this.end.getY()-this.start.getY();
        int xSolution = this.end.getX()-this.start.getX();

        return (double)ySolution/xSolution;
    }
}

public class Point implements Comparable<Point> {
    private final int x;
    private final int y;
    
    public Point(int x, int y) {
        self.x = x;
        self.y = y;
    }

    public void draw() {
        StdDraw.point(this.x, this.y);
    }

    public void drawTo(Point that) {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    public String toString() {
       String output = String.format("(%d, %d)", this.x, this.y);
       return output;
    }

    public int compareTo(Point that) {
        if (this.y < that.y || ((this.y == that.y) && this.x < that.x) {
            return -1;
        } else if (this.y == that.y && this.x == that.y) {
            return 0;
        }
        else {
            return 1;
        }

    }

    public double slopeTo(Point that) {
        if (this.compareTo(that) == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        else if (this.x == that.x) {
            return +0.0;
        }
        else if (this.y == that.y) {
            return Double.POSITIVE_INFINITY;
        }
        else {
            return (double) (that.y - this.y) / (that.x - this.x)
        }
    }

    public Comparator<Point> slopeOrder() {

    }
}
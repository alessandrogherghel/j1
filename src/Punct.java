import static java.lang.Math.*;
public class Punct {
    double x,y;

    public Punct(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{"+x+","+y+"}";
    }
    public double Distanta(Punct p)
    {
        double x1,y1;
        x1=pow(p.x-this.x,2);
        y1=pow(p.y-this.y,2);
        return sqrt(x1+y1);
    }
}

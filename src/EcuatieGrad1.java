public class EcuatieGrad1 {

    private double a,b;

    public EcuatieGrad1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        if(b>0)
            return a+"x+"+b+"=0";
        else
            return a+"x"+b+"=0";
    }

    public double geta() {
        return a;
    }

    public double getb() {
        return b;
    }

    public void seta(double a) {
        this.a = a;
    }

    public void setb(double b) {
        this.b = b;
    }
    public double rezolva(){
        if(a!=0)
            return ((-1)*b)/a;
        else
        {
            System.out.println("impartire la zero schimba a te rog");
            return 0;
        }
    }



}

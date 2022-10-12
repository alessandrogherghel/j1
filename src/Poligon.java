import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Poligon {
    Punct[] p;
    int nrdelaturi;
    Poligon(File file)
    {
        int i=0;
        try {
            Scanner sc=new Scanner(file);
            nrdelaturi=Integer.parseInt(sc.nextLine());
            this.p=new Punct[nrdelaturi];
            while (i<nrdelaturi||sc.hasNextLine())
            {
                String[] cordonate;
                if(sc.hasNextLine())
                {
                    cordonate=sc.nextLine().split(" ");
                    if(cordonate.length==2)
                    {
                        p[i++]=new Punct(Double.parseDouble(cordonate[0]),Double.parseDouble(cordonate[1]));
                    }
                }
                else
                    break;
            }
        }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void nr()
    {
        System.out.println(nrdelaturi);
    }
    public void Cordonate()
    {
        for(int i=0;i<nrdelaturi;i++)
        {
            System.out.println(p[i]);
        }

    }
    public double Perimetru()
    {
        double suma=0;
        for(int i=0;i<=nrdelaturi;i++)
        {
            if(i+1<nrdelaturi)
            {
                System.out.println(p[i].Distanta(p[i+1]));
                suma+=p[i].Distanta(p[i+1]);
            }
        }
        suma+=p[nrdelaturi-1].Distanta(p[0]);
        System.out.println(p[nrdelaturi-1].Distanta(p[0]));
        return suma;
    }
}

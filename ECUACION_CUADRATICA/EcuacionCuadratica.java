
public class EcuacionCuadratica
{
    private static double a;
    private static double b;
    private static double c;


    public static void setA(double numA)
    {
        a = numA;
    }
    public static double getA()
    {
        return a;
    }
    public static void setB(double numB)
    {
        b = numB;
    }
    public static double getB()
    {
        return b;
    }
    public static void setC( double numC)
    {
        c = numC;
    }
    public static double getC()
    {
        return c;
    }
    public static double discriminante()
    {
        double expresion;
        expresion = Math.pow(getB(),2)-4*getA()*getC();
        return expresion;
    }

    public static double raices()
    {
        double raiz01;

        if (discriminante()>0)
        {
            System.out.println(" Dos soluciones distintas ");

            double raiz02;

            raiz01=(-getB()+Math.sqrt(discriminante()))/(2*getA());
            raiz02=(-getB()-Math.sqrt(discriminante()))/(2*getA());

            System.out.println(" X1 " + raiz01);
            System.out.println(" X2 " + raiz02);
        }
        else if (discriminante()==0)
        {
            System.out.println(" Una solucion doble ");

            raiz01=(-getB()/2*getA());
            System.out.println(" X1 " + raiz01);
        }
        else
        {
            System.out.println(" No hay solucion ");
        }
        return  0;
    }
}
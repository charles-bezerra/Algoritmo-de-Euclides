import java.util.Scanner;

public class Algoritmo
{
    private int resto = 1;
    private int resultado;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num A: ");
        int a = sc.nextInt();
        System.out.print("Num B: ");
        int b = sc.nextInt();

        Algoritmo al = new Algoritmo();

        System.out.println(al.Calculo(a,b));
    }
    public int Calculo(int a , int b)
    {
      int aux1;
      int aux2;
      if(a==0 || b==0)
      {
        this.resultado = 0;
      }
      else{
          if(a>b)
          {
            while (this.resto != 0)
            {
                aux1 = a;
                aux2 = b;

                b = a % b;

                a = aux2;
                this.resto = aux1%aux2;
                this.resultado = aux2;
            }
          }
          else if(b>a)
          {
            while (this.resto != 0)
            {
                aux1 = b;
                aux2 = a;

                a = b % a;

                b = aux2;
                this.resto = aux1%aux2;
                this.resultado = aux2;
            }
          }
          else{
            this.resultado = a;
          }
      }
      return this.resultado;
    }
}

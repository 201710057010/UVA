
/**
 * 
 * @author Eduard Damiam
 */
import java.util.Scanner;
public class Solucion
{
   
    public static void solucion (){
      Scanner entrada= new Scanner(System.in);
      String numeros = entrada.nextLine();
      String[] partes = numeros.split(" ");
      int x = Integer.parseInt(partes[0]);
      int z = Integer.parseInt(partes[1]);
      int y = solucionAux(x,z);
      System.out.println(x+ " " + z +" " + y);
    }
    
    private static int solucionAux(int a, int b){
      int maximo = 0;
        for(int i = a; i<=b; ++i){
           int x = funcion(i,1);
         if (x> maximo){
          maximo=x;
          }        
      }
      return maximo;
    }
    
    public static int funcion(int a, int cont){
        if (a==1){
           return cont; 
        }else if (a%2==1){
          cont++;
          int x = 3*a+1; 
          return funcion(x,cont); //t(n*3+1)
        }
        else {
          cont++;
          return funcion(a/2,cont); //    t(n/2)
        }
    }
}

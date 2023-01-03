import java.util.Scanner;

public class Calculadora {
    Scanner scan = new Scanner(System.in);
    int x;
    int y;
    int resultado;


    public void soma(){
        System.out.println("Informe os valores :");
        x =  scan.nextInt();
        System.out.println("+");
        y =  scan.nextInt();

        resultado = (x+y);
        System.out.println("\nO resultado é: " + resultado);
    }

    public void subtrai(){
        System.out.println("Informe os valores :");
        x =  scan.nextInt();
        System.out.println("-");
        y =  scan.nextInt();

        resultado = (x-y);
        System.out.println("\nO resultado é: " + resultado);
    }
    public void multiplica(){
        System.out.println("Informe os valores :");
        x =  scan.nextInt();
        System.out.println("*");
        y =  scan.nextInt();

        resultado = (x*y);
        System.out.println("\nO resultado é: " + resultado);
    }
    public void divide(){

        System.out.println("Informe os valores :");
        x =  scan.nextInt();
        if(x == 0){
            System.out.println("Não é possível dividir por 0 \nInsira um valor válido");
            return;
        }

        System.out.println("/");
        y =  scan.nextInt();
        if(y == 0){
            System.out.println("Não é possível dividir por 0 \nInsira um valor válido");
            return;
        }
        resultado = (x/y);
        System.out.println("\nO resultado é: " + resultado);
    }


}

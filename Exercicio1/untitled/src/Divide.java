import java.util.Scanner;

public class Divide {
    Scanner scan = new Scanner(System.in);
    float x;
    float y;
    float resultado;


    public void divideXeY(){

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

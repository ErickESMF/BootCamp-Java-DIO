import java.util.Scanner;

public class Multiplica {
    Scanner scan = new Scanner(System.in);
    int x;
    int y;
    int resultado;

    public void multiplicaXeY(){
        System.out.println("Informe os valores :");
        x =  scan.nextInt();
        System.out.println("*");
        y =  scan.nextInt();

        resultado = (x*y);
        System.out.println("\nO resultado é: " + resultado);
    }


}

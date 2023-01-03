import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    int hora2 = Integer.parseInt(hora);

    public void diaDeHoje(){
        System.out.println("Agora são " + hora +" do dia " + data);
    }
}

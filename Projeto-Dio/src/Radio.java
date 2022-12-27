public class Radio {
        boolean ligado = false;
        int     volume = 29;
        double  frequencia = 100.0;

public void ligarRadio() {
        if (!ligado){
             ligado = true;
                System.out.println("Radio ligado");
        } else {
                System.out.println("O radio já esta ligado");
        }
}
public void desligarRadio() {
        if (ligado){
                ligado = false;
                System.out.println("Radio desligado");
        } else {
                System.out.println("O radio já esta desligado");
                }
        }

public void aumentarVolume() {
        if (volume < 30) {
                volume++;
                System.out.println("Aumentando Volume");
        } else {
                System.out.println("Volume no maximo(30)");

        }
}

public void diminuirVolume(){
                if(volume >=1){
                        volume --;
                        System.out.println("Diminuindo Volume");
                } else {
                        System.out.println("Volume no minimo(1)");

                }
}

public void aumentarFrequencia(){
        frequencia ++;
        System.out.println(frequencia);
}
public void diminuirFrequencia(){
                frequencia --;
        System.out.println(frequencia);
        }
public void mudarFrequencia(double novaFrequencia){
        frequencia = novaFrequencia;
        System.out.println(frequencia);
}

}

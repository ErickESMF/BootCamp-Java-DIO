public class Usuario {public static void main(String[] args) {
    Radio radio = new Radio();

    System.out.println(radio.ligado);
    System.out.println(radio.volume);
    System.out.println(radio.frequencia);

    radio.ligarRadio();
    radio.desligarRadio();
    radio.aumentarVolume();
    radio.diminuirVolume();
    radio.aumentarFrequencia();
    radio.diminuirFrequencia();
    radio.mudarFrequencia(200.0);
}
}


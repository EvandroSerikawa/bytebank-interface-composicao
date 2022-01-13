public class testetributavel {
    public static void main(String[] args) {

        contacorrente04 novaContaCorente04 = new contacorrente04(23254 , 1234569 );
        novaContaCorente04.deposita(100);

        segurodevida novoSeguro = new segurodevida();

        calculaimposto calcula = new calculaimposto();
        calcula.registra(novaContaCorente04);
        calcula.registra(novoSeguro);

        System.out.println(calcula.getTotalImposto());

    }
}

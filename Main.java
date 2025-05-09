public class Main {

    public static void main(String[] args) {

        Ingresso[] ingressos = new Ingresso[4];

        ingressos[0] = new IngressoVip("UNIFARRA", true, 200.0, 2);
        ingressos[1] = new IngressoVip("SUMRISE", false, 99.0, 1);
        ingressos[2] = new IngressoComum("ALOHA", true, 899.98, 2 );
        ingressos[3] = new IngressoComum("CALORADA", false, 65.44, 1);

        for (Ingresso ingresso : ingressos) {
            System.out.println("Evento: " + ingresso.nome);
            System.out.println("Reembolso: R$ " + ingresso.CalcularReembolso());

    }    
}

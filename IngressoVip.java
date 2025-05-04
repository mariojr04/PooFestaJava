public class IngressoVip extends Ingresso{

    public IngressoVip(String nome, boolean ehMeia, double preco, int lote){
        super(nome, ehMeia, preco, lote);
    }

    @Override
    public double CalculaReembolso(double preco, boolean ehMeia){
        if (ehMeia = false || lote == 1){
            return preco * 0.1;
        }else {
            return preco * 0.06;
        }
    }

}

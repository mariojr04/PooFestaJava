public abstract class Ingresso{
    protected String nome;
    protected Boolean ehMeia;
    protected Double preco;
    protected int lote;

    public Ingresso (String nome, boolean ehMeia, double preco, int lote){
        this.nome = nome;
        this.ehMeia = ehMeia;
        this.preco = preco;
        this.lote = lote;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEhMeia(boolean ehMeia){
        this.ehMeia = ehMeia;
    }
    public boolean getEhMeia(){
        return this.ehMeia;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setLote(int lote){
        this.lote = lote;
    }
    public int getLote(){
        return this.lote;
    }

    
    public abstract double CalculaReembolso(double preco, boolean ehMeia);
}

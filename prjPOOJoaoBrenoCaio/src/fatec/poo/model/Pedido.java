package fatec.poo.model;



public class Pedido {
    
    private String numero,dataEmissao,dataPagto;
    private boolean formaPagto,situacao;
    private Vendedor vendedor; 
    private Cliente cliente;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    //SETTERS
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setDataEmissao(String dataEmissao){
        this.dataEmissao = dataEmissao;
    }
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    //GETTERS

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean FormaPagto() {
        return formaPagto;
    }

    public boolean Situacao() {
        return situacao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}

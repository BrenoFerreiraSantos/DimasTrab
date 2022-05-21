package fatec.poo.model;


public class Produto {
    private String codigo,descricao,UnidadeMedida;
    private double qtdeEstoque,preco,estoqueMinimo;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    //SETTERS
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUnidadeMedida(String UnidadeMedida) {
        this.UnidadeMedida = UnidadeMedida;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
    
    //GETTERS

    public String getDescricao() {
        return descricao;
    }

    public String getUnidadeMedida() {
        return UnidadeMedida;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }
    
}

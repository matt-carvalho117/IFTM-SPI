package br.edu.iftm.comercioeletronico;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private double precoUnitario;
    private boolean promocao;
    private static int totalProdutosCadastrados = 0;

    public Produto(String nome, int quantidadeInicial, double precoUnitario) throws Exception {
        this.nome = nome;
        setQuantidadeEstoque(quantidadeInicial);
        setPrecoUnitario(precoUnitario);
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) throws Exception{
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            throw new Exception("O valor da quantidade não pode ser menor que zero.");
        }
    }

    public void setPrecoUnitario(double precoUnitario) throws Exception{
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            throw new Exception("O valor do preço não deve ser menor ou igual a zero.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public boolean isPromocao() {
        return promocao;
    }
    
}

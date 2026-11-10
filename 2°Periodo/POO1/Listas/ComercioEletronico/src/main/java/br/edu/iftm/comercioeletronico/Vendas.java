package br.edu.iftm.comercioeletronico;

public class Vendas {

    private int quantidadeVendida;
    private double valorTotalVenda;

    private static double totalVendasMes = 0;

    public Vendas(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public boolean processarVenda(Produto produto) throws Exception {
        if (produto == null) {
            return false;
        }
        if (EstoqueUtil.temEstoqueDisponivel(produto.getQuantidadeEstoque(), this.quantidadeVendida)) {
            double valorBase = this.quantidadeVendida * produto.getPrecoUnitario();

            if (produto.isPromocao() && this.quantidadeVendida >= 3) {
                this.valorTotalVenda = valorBase * 0.90;
            } else {
                this.valorTotalVenda = valorBase;
            }
            
            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - this.quantidadeVendida);
            
            totalVendasMes += this.valorTotalVenda;
            
            return true;
        }

        return false;

    }
}

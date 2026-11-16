package br.edu.iftm.comercioeletronico;

public class App {

    public static void main(String[] args) {
        System.out.println("--- INICIALIZANDO SISTEMA DE ESTOQUE ---\n");

        Produto p1 = null;
        Produto p2 = null;
        Produto p3 = null;

        try {
            p1 = new Produto("Notebook", 10, 3500.00);
            p2 = new Produto("Mouse Sem Fio", 50, 90.00);
            p3 = new Produto("Teclado Mecânico", 5, 150.00);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produtos: " + e.getMessage());
        }

        System.out.println("Total de tipos de produtos cadastrados: " + Produto.getTotalProdutosCadastrados());
        System.out.println("Faturamento inicial do mês: " + EstoqueUtil.formatarMoeda(Vendas.getTotalVendasMes()));
        System.out.println("----------------------------------------");

        try {
            System.out.println("Tentando vender 2 Notebooks sem promoção...");
            Vendas v1 = new Vendas(2);
            if (v1.processarVenda(p1)) {
                System.out.println("Venda realizada com sucesso!");
                exibirRecibo(p1, v1);
                System.out.println("Estoque atualizado (" + p1.getNome() + "): " + p1.getQuantidadeEstoque());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("----------------------------------------");

        try {
            System.out.println("Tentando vender 6 Teclados (Estoque atual é " + p3.getQuantidadeEstoque() + ")...");
            Vendas v2 = new Vendas(6);
            if (!v2.processarVenda(p3)) {
                System.out.println("Erro: Estoque insuficiente para o produto " + p3.getNome());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("----------------------------------------");

        try {
            System.out.println("Tentando vender 5 Mouses sem promoção...");
            Vendas vSemPromo = new Vendas(5);
            if (vSemPromo.processarVenda(p2)) {
                System.out.println("Venda realizada com sucesso!");
                exibirRecibo(p2, vSemPromo);
            }
            System.out.println("----------------------------------------");

            System.out.println("Tentando vender 5 Mouses com promoção...");
            p2.setPromocao(true);
            Vendas vComPromo = new Vendas(5);
            if (vComPromo.processarVenda(p2)) {
                System.out.println("Venda realizada com sucesso!");
                exibirRecibo(p2, vComPromo);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("----------------------------------------\n");

        System.out.println("--- FECHAMENTO DO MÊS ---\n");
        System.out.println("Faturamento Total Acumulado: " + EstoqueUtil.formatarMoeda(Vendas.getTotalVendasMes()));
    }

    private static void exibirRecibo(Produto produto, Vendas venda) {
        System.out.println("Item: " + produto.getNome());
        System.out.println("Qtd: " + venda.getQuantidadeVendida());
        System.out.println("Preço Unitário: " + EstoqueUtil.formatarMoeda(produto.getPrecoUnitario()));
        System.out.println("Promoção: " + (produto.isPromocao() ? "SIM" : "NÃO"));
        System.out.println("Total da Venda: " + EstoqueUtil.formatarMoeda(venda.getValorTotalVenda()));
    }
}

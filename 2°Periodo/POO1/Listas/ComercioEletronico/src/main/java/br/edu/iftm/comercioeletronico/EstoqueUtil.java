package br.edu.iftm.comercioeletronico;
import java.util.Locale;

public class EstoqueUtil {
    private EstoqueUtil(){};
    
    public static boolean temEstoqueDisponivel(int estoqueAtual, int quantidadeDesejada){
        return estoqueAtual >= quantidadeDesejada;
    }
    
    public static String formatarMoeda(double valor){
         return String.format(new Locale("pt", "BR"), "R$ %,.2f", valor);
    }
}

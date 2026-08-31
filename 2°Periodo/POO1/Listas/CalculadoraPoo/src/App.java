import javax.swing.JOptionPane;

public class App {
    public static int ler(int num) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + num + "° termo:"));
    }

    public static void exibirResultado(int a, int b, int s, String tipo) {
        switch (tipo) {
            case "soma":
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + s);
                break;
            case "subtração":
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + s);
                break;
            case "multiplicação":
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + s);
                break;
            case "divisão":
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + s);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        int a, b, s, op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha uma operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair"));
            
            switch (op) {
                case 1:
                    a = ler(1);
                    b = ler(2);
                    Adicao adicao = new Adicao(a, b);
                    s = adicao.soma();
                    exibirResultado(a, b, s, "soma");
                    break;
                case 2:
                    a = ler(1);
                    b = ler(2);
                    Subtracao subtracao = new Subtracao(a, b);
                    s = subtracao.subtrai();
                    exibirResultado(a, b, s, "subtração");
                    break;
                case 3:
                    a = ler(1);
                    b = ler(2);
                    Multiplicacao multiplicacao = new Multiplicacao(a, b);
                    s = multiplicacao.multiplicar();
                    exibirResultado(a, b, s, "multiplicação");
                    break;
                case 4:
                    a = ler(1);
                    b = ler(2);
                    Divisao divisao = new Divisao(a, b);
                    s = divisao.dividir();
                    exibirResultado(a, b, s, "divisão");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            } 
            
        } while (op != 5); 
        
    } 
} 

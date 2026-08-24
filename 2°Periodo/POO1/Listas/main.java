import javax.swing.JOptionPane;

public class main {

    // EX1
    public static void exe1() {
        int x, y;

        x = ler1(1);
        y = ler1(2);

        if (x < y) {
            exibir1(x, y, 1);
        } else if (x > y) {
            exibir1(x, y, 2);
        } else {
            exibir1(x, y, 3);
        }

    }

    public static int ler1(int num) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + num + "° numero:"));
    }

    public static void exibir1(int x, int y, int sit) {
        switch (sit) {
            case 1 -> JOptionPane.showMessageDialog(null, x + " é menor que " + y);
            case 2 -> JOptionPane.showMessageDialog(null, x + " é maior que " + y);
            case 3 -> JOptionPane.showMessageDialog(null, x + " é igual a " + y);

        }
    }

    // EX2
    public static void exe2() {
        int a, b, c;
        double x1, x2;
        a = ler2(1);
        b = ler2(2);
        c = ler2(3);

        double delta = Math.sqrt((b * b) - (4 * a * c));
        x1 = (-b + delta) / (2 * a);
        x2 = (-b - delta) / (2 * a);

        exibir2(x1, x2);

    }

    public static int ler2(int num) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + num + "° termo:"));
    }

    public static void exibir2(double x1, double x2) {
        JOptionPane.showMessageDialog(null, "As raizes são\nX1 =  " + x1 + "\nX2 = " + x2);
    }

    // EX3
    public static void exe3() {
        int n1, n2, media;

        n1 = ler3(1);
        n2 = ler3(2);

        media = ((n1 + n2) / 2);

        exibir3(media);
    }

    public static int ler3(int num) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + num + "° numero:"));
    }

    public static void exibir3(int media) {
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }

    // EX4
    public static void exe4() {
        int l1, l2, l3;

        l1 = ler4(1);
        l2 = ler4(2);
        l3 = ler4(3);

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

            if (l1 == l2 && l2 == l3) {
                exibir4(1);
            } else if (l1 == l2 || l2 == l3 || l3 == l1) {
                exibir4(2);
            } else if (l1 != l2 && l2 != l3 && l3 != l1) {
                exibir4(3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os valores informados não formam um triangulo!");
        }

    }

    public static int ler4(int num) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do " + num + "° lado:"));
    }

    public static void exibir4(int sit) {
        switch (sit) {
            case 1 -> JOptionPane.showMessageDialog(null, "Triangulo Equilátero");
            case 2 -> JOptionPane.showMessageDialog(null, "Triangulo Isósceles");
            case 3 -> JOptionPane.showMessageDialog(null, "Triangulo Escaleno");
        }
    }

    // EX5
    public static void exe5() {
        int soma = 0;
        int somaNeg = 0;
        int somaPos = 0;

        int n = ler5();

        while (n != 0) {
            soma += n;

            if (soma >= 0) {
                somaPos++;
            } else {
                somaNeg++;
            }
            n = ler5();
        }

        exibir5(somaPos, somaNeg);

    }

    public static int ler5() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
    }

    public static void exibir5(int somaPos, int somaNeg) {
        JOptionPane.showMessageDialog(null, "Somas positivas = " + somaPos + "\nSomas negativas = " + somaNeg);
    }

    // EX06
    public static void exe6() {
        int n = ler6();
        exibir6(n);
        char op = lerOp();

        while (op == 's' || op == 'S') {
            n = ler6();
            exibir6(n);
            op = lerOp();
        }
    }

    public static int ler6() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para exibir seus fatores:"));
    }

    public static char lerOp() {
        return JOptionPane.showInputDialog(null, "Deseja digitar novamente?").charAt(0);
    }

    public static String fatores6(int n) {
        String results = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                results += i + " ";
            }
        }
        return results;
    }

    public static void exibir6(int n) {
        JOptionPane.showMessageDialog(null, "Os fatores de " + n + " são: " + fatores6(n));
    }

    // EXE07
    public static void exe7() {
        int n = ler7();
        int qtdPares = 0;
        int somaPares = 0;
        int qtdImpares = 0;
        int somaImpares = 0;
        int qtdPositivos = 0;
        int somaPositivos = 0;
        int qtdNegativos = 0;
        int somaNegativos = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                qtdPares++;
                somaPares += n;
            } else {
                qtdImpares++;
                somaImpares += n;
            }
            if (n > 0) {
                qtdPositivos++;
                somaPositivos += n;
            } else {
                qtdNegativos++;
                somaNegativos += n;
            }
            n = ler7();
        }
        exibir7(qtdPares, somaPares, qtdImpares, somaImpares, qtdPositivos, somaPositivos, qtdNegativos, somaNegativos);
    }

    public static int ler7() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de cada vez:"));
    }

    public static void exibir7(int qtdPares, int somaPares, int qtdImpares, int somaImpares, int qtdPositivos,
            int somaPositivos, int qtdNegativos, int somaNegativos) {
        JOptionPane.showMessageDialog(null,
                "Quantidade de números pares: " + qtdPares + "\nSoma dos números pares: " + somaPares
                        + "\nQuantidade de números ímpares: " + qtdImpares + "\nSoma dos números ímpares: "
                        + somaImpares + "\nQuantidade de números positivos: " + qtdPositivos
                        + "\nSoma dos números positivos: " + somaPositivos + "\nQuantidade de números negativos: "
                        + qtdNegativos + "\nSoma dos números negativos: " + somaNegativos);
    }

    // EXE08
    public static void exe8() {
        int n = ler8();

        if (n > 1) {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            exibir8(n, isPrimo);
        } else {
            JOptionPane.showMessageDialog(null, n + " o numero deve ser maior que 1 para ser considerado primo!");
        }
    }

    public static int ler8() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
    }

    public static void exibir8(int n, boolean isPrimo) {
        if (isPrimo) {
            JOptionPane.showMessageDialog(null, n + " é primo!");
        } else {
            JOptionPane.showMessageDialog(null, n + " não é primo!");
        }
    }

    // EXE09
    public static void exe9() {
        int n = ler9();
        exibir9(n);
    }

    public static int calcularFatorial9(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFatorial9(n - 1);
        }
    }

    public static int ler9() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para exibir seu fatorial:"));
    }

    public static void exibir9(int n) {
        JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é: " + calcularFatorial9(n));
    }

    //EXE10
    
    public static void main(String[] args) {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "            LISTA - 01 POO\n\n" +
                            "1 - Comparar Números\n" +
                            "2 - Equação do Segundo Grau\n" +
                            "3 - Média de 2 Números\n" +
                            "4 - Tipos de Triângulos\n" +
                            "5 - Somar Positivos e Negativos\n" +
                            "6 - Fatores de um Número\n" +
                            "7 - Estatísticas de Números\n" +
                            "8 - Verificar Número Primo\n" +
                            "9 - Calcular Fatorial\n" +
                            "10 - Calcular MMC\n" +
                            "11 - Calcular MDC\n" +
                            "12 - Sequência de Fibonacci\n" +
                            "13 - Progressão Aritmética (PA)\n" +
                            "14 - Soma de PG\n" +
                            "15 - Tabuada de 1 a 10\n" +
                            "16 - Verificar Número Perfeito\n" +
                            "17 - Sair\n\n" +
                            "Selecione uma opção:"));

            switch (op) {
                case 1 -> exe1();
                case 2 -> exe2();
                case 3 -> exe3();
                case 4 -> exe4();
                case 5 -> exe5();
                case 6 -> exe6();
                case 7 -> exe7(); 
                case 8 -> exe8();
                case 9 -> exe9();
                /*
                 * 
                 * case 10 -> exe10();
                 * case 11 -> exe11();
                 * case 12 -> exe12();
                 * case 13 -> exe13();
                 * case 14 -> exe14();
                 * case 15 -> exe15();
                 * case 16 -> exe16();
                 */
            }
        } while (op != 17);
    }

}

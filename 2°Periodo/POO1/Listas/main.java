import javax.swing.JOptionPane;

public class main {

    //EX1
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

    //EX2
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

    //EX3
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

    //EX4
    public static void exe4() {
        int l1, l2, l3;

        l1 = ler4(1);
        l2 = ler4(2);
        l3 = ler4(3);

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

            if (l1 == l2 && l2 == l3) {
                exibir4(1);
            } 
            else if (l1 == l2 || l2 == l3 || l3 == l1) {
                exibir4(2);
            }
            else if (l1 != l2 && l2 != l3 && l3 != l1) {
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

    
    //EX5
    public static void exe5(){
       int soma = 0;
       int somaNeg = 0;
       int somaPos = 0;
       
       int n = ler5();
       
       while(n != 0){
           soma += n;
           
           if(soma >= 0){
               somaPos++;
           }
           else{
               somaNeg++;
           }
           n = ler5();
       }
       
       exibir5(somaPos, somaNeg);
      
    }
    
    public static int ler5(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
    }
   
    public static void exibir5(int somaPos, int somaNeg){
        JOptionPane.showMessageDialog(null, "Somas positivas = " + somaPos + "\nSomas negativas = " + somaNeg);
    }
    
    
    public static void main(String[] args) {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("LISTA - 01   POO\n\n1- Comparar Números\n2- Equação do Segundo Grau\n3- Média 2 números\n4- Tipos de Triângulos\n5- Somar positivos e negativos\n17- Sair\n\nSelecione uma opcão:"));

            switch (op) {
                case 1 -> exe1();
                case 2 -> exe2();
                case 3 -> exe3();
                case 4 -> exe4();
                case 5 -> exe5();
            }
        } while (op != 17);
    }

}

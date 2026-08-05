import javax.swing.JOptionPane;

public class main
{
    //EX1
    public static void exe1(){
        int x, y;

        x = ler1(1);
        y = ler1(2);

        if(x < y){
            exibir1(x, y, 1);
        }
        else if(x > y){
            exibir1(x, y, 2);
        }
        else{
            exibir1(x, y, 3);
        }

    }

    public static int ler1(int num){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o " + num + "° numero:"));
    }

    public static void exibir1(int x, int y, int sit){
        if(sit == 1){
            JOptionPane.showMessageDialog(null, x + " é menor que " + y );
        }
        else if(sit == 2){
            JOptionPane.showMessageDialog(null, x + " é maior que " + y );
        }
        else if(sit == 3){
            JOptionPane.showMessageDialog(null, x + " é igual a " + y );
        }
    }


    //EX2
    public static void exe2(){
        int a, b, c;
        double x1, x2;
        a = ler2(1);
        b = ler2(2);
        c = ler2(3);
        
        double delta = Math.sqrt((b*b)-(4*a*c));
        x1 = (-b+delta)/(2*a);
        x2 = (-b-delta)/(2*a);
   
        exibir2(x1, x2);
        
    }

    public static int ler2(int num){
        return  Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o " + num + "° termo:"));
    }

    public static void exibir2(double x1, double x2){
        JOptionPane.showMessageDialog(null, "As raizes são\nX1 =  " + x1 + "\nX2 = " + x2 );
    }

    
    //EX3
    public static void exe3(){
        int n1, n2, media;

        n1 = ler3(1);
        n2 = ler3(2);

        media = ((n1+n2)/2);

        exibir3(media);
    }

    public static int ler3(int num){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o " + num + "° numero:"));
    }
    
    public static void exibir3(int media){
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
   

    //EX4


	public static void main(String[] args) {
        int op;
        do{
           op = Integer.parseInt(JOptionPane.showInputDialog("LISTA - 01   POO\n\n1- Comparar Números\n2- Equação do Segundo Grau\n3- Média 2 números \n\n\n17- Sair\n\nSelecione uma opcão:"));
  

            switch (op) {
                case 1:
                    exe1();
                    break;
                case 2:
                    exe2();
                    break;
                case 3:
                    exe3();
                    break;

            }
        }while(op != 17);
	}

}

import java.util.Scanner;
public class App {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        menu();
    }
    public static void menu(){

        int opFigura = 0;
        do{
            System.out.println("\nFIGURA");
            System.out.println("1 - Circulo");
            System.out.println("2 - Triangulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - SAIR");
            System.out.print("DIGITE A OPÇÃO: ");
            opFigura = s.nextInt();

            if(opFigura >= 1 && opFigura <= 3){
                FigurasGeometricas figura = le(opFigura);

                int opAcao = 0;

                do{
                    System.out.println("\nAÇÕES");
                    System.out.println("1 - Exibir Dados");
                    System.out.println("2 - Área");
                    System.out.println("3 - Voltar");
                    System.out.print("DIGITE A OPÇÃO: ");
                    opAcao = s.nextInt();
                    
                   switch (opAcao) {
                        case 1:
                            if (opFigura == 1) System.out.println(figura.exibeCirculo());
                            else if (opFigura == 2) System.out.println(figura.exibeTriangulo());
                            else System.out.println(figura.exibeQuadrado());
                            break;
                        case 2:
                            if (opFigura == 1) System.out.printf("Área do Círculo: %.2f\n", figura.areaCirculo());
                            else if (opFigura == 2) System.out.printf("Área do Triângulo: %.2f\n", figura.areaTriangulo());
                            else System.out.printf("Área do Quadrado: %.2f\n", figura.areaQuadrado());
                            break;
                        case 3:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opAcao != 3);

            } else if (opFigura == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opFigura != 4);
    }

    public static FigurasGeometricas le(int opcao) {
        switch (opcao) {
            case 1: 
                System.out.print("Digite a coordenada X do centro (xc): ");
                double xc = s.nextDouble();
                System.out.print("Digite a coordenada Y do centro (yc): ");
                double yc = s.nextDouble();
                System.out.print("Digite o raio: ");
                double raio = s.nextDouble();
                return new FigurasGeometricas(xc, yc, raio);

            case 2: 
                System.out.print("Digite a base: ");
                double base = s.nextDouble();
                System.out.print("Digite a altura: ");
                double altura = s.nextDouble();
                return new FigurasGeometricas(base, altura);

            case 3:
                System.out.print("Digite o lado: ");
                double lado = s.nextDouble();
                return new FigurasGeometricas(lado);

            default:
                return null;
        }
    }
}

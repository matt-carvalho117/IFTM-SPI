import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String limpar = "\033[H\033[2J";
	    String erro = "\u001B[31m[ERRO]\u001B[0m";
	    String ok = "\u001B[32m[OK]\u001B[0m";
	    String atencao = "\u001B[33m[ATENCAO]\u001B[0m";
	    
	    int op = 0;
	    String nomeLotePlanta = ""; 
	    int diasPlantio = 0;
	    double alturaAtual = 0;
	    double mediaAgua = 0;
	    int irrigacoes = 0;
	    char cont = ' ';
	    
	    int cadastro = 0;
	    int qtdMax = 1000;
	    String vetNomeLotePlanta[] = new String[qtdMax];
	    int vetDiasPlantio[] = new int[qtdMax];
	    double vetAlturaAtual[] = new double[qtdMax];
	    int vetQtdAgua[] = new int[qtdMax];
	    double matConsumoAgua[][] = new double[qtdMax][qtdMax];
	    
	    while(op != 5){
	             op = menuPrincipal(s);
	        
	        switch(op){
	            //Cadastro
	            case 1:
	                cadastrar(nomeLotePlanta, vetNomeLotePlanta,  diasPlantio, vetDiasPlantio, alturaAtual,  vetAlturaAtual,  mediaAgua, vetQtdAgua, matConsumoAgua, s, limpar, erro, cadastro, irrigacoes, ok);
	                cadastro++;
	                break;
	                
	            //Relatório    
	            case 2:
	                System.out.println(limpar);
	                
	                if(cadastro == 0){
	                    System.out.println(erro + " Ainda não foi realizado um cadastro. Insira os dados e tente novamente.");
	                    s.nextLine();
	                    s.nextLine();
	                    System.out.print(limpar);
	                    
	                }else{
    	                System.out.println("===============================");
    	                System.out.println("Relatório: Plantas Cadastradas");
    	                System.out.println("===============================");
    	                System.out.println();
    	                System.out.println("Id\t|\tLote/planta\t|\tIdade\t|\tAltura\t|\tMedia Agua");
    	                
    	                for(int i = 0; i < cadastro; i++){
    	                   mediaAgua = 0;
    	                   System.out.printf("%d\t|\t%s\t|\t%d\t|\t%.1f\t|\t", cadastro,vetNomeLotePlanta[i], vetDiasPlantio[i], vetAlturaAtual[i]);
    	                       for(int j = 0; j < vetQtdAgua[i]; j++){
    	                           mediaAgua += matConsumoAgua[i][j];
    	                       }
    	                 mediaAgua /= vetQtdAgua[i];
    	                 System.out.printf("%.2f\n", mediaAgua);
    	                }
    	                
    	                System.out.println();
    	                System.out.println(ok + " Relatório gerado com sucesso. Pressione qualquer tecla para voltar ao menu.");
    	                s.nextLine();
    	                s.nextLine();
    	                System.out.println(limpar);
	                }
	                
	                break;
	            
	           //Atualizar
	            case 3:
	                System.out.println(limpar);
	                s.nextLine();
	                if(cadastro >= 1){
	                    System.out.println(atencao + " Foram detectados registros no sistema. Esta ação irá sobrescrever estes dados.");
	                    System.out.print("Deseja continuar? S/N");
	                    cont = s.next().charAt(0);
	                    while(cont != 's' && cont != 'S' && cont != 'n' && cont != 'N'){
	                        System.out.println("Entrada invalida");
	                        cont = s.next().charAt(0);
	                        
	                    }
	                    if(cont == 'n' || cont == 'N'){
	                        System.out.println(limpar);
	                        break;
	                    }
	                    System.out.println(limpar);
	                    s.nextLine();
	                    
	                    if(cont == 's' || cont == 'S'){
        	                System.out.println("==================================");
        	                System.out.println("Relatório: Plantas Cadastradas");
        	                System.out.println("==================================");
        	                System.out.println("Id\t|\tLote/planta\t|\tIdade\t|\tAltura\t|\tMedia Agua");
        	                
        	                for(int i = 0; i < cadastro; i++){
        	                   mediaAgua = 0;
    	                       System.out.printf("%d\t|\t%s\t|\t%d\t|\t%.1f\t|\t", cadastro,vetNomeLotePlanta[i], vetDiasPlantio[i], vetAlturaAtual[i]);
        	                       for(int j = 0; j < vetQtdAgua[i]; j++){
        	                           mediaAgua += matConsumoAgua[i][j];
        	                       }
        	                 mediaAgua /= vetQtdAgua[i];
        	                 System.out.printf("%.2f\n", mediaAgua);
        	                }
        	                
	                        System.out.println("Qual planta deseja alterar?");
	                        int numeroPlantaAlterar = s.nextInt();
	                        numeroPlantaAlterar--;
	                        
	                        int opAlterar = 0;
	                        
	                        while(opAlterar != 5){
	                            System.out.println("O que deseja alterar?");
	                            System.out.println();
	                            System.out.println("1. Lote/planta");
	                            System.out.println("2. Dias desde o plantio");
	                            System.out.println("3. Altura");
	                            System.out.println("4. Quantidade de irrigacoes e agua");
	                            System.out.println("5. Voltar");
	                            System.out.println();
	                            System.out.print("Digite uma opção: ");
	                            opAlterar = s.nextInt();
	                            s.nextLine();
	                            switch(opAlterar){
	                                case 1:
	                                    
                    	                System.out.print("Insira o novo nome da planta e o lote: ");
                    	                nomeLotePlanta = s.nextLine();
	                                    
	                                    vetNomeLotePlanta[numeroPlantaAlterar] = nomeLotePlanta;
	                                    
	                                    concluido(ok, s, limpar);
	                                    break;
	                                case 2:
	                                    
                    	                System.out.print("Insira os novos dias desde o plantio: ");
                    	                diasPlantio = s.nextInt();
                    	                
                    	                if(diasPlantio < 0){
                    	                    System.out.println(erro + " Entrada invalida. Os dias devem ser maiores que 0.");
                    	                    System.out.print("Insira os dias desde o plantio: ");
                    	                    diasPlantio = s.nextInt();
                    	                }
                    	                vetDiasPlantio[numeroPlantaAlterar] = diasPlantio;
	                                    concluido(ok, s, limpar);
	                                    break;
	                               case 3:
                    	                System.out.print("Insira a nova altura da planta (cm): ");
                    	                alturaAtual = s.nextDouble();
                    	                
                    	                
                    	                if(alturaAtual < 0){
                    	                    System.out.println(erro + " Entrada invalida. A altura deve ser maior que 0.");
                    	                    System.out.print("Insira a altura da planta: ");
                    	                    alturaAtual = s.nextDouble();
                    	                }
                    	                
                    	                vetAlturaAtual[numeroPlantaAlterar] = alturaAtual;
	                                    concluido(ok, s, limpar);
	                                    
	                                    break;
	                               case 4:
                    	                System.out.print("Quantas irrigações foram feitas nesta semana? ");
                    	                irrigacoes = s.nextInt();
                    	                
                    	                if(irrigacoes < 0){
                    	                    System.out.println(erro + " Impossivel inserir irrigacoes menores que zero. Tente novamente.");
                    	                    irrigacoes = s.nextInt();
                    	                }
                    	                vetQtdAgua[numeroPlantaAlterar] = irrigacoes;
                    	                
                    	                
                        	           System.out.println("Insira a nova quantidade de água de cada irrigação (ml): ");
                        	                
                        	                for(int i = 0; i < irrigacoes; i++){
                        	                    double quantidadeAgua = s.nextDouble();
                        	                    matConsumoAgua[numeroPlantaAlterar][i] = quantidadeAgua;
                        	                }
	                                   concluido(ok, s, limpar);
	                                   
	                                   break;
	                            }
	                            
	                        }
	                        
	                    }
	                }else{
	                    System.out.println(erro + " Não foram detectados registros no sistema. Realize um cadastro e tente novamente.");
	                    s.nextLine();
	                    System.out.println(limpar);
	                }
	                
	                break;
	            //Limpar
	            case 4:
	                System.out.println(limpar);
	                s.nextLine();
	                if(cadastro >= 1){
	                    System.out.println(atencao + " Foram detectados registros no sistema. Tal ação irá apagar todos os dados de forma permanente.");
	                    System.out.print("Deseja continuar? S/N ");
	                    cont = s.next().charAt(0);
	                    while(cont != 's' && cont != 'S' && cont != 'n' && cont != 'N'){
	                        System.out.println("Entrada invalida");
	                        cont = s.next().charAt(0);
	                        
	                    }
	                    if(cont == 'n' || cont == 'N'){
	                        System.out.println(limpar);
	                        break;
	                    }
	                    System.out.println(limpar);
	                    s.nextLine();
	                    
	                    if(cont == 's' || cont == 'S'){
	                        System.out.println("Selecione a planta que deseja apagar");
	                        for(int i = 0; i < cadastro; i++){
	                            System.out.println((i+1) + ". " + vetNomeLotePlanta[i]);
	                        }
	                        System.out.print("Digite o numero da planta: ");
	                        int pos = s.nextInt();
	                        
	                        if(pos <= cadastro+1 && pos >=1){
	                            for(int i = pos; i < cadastro; i++){
	                                vetNomeLotePlanta[i-1] = vetNomeLotePlanta[i];
	                                vetDiasPlantio[i-1] = vetDiasPlantio[i];
	                                vetAlturaAtual[i-1] = vetAlturaAtual[i];
	                                vetQtdAgua[i-1] = vetQtdAgua[i];
	                                for(int j = 0; j <cadastro; j++){
	                                    matConsumoAgua[i-1][j] = matConsumoAgua[i][j];
	                                }
	                            }
	                            cadastro--;
    	                        System.out.println(ok + " Registros deletados com sucesso. Pressione qualquer tecla para voltar ao menu.");
    	                        s.nextLine();
    	                        s.nextLine();
    	                        System.out.println(limpar);
	                        }else{
	                            System.out.println("Valor Invalido");
	                        }
	                        
	                        
	                    }else{
	                        System.out.println(limpar);
	                    }
	                }else{
	                    System.out.println(erro + " Não foram detectados registros no sistema. Realize um cadastro e tente novamente.");
	                    s.nextLine();
	                    System.out.println(limpar);
	                }
	                break;
	  
	            case 5:
	                System.out.println(limpar);
	                System.out.println(ok + " Logout realizado com sucesso.");
	                break;
	                
	           default:
	                System.out.println(limpar);
	                System.out.println(erro + " Opção inválida, tente novamente. Opções disponiveis 1 ao 5.");
	        }
	        
	    }
	}
	public static int menuPrincipal(Scanner s){
	        System.out.println("____________________________________");
	        System.out.println("|                                  |");
	        System.out.println("| Laborátorio de Pesquisa Botânica |");
	        System.out.println("|  Usuario: Admin  |  Versão: 3.0  |");
	        System.out.println("|__________________________________|");
	        System.out.println("____________________________________");
	        System.out.println("|                                  |");
	        System.out.println("| 1 - Novo Cadastro                |");
	        System.out.println("| 2 - Gerar Relatório              |");
	        System.out.println("| 3 - Atualizar dados              |");
	        System.out.println("| 4 - Apagar registro (Cuidado)    |");
	        System.out.println("| 5 - Logout                       |");
	        System.out.println("|__________________________________|");
	        System.out.println();
	        System.out.print("Selecione uma opção: ");
	        int op = s.nextInt();
	       return op;
	                
	}
	public static void cadastrar(String nomeLotePlanta, String vetNomeLotePlanta[], int diasPlantio, int vetDiasPlantio[], double alturaAtual, double vetAlturaAtual[], double mediaAgua, int vetQtdAgua[], double matConsumoAgua[][], Scanner s, String limpar, String erro, int cadastro, int irrigacoes, String ok){
	                s.nextLine();
	                System.out.println(limpar);
	                System.out.println("+----------------------------+");
	                System.out.println("| Bem-vindo ao cadastramento |");
	                System.out.println("+----------------------------+");
	                System.out.println();
	                
	                //Ler lote
	                System.out.print("Insira o nome da planta e o lote: ");
	                nomeLotePlanta = s.nextLine();
	                
	                //Ler dias
	                System.out.print("Insira os dias desde o plantio: ");
	                diasPlantio = s.nextInt();
	                
	                if(diasPlantio < 0){
	                    System.out.println(erro + " Entrada invalida. Os dias devem ser maiores que 0.");
	                    System.out.print("Insira os dias desde o plantio: ");
	                    diasPlantio = s.nextInt();
	                }
	                
	                //Ler altura
	                System.out.print("Insira a altura da planta (cm): ");
	                alturaAtual = s.nextDouble();
	                
	                
	                if(alturaAtual < 0){
	                    System.out.println(erro + " Entrada invalida. A altura deve ser maior que 0.");
	                    System.out.print("Insira a altura da planta: ");
	                    alturaAtual = s.nextDouble();
	                }
	               
	                //Armazenar nos vetores
	                vetNomeLotePlanta[cadastro] = nomeLotePlanta;
	                vetDiasPlantio[cadastro] = diasPlantio;
	                vetAlturaAtual[cadastro] = alturaAtual;
	                
	                
	                //Ler irrigações
	                System.out.print("Quantas irrigações foram feitas nesta semana? ");
	                irrigacoes = s.nextInt();
	                
	                if(irrigacoes < 0){
	                    System.out.println(erro + " Impossivel inserir irrigacoes menores que zero. Tente novamente.");
	                    irrigacoes = s.nextInt();
	                }
	                vetQtdAgua[cadastro] = irrigacoes;
	                
	                
    	           System.out.println("Insira a quantidade de água de cada irrigação (ml): ");
    	                
    	                for(int i = 0; i < irrigacoes; i++){
    	                    double quantidadeAgua = s.nextDouble();
    	                    matConsumoAgua[cadastro][i] = quantidadeAgua;
    	                }
    	                
    	                

    	           System.out.println(ok + " Cadastro concluido com sucesso. Pressione qualquer tecla para voltar ao menu.");
    	           s.nextLine();
    	           s.nextLine();
    	           System.out.println(limpar);
	}
	public static void concluido(String ok, Scanner s, String limpar){
	                    System.out.println(ok + " Registros atualizados com sucesso. Pressione qualquer tecla para voltar.");
	                    s.nextLine();
	                    System.out.println(limpar);
	    
	}
}

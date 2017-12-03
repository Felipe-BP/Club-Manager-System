/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Felipe Bueno de Paula, Igor Fernando e João Victor Marcolino
 */
public class Principal {
    public static Modalidade[] modalidades = new Modalidade[5];
    public static Endereco[] enderecos = new Endereco[5];
    public static Socio[] socios = new Socio[5];
    public static Titulo[] titulos = new Titulo[5];
    
    public static void listaModalidade(){
        for(Modalidade modalidade : modalidades){
            modalidade.toString();
        }
    }
    
    public static void listaEndereco(){
        for(Endereco endereco : enderecos){
            endereco.toString();
        }
    }
    
    public static void listaSocio(){
        for(Socio socio : socios){
            socio.toString();
        }
    }
    
    public static void listaTitulo(){
        for(Titulo titulo : titulos){
            titulo.toString();
        }
    }
    
    public static void main(String args[]){
        int flag;
        do{
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1)CADASTRAR");
            System.out.println("2)PESQUISAR");
            System.out.println("3)REALIZAR UMA MATRÍCULA");
            System.out.println("4)DESMATRICULAR");
            System.out.println("5)FAZER O CALCULO DA MENSALIDADE");
            System.out.println("6)SAIR");
            flag = Leitura.lerInt();
            if(flag==1){
                menuCadastro();
            }
            if(flag==2){
                menuPesquisa();
            }
            if(flag==3){
                matricularSocio(); 
            }
            if(flag==4){
                desmatricularSocio();
            }
            if(flag==5){
                
            }
            if(flag==6){
                System.exit(0);
            }
        } while(flag>=1 && flag<=6);
        System.out.println("Sua entrada foi inválida!");
    }
    
    public static void menuCadastro(){
        int opcao;
        System.out.println("MENU DE CADASTRAMENTO!");
        System.out.println("1)Modalidade");
        System.out.println("2)Endereco");
        System.out.println("3)Socio");
        System.out.println("4)Titulo");
        opcao = Leitura.lerInt();
        if(opcao==1){
            Modalidade modalidade = Modalidade.criar();
            for(int i=0;i<modalidades.length;i++){
                if(modalidades[i]==null){
                    modalidades[i] = modalidade;
                    System.out.println("Cadastro realizado com Sucesso!");
                    break;
                }
            }
            System.out.println("Cadastro não pode ser realizado!");
        }
        if(opcao==2){
            Endereco endereco = Endereco.criar();
            for(int i=0;i<enderecos.length;i++){
                if(enderecos[i]==null){
                    enderecos[i] = endereco;
                    System.out.println("Cadastro realizado com Sucesso!");
                    break;
                }
            }
            System.out.println("Cadastro não pode ser realizado!");
        }
        if(opcao==3){
            Socio socio = Socio.criar(enderecos);
            for(int i=0;i<socios.length;i++){
                if(socios[i]==null){
                    socios[i] = socio;
                    System.out.println("Cadastro realizado com Sucesso!");
                    break;
                }
            }
            System.out.println("Cadastro não pode ser realizado!");
        }
        if(opcao==4){
            Titulo titulo = Titulo.criar(enderecos);
            for(int i=0;i<titulos.length;i++){
                if(titulos[i]==null){
                    titulos[i] = titulo;
                    System.out.println("Cadastro realizado com Sucesso!");
                    break;
                }
            }
            System.out.println("Cadastro não pode ser realizado!");
        }
    }
    
    public static void menuPesquisa(){
        int opcao;
        System.out.println("MENU DE PESQUISA!");
        System.out.println("1)Modalidade");
        System.out.println("2)Endereco");
        System.out.println("3)Socio");
        System.out.println("4)Titulo");
        opcao = Leitura.lerInt();
        if(opcao==1){
            int modalidadeId;
            listaModalidade();
            System.out.println("Insira a id da Modalidade: ");
            modalidadeId = Leitura.lerInt();
            Modalidade modalidade = Modalidade.pesquisarModalidade(modalidadeId, modalidades);
            if(modalidade!=null){
                modalidade.toString();
            }else
                System.out.println("Não foi possível encontrar esta Modalidade!");
        }
        if(opcao==2){
            int enderecoId;
            listaEndereco();
            System.out.println("Insira a id do Endereco: ");
            enderecoId = Leitura.lerInt();
            Endereco endereco = Endereco.pesquisarEndereco(enderecoId, enderecos);
            if(endereco!=null){
                endereco.toString();
            }else
                System.out.println("Não foi possível encontrar este Endereco!");
        }
        if(opcao==3){
            int socioId;
            listaSocio();
            System.out.println("Insira a id do Socio: ");
            socioId = Leitura.lerInt();
            Socio socio = Socio.pesquisarSocio(socioId, socios);
            if(socio!=null){
                socio.toString();
            }else
                System.out.println("Não foi possível encontrar este Socio!");
        }
        if(opcao==4){
            int tituloId;
            listaTitulo();
            System.out.println("Insira a id do Titulo: ");
            tituloId = Leitura.lerInt();
            Titulo titulo = Titulo.pesquisarTitulo(tituloId, titulos);
            if(titulo!=null){
                titulo.toString();
            }else
                System.out.println("Não foi possível encontrar este Titulo!");
        }
    }
    
    public static void matricularSocio(){
        int modalidadeId, socioId;
        System.out.println("Lista de Modalidades: ");
        listaModalidade();
        System.out.println("");
        System.out.println("Lista de Socios: ");
        listaSocio();
        System.out.println("");
        System.out.println("Insira a id do Socio que você deseja matricular: ");
        socioId = Leitura.lerInt();
        System.out.println("Insira a id da Modalidade deste Socio: ");
        modalidadeId = Leitura.lerInt();
        for(Socio socio : socios){
            if(socio.getSocioId()==socioId){
                socio.matricular(modalidadeId, modalidades);
                System.out.println("Matrícula realizada com Sucesso!");
                break;
            }
        }
    }
    
    public static void desmatricularSocio(){
        int socioId, matriculaId;
        System.out.println("Lista de Socios: ");
        listaSocio();
        System.out.println("Insira a id do Socio a ser desmatriculado: ");
        socioId = Leitura.lerInt();
        for(Socio socio : socios){
            if(socio.getSocioId()==socioId){
                System.out.println("Lista de Matrículas: ");
                socio.listaMatricula();
                System.out.println("");
                System.out.println("Insira o id para desmatricular: ");
                matriculaId = Leitura.lerInt();
                socio.desmatricular(matriculaId);
            }
        }
    }
    
    
}

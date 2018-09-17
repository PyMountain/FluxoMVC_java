package br.ufsc.ine5605.exerciciosMVC;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaUsuario {
    
    private ControladorUsuario ctrlUsuario;
    private Scanner teclado;

    public TelaUsuario(ControladorUsuario ctrlUsuario) {
        this.ctrlUsuario = ctrlUsuario;
        this.teclado = new Scanner(System.in);
    }

    public void mostraMenuUsuario() {
        int opcao;
        do {
            System.out.println("--------CADASTRO USUARIO--------");
            System.out.println("--------ESCOLHA A OPÇAO DESEJADA--------");
            System.out.println("1 - Novo Usuario");
            System.out.println("2 - Alterar usuario");
            System.out.println("3 - Excluir usuario");
            System.out.println("4 - Listar usuario");
            System.out.println("0 - Voltar tela principal");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch(opcao){
                case 1: mostraTelaNovoUsuario();
                        break;
                case 4: ctrlUsuario.listaUsuarios();
                        break;
            }
        }while(opcao != 0);
        ctrlUsuario.retornaMenuPrincipal();
        
    }

    private void mostraTelaNovoUsuario() {
        System.out.println("------NovoUsuario------");
        System.out.println("Nome do Usuario");
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        conteudoTela.nomeUsuario = teclado.nextLine();
        
        ctrlUsuario.incluiUsuario(conteudoTela);
        
        
    }

    public void mostraListaUsuarios(ArrayList<ConteudoTelaUsuario> listagemUsuarios) {
        
        System.out.println("----LISTAGEM DE USUARIOS----");
        for(ConteudoTelaUsuario conteudoTela : listagemUsuarios){
            System.out.println("Nome: "+conteudoTela.nomeUsuario);
        }
    }
    
}












package br.ufsc.ine5605.exerciciosMVC;

import java.util.Scanner;

public class TelaPrincipal {
    
    private Scanner teclado;
    private ControladorPrincipal ctrlPrincipal;
    
    public TelaPrincipal(ControladorPrincipal ctrlPrincipal){
        this.teclado = new Scanner(System.in);
        this.ctrlPrincipal = ctrlPrincipal;
    }
    
    public void monstraMenuPrincipal(){
        System.out.println("----SISTEMA USUARIOS---");
        System.out.println("----Digite a opçao desejada----");
        System.out.println("0- encerra o sistema");
        System.out.println("1- cadastro de usuario");
        int opcao = teclado.nextInt();
        teclado.nextLine();
        
        ctrlPrincipal.executaOpcaoMenuPrincipal(opcao);
    }
    
}

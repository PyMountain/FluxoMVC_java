package br.ufsc.ine5605.exerciciosMVC;

public class ControladorPrincipal {    
    private TelaPrincipal telaPrincipal;
    private ControladorUsuario ctrlUsuario;
    
    public ControladorPrincipal(){
        this.telaPrincipal = new TelaPrincipal(this);
        this.ctrlUsuario = new ControladorUsuario(this);
    }
    

    void iniciaSistema() {
        telaPrincipal.monstraMenuPrincipal();
    }

    public void executaOpcaoMenuPrincipal(int opcao) {
        switch(opcao){
            case 0: encerra();
                    break;
            case 1: ctrlUsuario.mostraMenuUsuario();
                    break;
        }
    }

    private void encerra() {
        System.out.println("obrigado por usar nosso sistema!");
    }
}

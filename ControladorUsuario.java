package br.ufsc.ine5605.exerciciosMVC;

import java.util.ArrayList;

public class ControladorUsuario {
    
    private ControladorPrincipal ctrlPrincipal;
    private TelaUsuario telaUsuario;
    private ArrayList<Usuario> usuarios;

    public ControladorUsuario(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.telaUsuario = new TelaUsuario(this);
        this.usuarios = new ArrayList<>();
    }

    public void mostraMenuUsuario() {
        telaUsuario.mostraMenuUsuario();
    }

    public void incluiUsuario(ConteudoTelaUsuario conteudoTela) {
        Usuario usuario = desempacota(conteudoTela);
        usuarios.add(usuario);
        
    }
    
    public Usuario desempacota(ConteudoTelaUsuario conteudoTela){
        return new Usuario(conteudoTela.nomeUsuario);
    }

    public void retornaMenuPrincipal() {
        mostraMenuUsuario();
    }

    public void listaUsuarios() {
        ArrayList<ConteudoTelaUsuario> listagemUsuarios = new ArrayList<>();
        
        for(Usuario usuario: usuarios){
            listagemUsuarios.add(empacota(usuario));
        }
        
        telaUsuario.mostraListaUsuarios(listagemUsuarios);
    }

    private ConteudoTelaUsuario empacota(Usuario usuario) {
        return new ConteudoTelaUsuario(usuario.getNome());
    }
    
}

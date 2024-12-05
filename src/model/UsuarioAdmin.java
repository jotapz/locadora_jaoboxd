package model;

import interfaces.IGerenciamentoFilmes;

import java.util.List;

public class UsuarioAdmin extends Usuario implements IGerenciamentoFilmes {
    public UsuarioAdmin(int id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public boolean login() {
        // Implementação do login para o admin
        return true;
    }

    @Override
    public String toString() {
        return "Admin: " + nome;
    }

    @Override
    public void cadastrarFilme(Filme filme) {
        // Implementação para cadastrar filmes
    }

    @Override
    public List<Filme> listarFilmes() {
        // Implementação para listar filmes
        return null;
    }

    // Getters e Setters
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }
}
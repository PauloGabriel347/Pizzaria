package model.cliente;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private Endereco endereco;
    

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }






}




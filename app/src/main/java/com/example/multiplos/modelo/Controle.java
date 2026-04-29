package com.example.multiplos.modelo;

public class Controle
{
    public String mensagem;

    public void executar(String numero, String op)
    {
        mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarNumero(numero);

        if (validacao.mensagem.equals(""))
        {


        }
        else
        {


        }
    }
}

package com.example.multiplos.modelo;

public class Validacao
{
    public Integer num;
    public String validarNumero(String numero)
    {
        String mensagem = "";
        try
        {
            num = Integer.parseInt(numero);

        } catch (Exception e) {
            mensagem = "Digite valores validos";

        }
        return mensagem;
    }
}

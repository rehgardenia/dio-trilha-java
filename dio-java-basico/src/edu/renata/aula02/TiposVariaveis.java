package edu.renata.aula02;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    

        // uma linguagem fortemente tipado
        byte idade = 19;
        short ano = 2025;
        int cep = 11533520;
        long cpf = 11111111111L;
        float pi = 3.14F;
        double salario = 1400.56;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);
        
        // constantes - UpperCase - final tipo nome
        final double PI = 3.14;
        System.out.println(PI);
        // texto
        String texto = "OLAAA";
        System.out.println(texto);


    }
}

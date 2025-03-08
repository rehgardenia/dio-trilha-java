package edu.renata.aula03;

import java.util.Date;

public class Operadores {
    
    public static void main(String[] args) {

        // Operadores Atribuição -> =
        String nome = "RENATA";
        int idade = 19;
        double peso = 48.6;
        char sexo ='F';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println(nome + idade + peso + sexo 
                + doadorOrgao + dataNascimento);

        // Operadores Aritméticos -> + ,-,*, % , /
        double soma = 10.5 + 15.7;
        int subtracao = 110 -24;
        int multiplicacao=  7 * 9;
        double divisao = 10 /2;
        int modulo = 10 % 6;
        double expresssao= (10*2) - (32/6);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Modulo: " + modulo);
        System.out.println("Expressao: " + expresssao);

        // Operadores Incrementais -> ++/ --
      
        int num = 5;
        // num = num + 2; or num+++

        System.out.println(num++); // incremento depois
        System.out.println(++num); // incremento antes

        // Operadores Lógicos

        boolean feliz = true;
        System.out.println(!feliz); // inverte o bool

        // Operador Ternário

        int a =5 , b=6;

        String resultado = a == b ? "Verdadeiro": "Falso";
        System.out.println(resultado); 

        // Operadores Relacionais
    
        int numero1 = 1, numero2 = 2;

        // Igualdade (==) 
        boolean simNao = numero1 == numero2;
        System.out.println(simNao);
    
        // Diferença (!=)
        simNao = numero1 != numero2;
        System.out.println(simNao);

        // Maior (>) 
        simNao = numero1 > numero2;
        System.out.println(simNao);
        
        // Menor (<)
        simNao = numero1 < numero2;
        System.out.println(simNao);
        
        // Maior ou Igual  (>=)
        simNao = numero1 >= numero2;
        System.out.println(simNao);
        
        // Menor ou Igual (<=)
        simNao = numero1 <= numero2;
        System.out.println(simNao);
        
        // Strings

        String texto1 = "RENATA";
        String texto2 = "Renata";

        boolean yesNo = texto1.equals(texto2);
        System.out.println(yesNo);

        // Operadores Condicionais -> && e ||
        
        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2) {
            System.out.println("As duas são verdadeiras");
        }
        if (condicao1 || condicao2)
        System.out.print("Uma das condições é verdadeira!");


    }
}

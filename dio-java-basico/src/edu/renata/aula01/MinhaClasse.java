package edu.renata.aula01;
// classe
public class MinhaClasse {
       // metodo
    public static void main ( String [] args ){

       // System.out.print("Olá, pessoal! Tudo bem?");
    
        /*

         ---------------------------------------------------------------------
         |                            VARIAVEIS EM JAVA                      |   
         ---------------------------------------------------------------------
         | Constantes         | UpperCase  | double PI  = 3.14;              | 
         | Variaveis/Metodos  | camelCase  | int numero = 10;                |
         | Classes            | PascalCase | class CalculadoraCientifica {}  | 
         ---------------------------------------------------------------------
         | Variavel : Tipo nomeBemDefinido = Atribuicao (Opcional)           |
         ---------------------------------------------------------------------
         | Tipos | int | double | long | String | char | bool | short |      |
         --------------------------------------------------------------------- 
         | Metodo : TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)        |
         ---------------------------------------------------------------------
         
         
         */
        String firstName = "Renata";
        String lastName = "Gardenia";
        int anoNascimento = 2006;

        String completeName = completeName(firstName, lastName);
        System.out.println("Resultado: " + completeName + " nascida em " + anoNascimento);

    }

    public static String completeName( String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }

    /*
      PACKETS

      Pacotes

        area
          -> autor
             -> pacote
                    -> subpacote

        edu.lucas.primeirasemana
        com.hypertech.vendas 
     */

     /*
     CONVENCOES 
      variaveis -> sem abreviacoes, no singular(execeto arrays) , idioma unico
        - double salarioMedio = 1500;
        - String email = "aluno@email.com";
        - String emails = {"jose@email.com", "luiz@email.com"}
        - String meuNome = "Joseph";
      metodos -> verbos em camelCase
        - somar(int n1, int n2){}
        - findById(int id){}
        - concluirProcessamento(){}
      */
}
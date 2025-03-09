package edu.renata.aula01;
// classe
public class MinhaClasse {
    // metodo
    public static void main ( String [] args ){

       System.out.print("Olá, pessoal! Tudo bem?");
    
        String firstName = "Renata";
        String lastName = "Gardenia";
        int anoNascimento = 2006;

        String completeName = completeName(firstName, lastName);
        System.out.println("Resultado: " + completeName + " nascida em " + anoNascimento);

    }

    public static String completeName( String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }

}
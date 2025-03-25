package edu.renata.aula04;

public class SmartTV{

    boolean ligada = true;
    int canal = 1;
    int volume = 20;

    public void ligarTV(){
       ligada = true;
    }
    public  void desligarTV(){
       ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(){
        canal++;
    }

    public void imprimir(){
        System.out.println("TV: " + (ligada == true ? "Ligado" : "Desligado"));
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}
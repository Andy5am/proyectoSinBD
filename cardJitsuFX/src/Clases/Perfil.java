package Clases;

import java.util.ArrayList;

public class Perfil {
    private int victorias;
    private int derrotas;
    private int xp;
    private ArrayList<Cinturon> cinturones= new ArrayList<>();

    public Perfil (){
        this.victorias = 0;
        this.derrotas = 0;
        this.xp = 0;
        Cinturon cinturon = new Cinturon(1);
        this.cinturones.add(cinturon);
    }

    public String getVictorias() {
        return String.valueOf(victorias);
    }
    public void partidaGanada(){
        victorias = victorias + 1;
    }

    public String getDerrotas() {
        return String.valueOf(derrotas);
    }
    public void partidaPerdida(){
        derrotas = derrotas + 1;
    }

    public String getXp() {
        return String.valueOf(xp);
    }
    public int getIntXp(){return xp;}
    public void sumarXp(int a){
        xp = xp + a;
    }

    public String getCinturon() {
        return String.valueOf(cinturones.get(cinturones.size()-1));
    }
    public void agregarCinturon(Cinturon c){
        cinturones.add(c);
    }
    public void agregarCinturon(){
        int a = cinturones.get(cinturones.size()-1).getColor();
        cinturones.add(new Cinturon(a+1));
    }

    public String toString(){
        String r = "Victorias: "+victorias+"\nDerrotas: "+derrotas+"\nXP: "+xp;
        return r;
    }

}

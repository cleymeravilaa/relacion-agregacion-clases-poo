package Agregacion.Ejercicio;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores;

    // Constructor por defecto
    public Equipo(){
        this.jugadores = new ArrayList<>();
    }

    // Constructor con jugadores
    public Equipo(ArrayList<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    // Metodo para agregar jugador
    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    // Metodo para buscar jugador 
    public Jugador buscarJugador(String nombre){
        return jugadores.stream()
            .filter(j -> j.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    // Metodo para eliminar jugador
    public void eliminarJugador(Jugador jugador){
        this.jugadores.remove(jugador);
    }

    // Metodo para eliminar todos los jugadores
    public void eliminarJugadores(){
        this.jugadores.clear();
    }
    
}

package Composicion.Ejercicio;

public class Casa {
    private Puerta puerta;

    // Constructor que recibe una puerta
    public Casa(Puerta puerta){
        if (puerta ==null) {
            throw new IllegalArgumentException("Una casa no puede existir sin una puerta");
        }
        this.puerta = puerta;
    }

    // Metodo para agregar una puerta
    public void cambiarPuerta(Puerta puerta){
        if (puerta == null) {
            throw new IllegalArgumentException("La puerta no puede ser nula");
        }
        this.puerta = puerta;
    }

    // Metodo para obtener la puerta
    public Puerta obtenerPuerta(){
        return puerta;
    }

    // Metodo para eliminar la puerta (exception)
    public void eliminarPuerta(){
        throw new UnsupportedOperationException("No se puede eliminar una puerta de una casa");
    }
}

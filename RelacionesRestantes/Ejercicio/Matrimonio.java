package RelacionesRestantes.Ejercicio;

public class Matrimonio {
    private Persona persona;
    private Evento evento;

    public Matrimonio(Persona persona, Evento evento){
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarInvitacion(){
        System.out.println("Invitación a " + this.persona.getNombre() + " a " + this.evento.getNombre());
    }
}

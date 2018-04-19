package personajedecorado;

import personaje.base.Guerrero;
import personaje.base.Mago;
import personaje.base.Trabajador;
import personaje.equipo.Espada;

public class PersonajeDecorado {
    
    public static void main(String[] args) {
        Mago personajeMago = new Mago();
        Guerrero personajeGuerrero = new Guerrero();
        Trabajador personajeTrabajador = new Trabajador();
        
        Espada personajeConEspada = new Espada(personajeMago);
        
        System.out.println("Su personaje Mago tiene base tiene " 
        		+ personajeMago.getAtaque() + " de ataque "
        		+ personajeMago.getDefensa() + " de defensa "
        		+ personajeMago.getVida() + " de vida "
        		+ personajeMago.getMagia() + " de magia ");              
        
        System.out.println("Su personaje Mago con espada tiene "
        		+ personajeConEspada.getAtaque() + " de ataque "
        		+ personajeConEspada.getDefensa() + " de defensa "
        		+ personajeConEspada.getVida() + " de vida "
        		+ personajeConEspada.getMagia() + " de magia ");
                
    }
    
}

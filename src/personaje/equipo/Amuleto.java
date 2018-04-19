package personaje.equipo;

import personaje.base.Humano;

public class Amuleto extends EquipoPersonaje{

	public Amuleto(Humano pHumano){
        this.ataque = pHumano.getAtaque();
        this.defensa = pHumano.getDefensa();
        this.vida = pHumano.getVida();
        this.magia = pHumano.getMagia() + 10;
    }
    
    public int getAtaque() {
        return ataque;
    }
    
    public int getDefensa() {
        return defensa;
    }
    
    public int getVida() {
        return vida;
    }
    
    public int getMagia() {
        return magia;
    }
}

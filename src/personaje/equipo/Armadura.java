package personaje.equipo;

import personaje.base.Humano;

public class Armadura extends EquipoPersonaje{

	public Armadura(Humano pHumano){
        this.ataque = pHumano.getAtaque();
        this.defensa = pHumano.getDefensa() + 20;
        this.vida = pHumano.getVida() + 20;
        this.magia = pHumano.getMagia();
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

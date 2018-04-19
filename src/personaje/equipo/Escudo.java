package personaje.equipo;

import personaje.base.Humano;

public class Escudo extends EquipoPersonaje{

	public Escudo(Humano pHumano){
        this.ataque = pHumano.getAtaque();
        this.defensa = pHumano.getDefensa() + 40;
        this.vida = pHumano.getVida() + 10;
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

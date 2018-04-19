package personaje.equipo;

import personaje.base.Humano;

public class Espada extends EquipoPersonaje{
    int ataque;
    int defensa;
    int vida;
    int magia;
    
    public Espada(Humano pHumano){
        this.ataque = pHumano.getAtaque() + 10;
        this.defensa = pHumano.getDefensa() +10;
        this.vida = pHumano.getVida() + 1;
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


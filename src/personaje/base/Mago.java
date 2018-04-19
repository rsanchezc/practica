package personaje.base;

public class Mago extends Humano{

    public Mago(){
        this.ataque = 10;
        this.defensa = 10;
        this.vida = 10;
        this.magia = 40;
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

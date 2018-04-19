package personaje.base;

public class Guerrero extends Humano{

    public Guerrero(){
        this.ataque = 20;
        this.defensa = 30;
        this.vida = 30;
        this.magia = 20;
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

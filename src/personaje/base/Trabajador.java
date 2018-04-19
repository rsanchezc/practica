package personaje.base;

public class Trabajador extends Humano{

    public Trabajador(){
        this.ataque = 25;
        this.defensa = 10;
        this.vida = 10;
        this.magia = 10;
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

package genshin_projeto;

public class Qiqi extends Personagens {
    
    public Qiqi() {
        super("Qiqi", 1200, 800);  
    }

    public void AtaqueEspecial(Personagens oponente) {
        oponente.Vida -= this.Dano / 2; 
        oponente.ChecarStatus();
    }
}


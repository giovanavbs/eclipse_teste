package genshin_projeto;

public class Zhongli extends Personagens {
    
    public Zhongli() {
        super("Zhongli", 1400, 1000);  
    }

    public void AtaqueEspecial(Personagens oponente) {
        int danoAtaque = this.Dano * 2;
        oponente.Vida -= danoAtaque; 
        oponente.ChecarStatus();  
    } 
    
    /* public void AtaqueEspecial(Personagens oponente) {
    	oponente.Vida = this.Dano * 2;
        oponente.ChecarStatus();  
    } ele tem fogo e nao quer funcionar sem tirar o dano depois do calculo */
}

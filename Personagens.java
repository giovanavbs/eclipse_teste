package genshin_projeto;

public class Personagens {
    String Nome;
    int Vida;
    int Dano;
    String Vivo;
    
    // construtor
    public Personagens(String nome, int vida, int dano) {
        this.Nome = nome;
        this.Vida = vida;
        this.Dano = dano;
        this.Vivo = "vivinho";
    }

    public void ChecarStatus() {
        if (this.Vida <= 0) {
            this.Vivo = "mortinho";
        }
    }

    public void AtaqueNormal(Personagens oponente) {
        oponente.Vida -= this.Dano;
        oponente.ChecarStatus();
    }
}




package genshin_projeto;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonagensTeste {
    
    @Test
    public void testeAtaqueNormal() {
        // cenario
        Zhongli zhongli = new Zhongli();
        Qiqi qiqi = new Qiqi();

        // ação
        zhongli.AtaqueNormal(qiqi);

        // verificação
        System.out.println("qiqi foi macetada por zhongli, vida atual: " + qiqi.Vida);
        System.out.println("status de qiqi: " + qiqi.Vivo);
        
        assertEquals(200, qiqi.Vida);
        assertEquals("vivinho", qiqi.Vivo);
    }

    @Test
    public void testeAtaqueZhongli() {
        // cenario
        Zhongli zhongli = new Zhongli();
        Qiqi qiqi = new Qiqi();

        // ação
        zhongli.AtaqueEspecial(qiqi);

        // verificação
        System.out.println("qiqi foi macetada por zhongli, vida atual: " + qiqi.Vida);
        System.out.println("status de qiqi: " + qiqi.Vivo);

        assertEquals(-800, qiqi.Vida); 
        assertEquals("mortinho", qiqi.Vivo);
    }

    @Test
    public void testeAtaqueQiqi() {
        // cenario
        Zhongli zhongli = new Zhongli();
        Qiqi qiqi = new Qiqi();

        // ação
        qiqi.AtaqueEspecial(zhongli);

        // verificação
        System.out.println("zhongli foi macetada por qiqi, vida atual: " + zhongli.Vida);
        System.out.println("status de qiqi: " + zhongli.Vivo);
        
        assertEquals(1000, zhongli.Vida); 
        assertEquals("vivinho", zhongli.Vivo);
    }
}
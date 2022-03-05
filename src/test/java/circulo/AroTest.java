/**
 * Probas para a clase Circulo
 * @author SilvanaAF
 */
package circulo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SilvanaAF
 */
public class AroTest {
    
    /**
     *
     */
    public AroTest() {
    }
    
    /**
     * Test del método setCoordenadaX, de la clase Aro.
     */
    @Test
    public void testsetCoordenadaX() {
        System.out.println("setCoordenadaX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test del método getCoordenadaX, de la clase Aro.
     */
    @Test
    public void testgetCoordenadaX() {
        System.out.println("getCoordenadaX");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaX();
        assertEquals(expResult, result);
    }

    /**
     * Test del método setCoordenadaY, de la clase Aro.
     */
    @Test
    public void testsetCoordenadaY() {
        System.out.println("setCoordenadaY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test del método getCoordenadaY, de la clase Aro.
     */
    @Test
    public void testgetCoordenadaY() {
        System.out.println("getCoordenadaY");
        Aro instance = new Aro(0,0,0.1);
        int expResult = 0;
        int result = instance.getCoordenadaY();
        assertEquals(expResult, result);
    }

    /**
     * Test del método setRadio, de la clase Aro.
     */
    @Test
    public void testsetRadio() {
        System.out.println("setRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test del método GetRadio, de la clase Aro.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(0.1);
        result= instance.getRadio();
        assertEquals(0.1, result,0);

        instance.setRadio(-0.1);
        result= instance.getRadio();
        assertEquals(-0.1, result,0);
    }

    /**
     * Test del método ObterDiametro, de la clase Aro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double result = instance.obterDiametro();
        assertEquals(0.2, result,0);
    }

    /**
     * Test del método ObterCircunferencia, de la clase Aro.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.6283185;
        double result = instance.obterCircunferencia();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test del método ObterSuperficie, de la clase Aro.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("ObterSuperficie");
        Aro instance = new Aro(0,0,0.1);
        double expResult = 0.0314159;
        double result = instance.obterSuperficie();
        assertEquals(expResult, result,1e-6);
    }

    /**
     * Test del método TrasladarCentro, de la clase Aro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}

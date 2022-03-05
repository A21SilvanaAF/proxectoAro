package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author SilvanaAF
 */
public class Aro {

    private static final double LIMITERADIO = 0.0;
    public static final double MINIMO = LIMITERADIO;

    private int x;
    private int y;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        x = valorX;
        y = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        x=valorX;
    }

    public int coordenadaX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int coordenadaY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        x=x + trasladarx;
        y=y + trasladary;
    }
}
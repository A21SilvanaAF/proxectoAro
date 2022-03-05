package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author SilvanaAF
 */
public class Aro {

    private static final double LIMITERADIO = 0.0;

    /**
     *
     */
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     *
     */
    public Aro() {
    }

    /**
     *
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    
    /**
     * @return obtener coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX establecido
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return obtener coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY testablecido
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return obtener radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio establecido
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     *
     * @return devuelve el diametro del circulo
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     *
     * @return devuelve el valor de la circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return devuelve la superficie del circulo
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

}
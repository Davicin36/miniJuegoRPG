package primerRPG;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JProgressBar;

public class Entidades implements IAtacable{

    private String nombre;
    private int vidaActual, ataque, defensa;
    private Double vidaMax;
    private boolean estaVivo;
    private JProgressBar barraVida;

    public Entidades(String nombre, int ataque, int defensa, Double vidaMax) {

        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vidaMax = vidaMax;
        vidaActual = Double.valueOf(vidaMax).intValue();
        estaVivo = true;
        barraVida = new JProgressBar(0, Double.valueOf(vidaMax).intValue());
        barraVida.setPreferredSize(new Dimension (100, 25));
        establecerVida (vidaActual);

    }

    public void establecerVida(int vida) {
        
        barraVida.setValue(vida);
        //le damos un color a la barra.
        barraVida.setForeground(Color.RED);
        barraVida.setStringPainted(true);
        //le damos un formato a la barra de vida para que aparezca lo que nosotroa queremos.
        barraVida.setString(vidaActual + "   /   " + Double.valueOf(vidaMax).intValue());
        
    }

    @Override
    public void atacar(IAtacable enemigo) {

        //al pasarle como parametro al enemigo, el ataque sera para decirle que sea el contrario el que reciba el daño, esto también
        //ira en nuestra contra.
        enemigo.recibirHerida(ataque);
       
    }

    @Override
    public void recibirHerida(int cantidad) {

        if(estaVivo){ 
            //comprobamos la cantidad de vida que le quitamos.
            int cantidadTotal = cantidad - defensa;
            //cuando esa cantidad es igual o inferior a 0 entonces la cantidad de daño total sera 1, por defecto.
            if (cantidadTotal <= 0) cantidadTotal= 1;
            //se lo restamos a la vida actuarl
            vidaActual -= cantidadTotal;
            //comprobamos si la vida actual es igual o menor a 0 entonces estara muerto.
            if (vidaActual <= 0) estaVivo = false;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual (int vidaActual){
        this.vidaActual = vidaActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public Double getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(Double vidaMax) {
        this.vidaMax = vidaMax;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }
    public void setEstaVivo (boolean estaVivo){
        this.estaVivo = estaVivo;
    }

    public JProgressBar getBarraVida() {
        return barraVida;
    }

}

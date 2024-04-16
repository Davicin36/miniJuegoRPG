package primerRPG;

public class Personaje extends Entidades{

    private int nivel, oro, exp, expNecesaria;

    public Personaje(String nombre, int ataque, int defensa, Double vidaMax, int nivel, int oro, int exp,
            int expNecesaria) {
        super(nombre, ataque, defensa, vidaMax);
        nivel = 1;
        oro = 0;
        exp = 0;
        expNecesaria = 10;

    }

    public int getNivel (){
        return nivel;
    }

    public void subirNivel(){
        nivel++;
        setAtaque(getAtaque() + 2);
        setDefensa(getDefensa() + 1);
        setVidaMax(getVidaMax() * 1.1 );
        getBarraVida().setMaximum(getVidaMax().intValue());
    }

    public int getExp (){
        return exp;
    }

    public void subirExp (int cantidad){
        exp += cantidad;
        if( exp >= expNecesaria) subirNivel();

    }

    public int getExpNecesaria (){
        return expNecesaria;
    }

    public void setOro (int oro){
        this.oro = oro;
    }

    public int getOro(){
        return oro;
    }



    
}

package primerRPG;

public interface IAtacable {

    //creamos esta interfaz para poder hacer que los ataques y recibir heridas sea mas facil de implementar.

    public void atacar(IAtacable enemigo);

    public void recibirHerida (int cantidad);

    
} 

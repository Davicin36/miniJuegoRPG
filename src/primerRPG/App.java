package primerRPG;

public class App {
    public static void main(String[] args) throws Exception {

        Personaje heroe = new Personaje("Dai", 6, 2, 100.0);

        ventanaPrincipal juego = new ventanaPrincipal(heroe);

        juego.comenzarJuego();
        
    }
}

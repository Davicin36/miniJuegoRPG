package primerRPG;

import java.awt.BorderLayout;

import javax.swing.*;

public class Exploracion {

    private JDialog marco;

    private JPanel panelSuperior, panelInferior, panelEnemigo, panelEnemigoSec, panelPrincipal;

    private JButton btnAtacar, btnHuir;

    private JTextArea infoExplorar;
    private JScrollPane barraDes;

    private Personaje pj;

    private static int numeroExplorar = 0;

    public Exploracion (ventanaPrincipal vp){

        pj = vp.getPj();

        marco = new JDialog();

        panelPrincipal = new JPanel(new BorderLayout());
        panelSuperior = vp.getPanelSuperior();
        panelInferior = new JPanel();
        panelEnemigo = new JPanel();
        panelEnemigoSec = new JPanel();

        /*area de texto, creamos una barra scroll y usamos un metodo para que no nos salga
        la barra de desplazamiento horizontal.*/
        infoExplorar = new JTextArea();
        barraDes = new JScrollPane(infoExplorar);
        barraDes.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        btnAtacar = new JButton("Atacar");
        btnHuir = new JButton("Huir");
    }
    
}

package primerRPG;

import java.awt.*;
import javax.swing.*;


public class ventanaPrincipal {

    private JFrame marco;
    private JPanel panelPrincipal, panelInferior, panelSuperior;

    private JLabel etNombre, etNivel, etExp, etOro, etAtributos;
    private JLabel etImagen;
    
    private JButton btnExplorar;

    private Personaje pj;

    public ventanaPrincipal (Personaje pj){

        this.pj = pj;

        marco = new JFrame();
        marco.setTitle("Primer MiniRPG");
        marco.setBounds(400, 0, 1400, 900);

        panelPrincipal = new JPanel (new BorderLayout());
        panelSuperior = new JPanel ();
        panelInferior = new JPanel();

        etNombre = new JLabel(pj.getNombre() + "                           ");
        etNivel = new JLabel("     Nivel " + pj.getNivel() + "     ");
        etExp = new JLabel("      Exp: " + pj.getExp() + "  /  " + pj.getExpNecesaria() + "     ");
        etOro = new JLabel("     Oro " + pj.getOro() + "     ");
        etAtributos = new JLabel("Ataque: " + pj.getAtaque() + " | Defensa:  " + pj.getDefensa() + "          ");
        etImagen = new JLabel();

        btnExplorar = new JButton("Explorar");

    }

    public JPanel getPanelSuperior (){
        return panelSuperior;
    }

    public void comenzarJuego () {

        montarEscena();
        marco.setVisible(true);
    }

    private void montarEscena() {
        
        modificarFuentes();
        //elaboramos panel superior.
        panelSuperior.add(etNombre);
        panelSuperior.add(etNivel);
        panelSuperior.add(etExp);
        panelSuperior.add(etOro);
        panelSuperior.add(etAtributos);
        panelSuperior.add(pj.getBarraVida());

        //elaboramos panel principal, la imagen.
        etImagen.setIcon(new ImageIcon ("./imagenes/entradaMazmorra.jpg"));
        panelPrincipal.add(etImagen, BorderLayout.CENTER);

        //añadimos panel inferior, botones  
        btnExplorar.addActionListener(e-> nuevaExploracion());
        panelInferior.add(btnExplorar);

        //añadimos paneles secundarios a panel principal

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        marco.add(panelPrincipal);
    }

    private Object nuevaExploracion() {
        return null;
    }

    public void modificarFuentes () {

        Font miFuente = new Font("Verdana", Font.BOLD, 20);
        etNombre.setFont(miFuente);
            
    }

    public Personaje getPj (){
        return pj;
    }

}

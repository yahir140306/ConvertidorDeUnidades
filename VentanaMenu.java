import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaMenu extends JFrame implements ActionListener{

    private JButton longitud , superficie , volumen , upresion , energia , macroEnergeticas , potencia , temperatura;
    private JButton salida;
    private JMenuBar menuB;
    private JMenu menu;
    private JMenuItem hijo1 , hijo2 , hijo3 , hijo4 , hijo5;

    //color a las letras .setForeground(Color.white);

    public VentanaMenu() {
        // partes del menu
        setLayout(null);
        setTitle("Menu - Convertirdor De Unidades  - 3EV - :)");

        JLabel nombre = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi");
        nombre.setBounds(110 , 350 , 300 , 30);
        add(nombre);

        JLabel indicacion  = new JLabel("Conversor De Unidades.");
        indicacion.setBounds(150 , 0 , 300  , 30);
        add(indicacion);

        JLabel indicar = new JLabel("Escoja Una Opcion :)");
        indicar.setBounds(160 , 20 , 300 , 30);
        add(indicar);


        menuB = new JMenuBar();
        setJMenuBar(menuB);

        menu = new JMenu("Tema De Color");
        menuB.add(menu);
        
            hijo1 = new JMenuItem("Negro");
            hijo1.addActionListener(this);
            menu.add(hijo1);

            hijo2 = new JMenuItem("Blanco");
            hijo2.addActionListener(this);
            menu.add(hijo2);

            hijo3 = new JMenuItem("Verde");
            hijo3.addActionListener(this);
            menu.add(hijo3);

            hijo4 = new JMenuItem("Azul");
            hijo4.addActionListener(this);
            menu.add(hijo4);

            hijo5 = new JMenuItem("Rojo");
            hijo5.addActionListener(this);
            menu.add(hijo5);


        // opciones - botones
        // izquierda
        longitud = new JButton("Longitud");
        longitud.setBounds(25 , 80 , 100 , 30);
        add(longitud);
        longitud.addActionListener(this);

        superficie = new JButton("Superficie");
        superficie.setBounds(25 , 150 , 100 , 30);
        add(superficie);
        superficie.addActionListener(this);

        volumen = new JButton("Volumen");
        volumen.setBounds(65 , 220 , 100 , 30);
        add(volumen);
        volumen.addActionListener(this);

        // mitad
        upresion = new JButton("U. De Presion");
        upresion.setBounds(150 , 80 , 150 , 30);
        add(upresion);
        upresion.addActionListener(this);

        energia = new JButton("Energia");
        energia.setBounds(175 , 150 , 100 , 30);
        add(energia);
        energia.addActionListener(this);

        macroEnergeticas = new JButton("Macro. Energeticas");
        macroEnergeticas.setBounds(225 , 220 , 150 , 30);
        add(macroEnergeticas);
        macroEnergeticas.addActionListener(this);

        // izquierda
        potencia = new JButton("Potencia");
        potencia.setBounds(325 , 80 , 100 , 30);
        add(potencia);
        potencia.addActionListener(this);

        temperatura = new JButton("Temperatura");
        temperatura.setBounds(300 , 150 , 125 , 30);
        add(temperatura);
        temperatura.addActionListener(this);

        salida = new JButton("Salir");
        salida.setBounds(325 , 25 , 100 , 30);
        add(salida);
        salida.addActionListener(this);

        // llamar las ventanas de cada conversor

        longitud.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Longitud ventana = new Longitud();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        superficie.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Superficie ventana = new Superficie();
                ventana.setBounds (500 , 100 , 450 , 450);
                ventana.setVisible(true); 
            }
        });

        volumen.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Volumen ventana = new Volumen();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        upresion.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Presion ventana = new Presion();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        energia.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Energia ventana = new Energia();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        macroEnergeticas.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
            Energeticos ventana = new Energeticos();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        potencia.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Potencia ventana = new Potencia();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

        temperatura.addActionListener( new ActionListener(){
            public void actionPerformed (ActionEvent e) {
                Temperatura ventana = new Temperatura();
                ventana.setBounds(500 , 100 , 450 , 450);
                ventana.setVisible(true);
            }
        });

    }
    public void actionPerformed (ActionEvent e) {

        Container f = this.getContentPane();

        if (e.getSource() == hijo5) {
            f.setBackground( new Color (255 , 0 , 0));
        }
        if (e.getSource() == hijo3) {
            f.setBackground( new Color (0 , 255 , 0));
        }
        if (e.getSource() == hijo4) {
            f.setBackground( new Color (0 , 0 , 255));
        }
        if (e.getSource() == hijo2) {
            f.setBackground( new Color (255 , 255 , 255));
        }
        if (e.getSource() == hijo1) {
            f.setBackground( new Color (0 , 0 ,0));
        }


        if (e.getSource() == salida) {
            try {
                Thread.sleep(0);
                System.exit(0);
            }
            catch (Exception excep) {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        VentanaMenu ventana = new VentanaMenu();
        ventana.setBounds(500 , 100 , 450 , 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

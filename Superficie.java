import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Superficie extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Superficie() {

        setLayout(null);
        setTitle("Convertir Superficie - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Superficie ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);

        String[] datos1 = { "Metro cuadrado", "Hectarea", "Pulgada cuadrada", "Pie cuadrado", "Yarda cuadrada","Acre" };
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 130, 30);
        this.add(dos);

        String[] datos2 = { "Metro cuadrado", "Hectarea", "Pulgada cuadrada", "Pie cuadrado", "Yarda cuadrada","Acre" };
        tres = new JComboBox<String>(datos2);
        tres.setBounds(265, 150, 130, 30);
        this.add(tres);

        JLabel recibe = new JLabel("RECIBE:");
        recibe.setBounds(40 , 100, 200 , 30);
        add(recibe);

        JLabel mostrar = new JLabel("MOSTRAR: ");
        mostrar.setBounds(270 , 100 , 200 , 30);
        add(mostrar);

        textfield1 = new JTextField();
        textfield1.setBounds(20, 70, 150, 30);
        add(textfield1);

        textfield2 = new JTextField();
        textfield2.setBounds(265, 70, 150, 30);
        add(textfield2);

        boton1 = new JButton();
        boton1.setBounds(160, 200, 100, 50);
        ImageIcon clik = new ImageIcon("ImgBoton.jpg");
        boton1.setIcon(new ImageIcon(clik.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        add(boton1);
        boton1.addActionListener(this);

        /*boton2 = new JButton("CLEAN");
        boton2.setBackground(Color.green);
        boton2.setForeground(Color.white);
        boton2.setBounds(145, 200, 100, 30);
        add(boton2);
        boton2.addActionListener(this);*/

        /*boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield1.setText("");
                textfield2.setText("");
            }
        });*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String box4 = (String) dos.getSelectedItem();
        String box5 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box4.equals("Metro cuadrado") && box5.equals("Metro cuadrado")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Metro cuadrado") && box5.equals("Hectarea")) {
                double a = x1 / 10000;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Metro cuadrado") && box5.equals("Pulgada cuadrada")) {
                double a = x1 * 1550.0031;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Metro cuadrado") && box5.equals("Pie cuadrado")) {
                double a = x1 * 10.76391;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Metro cuadrado") && box5.equals("Yarda cuadrada")) {
                double a = x1 * 1.19599;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Metro cuadrado") && box5.equals("Acre")) {
                double a = x1 / 4047;
                textfield2.setText(String.valueOf(a));
            }

            if (box4.equals("Hectarea") && box5.equals("Metro cuadrado")) {
                double a = x1 * 10000;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Hectarea") && box5.equals("Hectarea")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Hectarea") && box5.equals("Pulgada cuadrada")) {
                double a = x1 * 15500031;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Hectarea") && box5.equals("Pie cuadrado")) {
                double a = x1 * 1076391;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Hectarea") && box5.equals("Yarda cuadrada")) {
                double a = x1 * 0.0001196;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Hectarea") && box5.equals("Acre")) {
                double a = x1 * 2.4710538;
                textfield2.setText(String.valueOf(a));
            }

            if (box4.equals("Pulgada Cuadrada") && box5.equals("Metro cuadrado")) {
                double a = x1 * 0.00064516;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pulgada Cuadrada") && box5.equals("Hectarea")) {
                double a = x1 * 0.00000006451;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pulgada Cuadrada") && box5.equals("Pulgada Cuadrada")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pulgada Cuadrada") && box5.equals("Pie Cuadrdo")) {
                double a = x1 * 0.006944;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pulgada Cuadrada") && box5.equals("Yarda Cuadrada")) {
                double a = x1 * 0.0007716;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pulgada Cuadrada") && box5.equals("Acre")) {
                double a = x1 * 0.00000015942;
                textfield2.setText(String.valueOf(a));
            }

            if (box4.equals("Pie cuadrado") && box5.equals("Metro cuadrado")) {
                double a = x1 * 0.09290304;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pie cuadrado") && box5.equals("Hectarea")) {
                double a = x1 * 0.000009290351;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pie cuadrado") && box5.equals("Pulgada Cuadrada")) {
                double a = x1 * 144;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pie cuadrado") && box5.equals("Pie cuadrado")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pie cuadrado") && box5.equals("Yarda Cuadrada")) {
                double a = x1 * 0.111;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Pie cuadrado") && box5.equals("Acre")) {
                double a = x1 * 0.000022957;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box4.equals("Yarda Cuadrada") && box5.equals("Metro cuadrado")) {
                double a = x1 * 0.8361274;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Yarda Cuadrada") && box5.equals("Hectarea")) {
                double a = x1 * 0.000083613;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Yarda Cuadrada") && box5.equals("Pulgada Cuadrada")) {
                double a = x1 * 1296;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Yarda Cuadrada") && box5.equals("Pie cuadrado")) {
                double a = x1 * 9;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Yarda Cuadrada") && box5.equals("Yarda Cuadrada")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Yarda Cuadrada") && box5.equals("Acre")) {
                double a = x1 * 0.00020661;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box4.equals("Acre") && box5.equals("Metro cuadrado")) {
                double a = x1 * 4046.856;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Acre") && box5.equals("Hectarea")) {
                double a = x1 * 0.4046856;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Acre") && box5.equals("Pulgada Cuadrada")) {
                double a = x1 * 6272640;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Acre") && box5.equals("Pie cuadrado")) {
                double a = x1 * 43560;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Acre") && box5.equals("Yarda Cuadrada")) {
                double a = x1 * 4840;
                textfield2.setText(String.valueOf(a));
            } else if (box4.equals("Acre") && box5.equals("Acre")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            }

        }
    }

    public static void main(String[] ar) {
        Superficie ventana = new Superficie();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Longitud extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Longitud() {

        setLayout(null);
        setTitle("Convertir Longitud - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Longitud ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);


        String[] datos1 = { "Metro", "Milimetro", "Pulgada", "Pie", "Yarda", "Milla" };
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 100, 30);
        this.add(dos);

        String[] datos2 = { "Metro", "Milimetro", "Pulgada", "Pie", "Yarda", "Milla" };
        tres = new JComboBox<String>(datos2);
        tres.setBounds(300, 150, 100, 30);
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
        boton1.setBounds(150, 150, 100, 50);
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
        
        String box2 = (String) dos.getSelectedItem();
        String box3 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box2.equals("Metro") && box3.equals("Metro")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Metro") && box3.equals("Milimetro")) {
                double a = x1 * 1000;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Metro") && box3.equals("Pulgada")) {
                double a = x1 * 39.3701;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Metro") && box3.equals("Pie")) {
                double a = x1 * 3.28084;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Metro") && box3.equals("Yarda")) {
                double a = x1 * 1.09361;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Metro") && box3.equals("Milla")) {
                double a = x1 / 1609;
                textfield2.setText(String.valueOf(a));
            }

            if (box2.equals("Milimetro") && box3.equals("Metro")) {
                double a = x1 / 4740;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milimetro") && box3.equals("Milimetro")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milimetro") && box3.equals("Pulgada")) {
                double a = x1 / 25.4;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milimetro") && box3.equals("Pie")) {
                double a = x1 / 304.8;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milimetro") && box3.equals("Yarda")) {
                double a = x1 / 914.4;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milimetro") && box3.equals("Milla")) {
                double a = x1 / 63360;
                textfield2.setText(String.valueOf(a));
            }

            if (box2.equals("Pulgada") && box3.equals("Metro")) {
                double a = x1 / 39.37;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pulgada") && box3.equals("Milimetro")) {
                double a = x1 * 25.4;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pulgada") && box3.equals("Pulgada")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pulgada") && box3.equals("Pie")) {
                double a = x1 / 12;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pulgada") && box3.equals("Yarda")) {
                double a = x1 / 36;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pulgada") && box3.equals("Milla")) {
                double a = x1 / 63360;
                textfield2.setText(String.valueOf(a));
            }

            if (box2.equals("Pie") && box3.equals("Metro")) {
                double a = x1 / 3.281;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pie") && box3.equals("Milimetro")) {
                double a = x1 * 304.8;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pie") && box3.equals("Pulgada")) {
                double a = x1 * 12;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pie") && box3.equals("Pie")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pie") && box3.equals("Yarda")) {
                double a = x1 / 3;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Pie") && box3.equals("Milla")) {
                double a = x1 / 5280;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box2.equals("Yarda") && box3.equals("Metro")) {
                double a = x1 / 1.094;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Yarda") && box3.equals("Milimetro")) {
                double a = x1 * 914.4;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Yarda") && box3.equals("Pulgada")) {
                double a = x1 * 36;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Yarda") && box3.equals("Pie")) {
                double a = x1 * 3;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Yarda") && box3.equals("Yarda")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Yarda") && box3.equals("Milla")) {
                double a = x1 / 1760;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box2.equals("Milla") && box3.equals("Metro")) {
                double a = x1 * 1609.34;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milla") && box3.equals("Milimetro")) {
                double a = x1 * 1.609e+6;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milla") && box3.equals("Pulgada")) {
                double a = x1 * 63360;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milla") && box3.equals("Pie")) {
                double a = x1 * 5281;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milla") && box3.equals("Yarda")) {
                double a = x1 * 1760;
                textfield2.setText(String.valueOf(a));
            } else if (box2.equals("Milla") && box3.equals("Milla")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            }

        }
    }

    public static void main(String[] ar) {
        Longitud ventana = new Longitud();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
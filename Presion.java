import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Presion extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Presion() {

        setLayout(null);
        setTitle("Convertir Unidades De Presion - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Unidad De Presion ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);

        String[] datos1 = {"Kilopascal", "Atmosfera tecnica", "Milimetro de c. Hg", "Metros de c.agua",
        "Libras por pulgada", "Bar" };
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 130, 30);
        this.add(dos);

        String[] datos2 = {"Kilopascal", "Atmosfera tecnica", "Milimetro de c. Hg", "Metros de c.agua",
        "Libras por pulgada", "Bar" };
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
        
        String box1 = (String) dos.getSelectedItem();
        String box2 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box1.equals("Kilopascal") && box2.equals("Kilopascal")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilopascal") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 0.0101972;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilopascal") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 7.5006278;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilopascal") && box2.equals("Metros de c.agua")) {
                double a = x1 * 0.1019745;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilopascal") && box2.equals("Libras por pulgada")) {
                double a = x1 * 0.1450377;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilopascal") && box2.equals("Bar")) {
                double a = x1 * 0.01;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Atmosfera tecnica") && box2.equals("Kilopascal")) {
                double a = x1 * 98.0665;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Atmosfera tecnica") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Atmosfera tecnica") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 735.560217;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Atmosfera tecnica") && box2.equals("Metros de c.agua")) {
                double a = x1 * 1000028;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Atmosfera tecnica") && box2.equals("Libras por pulgada")) {
                double a = x1 * 14.2233433;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Atmosfera tecnica") && box2.equals("Bar")) {
                double a = x1 * 0.980665;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Milimetro de c. Hg") && box2.equals("Kilopascal")) {
                double a = x1 * 0.1333222;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Milimetro de c. Hg") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 0.0013595;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Milimetro de c. Hg") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Milimetro de c. Hg") && box2.equals("Metros de c.agua")) {
                double a = x1 * 0.0135955;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Milimetro de c. Hg") && box2.equals("Libras por pulgada")) {
                double a = x1 * 193367;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Milimetro de c. Hg") && box2.equals("Bar")) {
                double a = x1 * 0.0013332;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Metros de c.agua") && box2.equals("Kilopascal")) {
                double a = x1 * 9.8063754;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Metros de c.agua") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 0.0999972;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Metros de c.agua") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 73.5539622;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Metros de c.agua") && box2.equals("Metros de c.agua")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Metros de c.agua") && box2.equals("Libras por pulgada")) {
                double a = x1 * 1.4222945;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Metros de c.agua") && box2.equals("Bar")) {
                double a = x1 * 0.0980638;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Libras por pulgada") && box2.equals("Kilopascal")) {
                double a = x1 * 6.8947573;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Libras por pulgada") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 0.070307;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Libras por pulgada") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 51.7150013;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Libras por pulgada") && box2.equals("Metros de c.agua")) {
                double a = x1 * 0.7030893;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Libras por pulgada") && box2.equals("Libras por pulgada")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Libras por pulgada") && box2.equals("Bar")) {
                double a = x1 * 0.689476;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Bar") && box2.equals("Kilopascal")) {
                double a = x1 * 100;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Bar") && box2.equals("Atmosfera tecnica")) {
                double a = x1 * 1.0197162;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Bar") && box2.equals("Milimetro de c. Hg")) {
                double a = x1 * 750.062679;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Bar") && box2.equals("Metros de c.agua")) {
                double a = x1 * 10.1974477;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Bar") && box2.equals("Libras por pulgada")) {
                double a = x1 * 14.5037738;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Bar") && box2.equals("Bar")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            }

        }
    }

    public static void main(String[] ar) {
        Presion ventana = new Presion();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
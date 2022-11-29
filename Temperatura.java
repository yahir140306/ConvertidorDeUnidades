import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Temperatura extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Temperatura() {

        setLayout(null);
        setTitle("Convertir Temperatura - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Temperatura ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);


        String[] datos1 = { "Temperatura en °C " , "Temperatura en °F" ,"Temperatura en °K"};
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 150, 30);
        this.add(dos);

        String[] datos2 = { "Temperatura en °C" , "Temperatura en °F" ,"Temperatura en °K"};
        tres = new JComboBox<String>(datos2);
        tres.setBounds(270, 150, 150, 30);
        this.add(tres);

        JLabel recibe = new JLabel("RECIBE:");
        recibe.setBounds(40 , 100, 200 , 30);
        add(recibe);

        JLabel mostrar = new JLabel("MOSTRAR: ");
        mostrar.setBounds(270 , 100 , 200 , 30);
        add(mostrar);

        textField1 = new JTextField();
        textField1.setBounds(20, 70, 150, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(265, 70, 150, 30);
        add(textField2);

        boton1 = new JButton();
        boton1.setBounds(150, 200, 100, 50);
        ImageIcon clik = new ImageIcon("ImgBoton.jpg");
        boton1.setIcon(new ImageIcon(clik.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        String box1 = (String) dos.getSelectedItem();
        String box2 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textField1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box1.equals("Temperatura en °C") && box2.equals("Temperatura en °F")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = 1.8 * ans + 32;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Temperatura en °C") && box2.equals("Temperatura en °K")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans + 273.14;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Temperatura en °F") && box2.equals("Temperatura en °C")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = (ans - 32) / 1.8;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Temperatura en °F") && box2.equals("Temperatura en °K")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = (ans - 32) / 1.8 + 273.15;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Temperatura en °K") && box2.equals("Temperatura en °C")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans - 273.15;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Temperatura en °K") && box2.equals("Temperatura en °F")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = 1.8 * (ans - 273) + 32;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }

        }
    }

    public static void main(String[] ar) {
        Temperatura ventana = new Temperatura();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

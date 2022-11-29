import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Potencia extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Potencia() {

        setLayout(null);
        setTitle("Convertir Potencia - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Potencia ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);

        String[] datos1 = { "Kilowatio" , "Kilocaloría/hora" , "Btu (IT)/hora" , "Horse power(USA)" , "Caballo vapor metrico" , "Tonelada de refrigeración"};
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 130, 30);
        this.add(dos);

        String[] datos2 = { "Kilowatio" , "Kilocaloría/hora" , "Btu (IT)/hora" , "Horse power(USA)" , "Caballo vapor metrico" , "Tonelada de refrigeración"};
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

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String box1 = (String) dos.getSelectedItem();
        String box2 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box1.equals("Kilowatio") && box2.equals("Kilowatio")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilowatio") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 0.0011632;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilowatio") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 0.00029307;
                textfield2.setText(String.valueOf(a));

            } else if (box1.equals("Kilowatio") && box2.equals("Horse power(USA)")) {
                double a = x1 * 0.7456999;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilowatio") && box2.equals("Caballo vapor metrico")) {
                double a = x1 * 0.7354988;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilowatio") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 * 3.5168;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Kilocaloría/hora") && box2.equals("Kilowatio")) {
                double a = x1 * 859.84523;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilocaloría/hora") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilocaloría/hora") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 0.2519958;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilocaloría/hora") && box2.equals("Horse power(USA)")) {
                double a = x1 * 641.18648;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilocaloría/hora") && box2.equals("Caballo vapor metrico")) {
                double a = x1 * 632.41509;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Kilocaloría/hora") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 / 3023.9037;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Btu (IT)/hora") && box2.equals("Kilowatio")) {
                double a = x1 / 3412.1416;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Btu (IT)/hora") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 3.9683207;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Btu (IT)/hora") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Btu (IT)/hora") && box2.equals("Horse power(USA)")) {
                double a = x1 * 2544.4336;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Btu (IT)/hora") && box2.equals("Caballo vapor metrico")) {
                double a = x1 * 2509.6259;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Btu (IT)/hora") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 / 11999.82;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Horse power(USA)") && box2.equals("Kilowatio")) {
                double a = x1 / 1.3410221;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Horse power(USA)") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 0.0015596;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Horse power(USA)") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 0.00039301;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Horse power(USA) ") && box2.equals("Horse power(USA)")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Horse power(USA)") && box2.equals("Caballo vapor metrico")) {
                double a = x1 / 0.9863201;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Horse power(USA)") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 / 4.7161065;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Caballo vapor metrico") && box2.equals("Kilowatio")) {
                double a = x1 / 1.3596216;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Caballo vapor metrico") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 0.0015812;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Caballo vapor metrico") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 0.00039847;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Caballo vapor metrico") && box2.equals("Horse power(USA)")) {
                double a = x1 * 1.0138697;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Caballo vapor metrico") && box2.equals("Caballo vapor metrico")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Caballo vapor metrico") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 * 4.7815173;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Tonelada de refrigeración") && box2.equals("Kilowatio")) {
                double a = x1 * 0.2843494;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Tonelada de refrigeración") && box2.equals("Kilocaloría/hora")) {
                double a = x1 * 0.0003307;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Tonelada de refrigeración") && box2.equals("Btu (IT)/hora")) {
                double a = x1 * 0.000083335;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Tonelada de refrigeración") && box2.equals("Horse power(USA)")) {
                double a = x1 * 0.2120393;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Tonelada de refrigeración") && box2.equals("Caballo vapor metrico")) {
                double a = x1 * 0.02091386;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Tonelada de refrigeración") && box2.equals("Tonelada de refrigeración")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            }

        }
    }

    public static void main(String[] args) {
        Potencia ventana = new Potencia();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Energeticos extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Energeticos() {

        setLayout(null);
        setTitle("Convertir Potencia - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Potencia ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);

        String[] datos1 = { "Terajulio" , "Gigavatio hora" , "Teracaloría (IT)" , "Ton. equivalente de carbon" , "Ton. equivalente de petrroleo" ,"Barril de petróleo" };
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 130, 30);
        this.add(dos);

        String[] datos2 = { "Terajulio" , "Gigavatio hora" , "Teracaloría (IT)" , "Ton. equivalente de carbon" , "Ton. equivalente de petrroleo" ,"Barril de petróleo"};
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

    public void actionPerformed(ActionEvent e) {
        
        String box1 = (String) dos.getSelectedItem();
        String box2 = (String) tres.getSelectedItem();

        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText();
            double x1 = Integer.parseInt(cad1);

            if (box1.equals("Terajulio") && box2.equals("Terajulio")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Terajulio") && box2.equals("Gigavatio hora")) {
                double a = x1 * 3.6;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Terajulio") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 4.1868;
                textfield2.setText(String.valueOf(a));

            } else if (box1.equals("Terajulio") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.0293076;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Terajulio") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 * 0.041868;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Terajulio") && box2.equals("Barril de petróleo")) {
                double a = x1 * 2.0180376;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Gigavatio hora") && box2.equals("Terajulio")) {
                double a = x1 * 0.2727;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Gigavatio hora") && box2.equals("Gigavatio hora")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Gigavatio hora") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 1.163;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Gigavatio hora") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.008141;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Gigavatio hora") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 * 0.01163;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Gigavatio hora") && box2.equals("Barril de petróleo")) {
                double a = x1 / 0.560568;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Teracaloría (IT)") && box2.equals("Terajulio")) {
                double a = x1 / 0.2388459;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Teracaloría (IT)") && box2.equals("Gigavatio hora")) {
                double a = x1 * 0.8598452;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Teracaloría (IT)") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Teracaloría (IT)") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.007;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Teracaloría (IT)") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 * 0.01;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Teracaloría (IT)") && box2.equals("Barril de petróleo")) {
                double a = x1 / 0.482;
                textfield2.setText(String.valueOf(a));
            }

            if (box1.equals("Ton. equivalente de carbon") && box2.equals("Terajulio")) {
                double a = x1 / 34.1208424;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de carbon") && box2.equals("Gigavatio hora")) {
                double a = x1 * 122.8350326;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de carbon") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 142.8571429;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de carbon ") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.007;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de carbon") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 / 1.4285714;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de carbon") && box2.equals("Barril de petróleo")) {
                double a = x1 / 68.8571429;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Terajulio")) {
                double a = x1 / 23.8845897;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Gigavatio hora")) {
                double a = x1 * 85.9845228;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 100;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.7;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Ton. equivalente de petrroleo") && box2.equals("Barril de petróleo")) {
                double a = x1 * 48.2;
                textfield2.setText(String.valueOf(String.format("%.4f", a)));
            }

            if (box1.equals("Barril de petróleo") && box2.equals("Terajulio")) {
                double a = x1 * 0.4955309;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Barril de petróleo") && box2.equals("Gigavatio hora")) {
                double a = x1 * 1.7839113;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Barril de petróleo") && box2.equals("Teracaloría (IT)")) {
                double a = x1 * 2.0746888;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Barril de petroleo") && box2.equals("Ton. equivalente de carbon")) {
                double a = x1 * 0.0145228;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Barril de petróleo") && box2.equals("Ton. equivalente de petrroleo")) {
                double a = x1 * 0.0207469;
                textfield2.setText(String.valueOf(a));
            } else if (box1.equals("Barril de petróleo") && box2.equals("Barril de petróleo")) {
                double a = x1 * 1;
                textfield2.setText(String.valueOf(a));
            }

        }
    }

    public static void main(String[] args) {
        Energeticos ventana = new Energeticos();
        ventana.setBounds(500 , 100 , 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
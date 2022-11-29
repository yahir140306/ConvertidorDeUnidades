import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

public class Energia extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JComboBox<String> dos, tres;
    private JButton boton1;

    public Energia() {

        setLayout(null);
        setTitle("Convertir Energia - 3 EV - :)");

        JLabel trata = new JLabel("Conversion - Energia ");
        trata.setBounds(160, 1, 300, 30);
        add(trata);

        JLabel trata1 = new JLabel("Hecho: Yahir , Evelyn , Zury , Tania , Anahi ");
        trata1.setBounds(110, 380, 350, 30);
        add(trata1);

        String[] datos1 = { "Kilojulio - kJ" , "kW / hora - kW - h" , "Hourse, power / hora - hp. h", "Caballo / hora - CV.h" , "Kilocaloría (IT) - Kcal (IT)" ,
        "British - Btu(IT)"};
        dos = new JComboBox<String>(datos1);
        dos.setBounds(20, 150, 130, 30);
        this.add(dos);

        String[] datos2 = { "Kilojulio - kJ" , "kW / hora - kW - h" , "Hourse, power / hora - hp.h", "Caballo / hora - CV.h" , "Kilocaloría (IT) - Kcal (IT)" ,
        "British - Btu(IT)"};
        tres = new JComboBox<String>(datos2);
        tres.setBounds(265, 150, 130, 30);
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
           // String cad1 = textField1.getText();
        }
    

// KILOJULIO

if (box1.equals("Kilojulio - kJ") && box2.equals("kW / hora - kW - h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.0002777;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilojulio - kJ") && box2.equals("Hourse, power / hora - hp. h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.000372506;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilojulio - kJ") && box2.equals("Caballo / hora - CV.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.000377673;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilojulio - kJ") && box2.equals("Kilocaloría(IT) - Kcal(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.2388459;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilojulio - kJ") && box2.equals("British - Btu(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.9478171;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}

// kW/hora - kW h

if (box1.equals("kW / hora - kW - h") && box2.equals("Kilojulio - kJ")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 3600;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("kW / hora - kW - h") && box2.equals("Hourse, power / hora - hp.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 1.3410221;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("kW / hora - kW - h") && box2.equals("Caballo / hora - CV.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 1.3596216;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("kW / hora - kW - h") && box2.equals("Kilocaloría(IT) - Kcal(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 859.84523;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("kW / hora - kW - h") && box2.equals("British - Btu(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 3412.1416;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}

// Hourse power/hora - hp. h -- "Hourse, power / hora - hp. h"

if (box1.equals("Hourse, power / hora - hp. h") && box2.equals("Kilojulio - kJ")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 2684.5195;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Hourse, power / hora - hp. h") && box2.equals("kW / hora - kW - h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.7456999;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Hourse, power / hora - hp. h") && box2.equals("Caballo / hora - CV.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 1.0138697;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Hourse, power / hora - hp. h") && box2.equals("Kilocaloría(IT) - Kcal(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 641.18648;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Hourse, power / hora - hp. h") && box2.equals("British - Btu(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 2544.4336;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}

// Caballo/hora - CV.h

if (box1.equals("Caballo / hora - CV.h") && box2.equals("Kilojulio - kJ")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 2647.7955;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Caballo / hora - CV.h") && box2.equals("kW / hora - kW - h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.7354988;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Caballo / hora - CV.h") && box2.equals("Hourse, power / hora - hp. h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.9863201;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Caballo / hora - CV.h") && box2.equals("Kilocaloría(IT) - Kcal(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 632.41509;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Caballo / hora - CV.h") && box2.equals("British - Btu(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 2509.6259;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}

// Kilocaloría (IT) - Kcal (IT)

if (box1.equals("Kilocaloría (IT) - Kcal (IT)") && box2.equals("Kilojulio - kJ")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 4.1868;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilocaloría (IT) - Kcal (IT)") && box2.equals("kW/hora - kW - h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.001163;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilocaloría (IT) - Kcal (IT)") && box2.equals("Hourse, power / hora - hp. h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.00155961;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilocaloría (IT) - Kcal (IT)") && box2.equals("Caballo / hora - CV.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.00158124;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("Kilocaloría (IT) - Kcal (IT)") && box2.equals("British - Btu(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 3.9683207;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}

// British - Btu (IT)

if (box1.equals("British - Btu (IT)") && box2.equals("Kilojulio - kJ")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 1.0550559;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("British - Btu (IT)") && box2.equals("kW / hora - kW - h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.000293071;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("British - Btu (IT)") && box2.equals("Hourse, power / hora - hp. h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.00039301;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("British - Btu (IT)") && box2.equals("Caballo / hora - CV.h")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.000398466;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}
if (box1.equals("British - Btu (IT)") && box2.equals("Kilocaloría(IT) - Kcal(IT)")) {
    double ans = Double.parseDouble(textField1.getText());
    double res = ans * 0.2519958;
    textField2.setText(String.valueOf(String.format("%.4f", res)));
}


}


public static void main(String[] ar) {
    Superficie ventana = new Superficie();
    ventana.setBounds(500 , 100 , 450, 450);
    ventana.setVisible(true);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
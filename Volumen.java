// llamamos a nuestras bibliotecas para poder crear el proyecto de la interfaz
import javax.swing.*; // nos ayuda a crear los elementos o partes de la interfaz
import java.awt.*; // para otros recursos a parte del evento en el programa
import java.awt.event.*; // ayuda cuando toquemos el boton haga cierta accion

public class Volumen extends JFrame implements ActionListener { // iniciamos con las partes del programa
// aqui se hace un herencia para crear el programa
    private JTextField textField1, textField2; // creamos internamente nuestros zonas de texto
    private JButton boton1; // creamos internamente el boton donde despues tendra el evento
    private JComboBox uno, dos; // creamos internamente nuestras listas de opcines

    public Volumen() { // despues vamos a llamarlos para que se vean y ubicarlos

        setTitle("Convertir Volumen - 3 EV - :)  "); // pones nuestro titulo de arriba
        setLayout(null); // si no me equivoco nos ayuda a que nosotros decidamos el orden de nuestros elementos

        JLabel hecho = new JLabel(" Hecho: Yahir , Evelyn , Zury , Tania , Anahi"); // pones un texto especifico
        hecho.setBounds(115, 350, 300, 100); // ponemos dende lo queremos
        add(hecho); // lo mandamos a que se vea con todas las caracteritiscas que le dimos

        JLabel subTitulo = new JLabel("Conversion - Volumen");
        subTitulo.setBounds(160, 10, 150, 30);
        add(subTitulo);

        JLabel num = new JLabel("INGRESE : ");
        num.setBounds(65, 125, 100, 30);
        add(num);

        JLabel num1 = new JLabel("RESULTADO :");
        num1.setBounds(310, 125, 100, 30);
        add(num1);

        textField1 = new JTextField(); // ingresa la cantidad
        textField1.setBounds(50, 100, 100, 30);
        add(textField1);

        textField2 = new JTextField(); // muestra resultado
        textField2.setBounds(300, 100, 100, 30);
        add(textField2);

        boton1 = new JButton();
        boton1.setBounds(150, 220, 150, 50);
        ImageIcon clik = new ImageIcon("ImgBoton.jpg");
        boton1.setIcon(new ImageIcon(clik.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        add(boton1);
        boton1.addActionListener(this);

        // String x , x2 , x3, x4 , x5 , x6;
        String[] medida1 = { "Metro Cubico - m3", "Litro - dm3", "Pie Cubico - ft3", "Galon USA - gal",
                "Galon Imperial GB - gal", "Barril De Petroleo - bbl (oil)" };
        uno = new JComboBox(medida1);
        uno.setBounds(10, 175, 160, 30);
        this.add(uno);

        // String y , y2 , y3, y4 , y5 , y6;
        String[] medida2 = { "Metro Cubico - m3", "Litro - dm3", "Pie Cubico - ft3", "Galon USA - gal",
                "Galon Imperial GB - gal", "Barril De Petroleo - bbl (oil)" };
        dos = new JComboBox(medida2);
        dos.setBounds(250, 175, 160, 30);
        add(dos);
        this.add(dos);
    }

    public void actionPerformed(ActionEvent e) {
        String box1 = (String) uno.getSelectedItem();
        String box2 = (String) dos.getSelectedItem();

        if (e.getSource() == boton1) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 1 Metro Cubico
            if (box1.equals("Metro Cubico - m3") && box2.equals("Litro - dm3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 1000;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Metro Cubico - m3") && box2.equals("Pie Cubico - ft3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 35.31;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Metro Cubico - m3") && box2.equals("Galon USA - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 264.17;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Metro Cubico - m3") && box2.equals("Galon Imperial GB - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 219.96;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Metro Cubico - m3") && box2.equals("Barril De Petroleo - bbl (oil)")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 6.28;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 2 Litro
            if (box1.equals("Litro - dm3") && box2.equals("Metro Cubico - m3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.001;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Litro - dm3") && box2.equals("Pie Cubico - ft3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.035;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Litro - dm3") && box2.equals("Galon USA - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.26;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Litro - dm3") && box2.equals("Galon Imperial GB - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.21;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Litro - dm3") && box2.equals("Barril De Petroleo - bbl (oil)")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.006;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 3 Pie Cubico - ft3
            if (box1.equals("Pie Cubico - ft3") && box2.equals("Metro Cubico - m3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.02;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Pie Cubico - ft3") && box2.equals("Litro - dm3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 28.31;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Pie Cubico - ft3") && box2.equals("Galon USA - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 7.48;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Pie Cubico - ft3") && box2.equals("Galon Imperial GB - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 6.22;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Pie Cubico - ft3") && box2.equals("Barril De Petroleo - bbl (oil)")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.17;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 4 Galon USA - gal
            if (box1.equals("Galon USA - gal") && box2.equals("Metro Cubico - m3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.003;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon USA - gal") && box2.equals("Litro - dm3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 3.78;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon USA - gal") && box2.equals("Pie Cubico - ft3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.13;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon USA - gal") && box2.equals("Galon Imperial GB - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.83;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon USA - gal") && box2.equals("Barril De Petroleo - bbl (oil)")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.023;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 5 Galon Imperial GB - gal
            if (box1.equals("Galon Imperial GB - gal") && box2.equals("Metro Cubico - m3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.004;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon Imperial GB - gal") && box2.equals("Litro - dm3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 4.54;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon Imperial GB - gal") && box2.equals("Pie Cubico - ft3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.16;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon Imperial GB - gal") && box2.equals("Galon USA - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 1.20;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Galon Imperial GB - gal") && box2.equals("Barril De Petroleo - bbl (oil)")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 0.02;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // si escoje 6 Barril De Petroleo - bbl (oil)
            if (box1.equals("Barril De Petroleo - bbl (oil)") && box2.equals("Metro Cubico - m3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 1589873;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Barril De Petroleo - bbl (oil)") && box2.equals("Litro - dm3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 158987295;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Barril De Petroleo - bbl (oil)") && box2.equals("Pie Cubico - ft3")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 56145833;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Barril De Petroleo - bbl (oil)") && box2.equals("Galon USA - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 42;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
            if (box1.equals("Barril De Petroleo - bbl (oil)") && box2.equals("Galon Imperial GB - gal")) {
                double ans = Double.parseDouble(textField1.getText());
                double res = ans * 34.97;
                textField2.setText(String.valueOf(String.format("%.4f", res)));
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        }
    }

    public static void main(String[] args) {

        Volumen ventana = new Volumen();
        ventana.setBounds(0, 0, 450, 450);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

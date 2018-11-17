package ua.kh.nure.baklanov;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class GUI extends JFrame implements ActionListener, Runnable{
    final static JTextArea b11 = new JTextArea("0");
    final static JTextArea b12 = new JTextArea("0");
    final static JTextArea b13 = new JTextArea("0");
    final static JTextArea b14 = new JTextArea("0");
    final static JTextArea b15 = new JTextArea("0");
    final static JTextArea b21 = new JTextArea("0");
    final static JTextArea b22 = new JTextArea("0");
    final static JTextArea b23 = new JTextArea("0");
    final static JTextArea b24 = new JTextArea("0");
    final static JTextArea b25 = new JTextArea("0");
    final static JTextArea b31 = new JTextArea("0");
    final static JTextArea b32 = new JTextArea("0");
    final static JTextArea b33 = new JTextArea("0");
    final static JTextArea b34 = new JTextArea("0");
    final static JTextArea b35 = new JTextArea("0");
    final static JTextArea b41 = new JTextArea("0");
    final static JTextArea b42 = new JTextArea("0");
    final static JTextArea b43 = new JTextArea("0");
    final static JTextArea b44 = new JTextArea("0");
    final static JTextArea b45 = new JTextArea("0");
    final static JTextArea b51 = new JTextArea("0");
    final static JTextArea b52 = new JTextArea("0");
    final static JTextArea b53 = new JTextArea("0");
    final static JTextArea b54 = new JTextArea("0");
    final static JTextArea b55 = new JTextArea("0");
    final static JTextArea b1 = new JTextArea("0");
    final static JTextArea b2 = new JTextArea("0");
    final static JTextArea b3 = new JTextArea("0");
    final static JTextArea b4 = new JTextArea("0");
    final static JTextArea b5 = new JTextArea("0");
    final static JTextArea c1 = new JTextArea("0");
    final static JTextArea c2 = new JTextArea("0");
    final static JTextArea c3 = new JTextArea("0");
    final static JTextArea c4 = new JTextArea("0");
    final static JTextArea c5 = new JTextArea("0");
    final static JButton acceptMax = new JButton("Maximize");
    final static JButton acceptMin = new JButton("Minimize");
    static String[] items = {
            "<=",
            "=",
            ">="
    };
    static JComboBox comboBox1 = new JComboBox(items);
    static JComboBox comboBox2 = new JComboBox(items);
    static JComboBox comboBox3 = new JComboBox(items);
    static JComboBox comboBox4 = new JComboBox(items);
    static JComboBox comboBox5 = new JComboBox(items);


    public static double[][] createArrayA()
    {
        double[][] A = new double[5][5];
        A[0][0] = Double.parseDouble(b11.getText());
        A[0][1] = Double.parseDouble(b12.getText());
        A[0][2] = Double.parseDouble(b13.getText());
        A[0][3] = Double.parseDouble(b14.getText());
        A[0][4] = Double.parseDouble(b15.getText());
        A[1][0] = Double.parseDouble(b21.getText());
        A[1][1] = Double.parseDouble(b22.getText());
        A[1][2] = Double.parseDouble(b23.getText());
        A[1][3] = Double.parseDouble(b24.getText());
        A[1][4] = Double.parseDouble(b25.getText());
        A[2][0] = Double.parseDouble(b31.getText());
        A[2][1] = Double.parseDouble(b32.getText());
        A[2][2] = Double.parseDouble(b33.getText());
        A[2][3] = Double.parseDouble(b34.getText());
        A[2][4] = Double.parseDouble(b35.getText());
        A[3][0] = Double.parseDouble(b41.getText());
        A[3][1] = Double.parseDouble(b42.getText());
        A[3][2] = Double.parseDouble(b43.getText());
        A[3][3] = Double.parseDouble(b44.getText());
        A[3][4] = Double.parseDouble(b45.getText());
        A[4][0] = Double.parseDouble(b51.getText());
        A[4][1] = Double.parseDouble(b52.getText());
        A[4][2] = Double.parseDouble(b53.getText());
        A[4][3] = Double.parseDouble(b54.getText());
        A[4][4] = Double.parseDouble(b55.getText());


        return A;
    }

    public static double[] createArrayB() {
        double[] B = new double[5];
        B[0]=Double.parseDouble(b1.getText());
        B[1]=Double.parseDouble(b2.getText());
        B[2]=Double.parseDouble(b3.getText());
        B[3]=Double.parseDouble(b4.getText());
        B[4]=Double.parseDouble(b5.getText());
        return B;
    }

    public static double[] createArrayC() {
        double[] C = new double[5];
        C[0]=Double.parseDouble(c1.getText());
        C[1]=Double.parseDouble(c2.getText());
        C[2]=Double.parseDouble(c3.getText());
        C[3]=Double.parseDouble(c4.getText());
        C[4]=Double.parseDouble(c5.getText());
        return C;
    }

    public static String[] getRelationship()
    {
        String[]arrayOfRel=new String[5];
        arrayOfRel[0]=comboBox1.getSelectedItem().toString();
        arrayOfRel[1]=comboBox2.getSelectedItem().toString();
        arrayOfRel[2]=comboBox3.getSelectedItem().toString();
        arrayOfRel[3]=comboBox4.getSelectedItem().toString();
        arrayOfRel[4]=comboBox5.getSelectedItem().toString();
        return arrayOfRel;
    }

    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
        pane.add(b4);
        pane.add(b5);
        pane.add(b11);
        pane.add(b12);
        pane.add(b13);
        pane.add(b14);
        pane.add(b15);
        pane.add(b21);
        pane.add(b22);
        pane.add(b23);
        pane.add(b24);
        pane.add(b25);
        pane.add(b31);
        pane.add(b32);
        pane.add(b33);
        pane.add(b34);
        pane.add(b35);
        pane.add(b41);
        pane.add(b42);
        pane.add(b43);
        pane.add(b44);
        pane.add(b45);
        pane.add(b51);
        pane.add(b52);
        pane.add(b53);
        pane.add(b54);
        pane.add(b55);
        pane.add(c1);
        pane.add(c2);
        pane.add(c3);
        pane.add(c4);
        pane.add(c5);
        pane.add(acceptMax);
        pane.add(acceptMin);
        pane.add(comboBox1);
        pane.add(comboBox2);
        pane.add(comboBox3);
        pane.add(comboBox4);
        pane.add(comboBox5);


        b11.setBounds(25, 25, 50,25);
        b12.setBounds(100, 25, 50,25);
        b13.setBounds(175, 25, 50, 25);
        b14.setBounds(250, 25, 50,25);
        b15.setBounds(325, 25, 50,25);
        b21.setBounds(25, 75, 50,25);
        b22.setBounds(100, 75, 50,25);
        b23.setBounds(175, 75, 50, 25);
        b24.setBounds(250, 75, 50,25);
        b25.setBounds(325, 75, 50,25);
        b31.setBounds(25, 125, 50,25);
        b32.setBounds(100, 125, 50,25);
        b33.setBounds(175, 125, 50, 25);
        b34.setBounds(250, 125, 50,25);
        b35.setBounds(325, 125, 50,25);
        b41.setBounds(25, 175, 50,25);
        b42.setBounds(100, 175, 50,25);
        b43.setBounds(175, 175, 50, 25);
        b44.setBounds(250, 175, 50,25);
        b45.setBounds(325, 175, 50,25);
        b51.setBounds(25, 225, 50,25);
        b52.setBounds(100, 225, 50,25);
        b53.setBounds(175, 225, 50, 25);
        b54.setBounds(250, 225, 50,25);
        b55.setBounds(325, 225, 50,25);
        b1.setBounds(550, 25, 50,25);
        b2.setBounds(550, 75, 50,25);
        b3.setBounds(550, 125, 50, 25);
        b4.setBounds(550, 175, 50,25);
        b5.setBounds(550, 225, 50,25);
        c1.setBounds(100, 300, 50,25);
        c2.setBounds(175, 300, 50,25);
        c3.setBounds(250, 300, 50, 25);
        c4.setBounds(325, 300, 50,25);
        c5.setBounds(400, 300, 50,25);
        acceptMax.setBounds(275, 350,100,25);
        acceptMin.setBounds(400, 350,100,25);
        comboBox1.setBounds(450,25,50,25);
        comboBox2.setBounds(450,75,50,25);
        comboBox3.setBounds(450,125,50,25);
        comboBox4.setBounds(450,175,50,25);
        comboBox5.setBounds(450,225,50,25);

        acceptMax.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b11.getText().equals("") || b12.getText().equals("") || b13.getText().equals("") || b14.getText().equals("") || b15.getText().equals("") || b21.getText().equals("") || b22.getText().equals("") || b23.getText().equals("") || b24.getText().equals("")|| b25.getText().equals("") ||
                        b31.getText().equals("") || b32.getText().equals("")|| b33.getText().equals("") || b34.getText().equals("") || b35.getText().equals("") || b41.getText().equals("") || b42.getText().equals("")|| b43.getText().equals("") || b44.getText().equals("") || b45.getText().equals("") ||
                        b51.getText().equals("") || b52.getText().equals("") || b53.getText().equals("") || b54.getText().equals("") || b55.getText().equals("")|| b1.getText().equals("")|| b2.getText().equals("")|| b3.getText().equals("")|| b4.getText().equals("")|| b5.getText().equals("")) {

                } else {


                    /*int width = 5, heigth = 5;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0 && A[i][3] == 0 && A[i][4] == 0) {
                            heigth--;

                        }
                        if (A[0][i] == 0 && A[1][i] == 0 && A[2][i] == 0 && A[3][i] == 0 && A[4][i] == 0) {
                            width--;
                        }
                    }*/

                    SimplexMethod sm = new SimplexMethod();
                    sm.simplexDoubleMaximize(createArrayA(),createArrayB(),createArrayC(),getRelationship());
                }
            }
        });
        acceptMin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b11.getText().equals("") || b12.getText().equals("") || b13.getText().equals("") || b14.getText().equals("") || b15.getText().equals("") || b21.getText().equals("") || b22.getText().equals("") || b23.getText().equals("") || b24.getText().equals("")|| b25.getText().equals("") ||
                        b31.getText().equals("") || b32.getText().equals("")|| b33.getText().equals("") || b34.getText().equals("") || b35.getText().equals("") || b41.getText().equals("") || b42.getText().equals("")|| b43.getText().equals("") || b44.getText().equals("") || b45.getText().equals("") ||
                        b51.getText().equals("") || b52.getText().equals("") || b53.getText().equals("") || b54.getText().equals("") || b55.getText().equals("")|| b1.getText().equals("")|| b2.getText().equals("")|| b3.getText().equals("")|| b4.getText().equals("")|| b5.getText().equals("")) {

                } else {


                    /*int width = 5, heigth = 5;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0 && A[i][3] == 0 && A[i][4] == 0) {
                            heigth--;

                        }
                        if (A[0][i] == 0 && A[1][i] == 0 && A[2][i] == 0 && A[3][i] == 0 && A[4][i] == 0) {
                            width--;
                        }
                    }*/

                    SimplexMethod sm = new SimplexMethod();
                    sm.simplexDoubleMinimize(createArrayA(),createArrayB(),createArrayC(),getRelationship());
                }
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("AbsoluteLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentsToPane(frame.getContentPane());

        frame.setSize(800,
                800);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                createAndShowGUI();

            }
        });
    }
}

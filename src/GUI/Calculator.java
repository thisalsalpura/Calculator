/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author User
 */
class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28;
    String fv, sv, op, MS;
    Double fdv, sdv, tot;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(new Color(32, 24, 22));
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(400, 575);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Yu Gothic UI", 1, 84);
        Font f2 = new Font("Yu Gothic UI", 1, 12);
        Font f3 = new Font("Yu Gothic UI", 1, 28);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        m1.setFont(f2);

        Menu m2 = new Menu("Edit");
        m2.setFont(f2);

        Menu m3 = new Menu("Help");
        m3.setFont(f2);
        MenuItem mi1 = new MenuItem("View Help F1");
        MenuItem mi2 = new MenuItem("About Calculator");
        m3.add(mi1);
        m3.add(mi2);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout gl = new GridLayout(1, 0, 0, 0);
        GridLayout gl2 = new GridLayout(7, 4, 4, 4);
        p1.setLayout(gl);
        p2.setLayout(gl2);
        p2.setBackground(new Color(32, 24, 22));

        tf = new TextField();
        tf.setFont(f1);
        tf.setEditable(true);
        tf.setForeground(Color.white);
        tf.setBackground(new Color(46, 38, 37));
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("MS");
        b4 = new Button("<");
        b5 = new Button("M +");
        b6 = new Button("M -");
        b7 = new Button("CE");
        b8 = new Button("C");
        b9 = new Button("1/x");
        b10 = new Button("x^2");
        b11 = new Button("2√x");
        b12 = new Button("÷");
        b13 = new Button("7");
        b14 = new Button("8");
        b15 = new Button("9");
        b16 = new Button("×");
        b17 = new Button("4");
        b18 = new Button("5");
        b19 = new Button("6");
        b20 = new Button("-");
        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("+");
        b25 = new Button("%");
        b26 = new Button("0");
        b27 = new Button(".");
        b28 = new Button("=");

        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.white);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.white);
        b16.setForeground(Color.white);
        b17.setForeground(Color.white);
        b18.setForeground(Color.white);
        b19.setForeground(Color.white);
        b20.setForeground(Color.white);
        b21.setForeground(Color.white);
        b22.setForeground(Color.white);
        b23.setForeground(Color.white);
        b24.setForeground(Color.white);
        b25.setForeground(Color.white);
        b26.setForeground(Color.white);
        b27.setForeground(Color.white);
        b28.setForeground(Color.white);

        b1.setBackground(new Color(46, 38, 37));
        b2.setBackground(new Color(46, 38, 37));
        b3.setBackground(new Color(46, 38, 37));
        b4.setBackground(new Color(46, 38, 37));
        b5.setBackground(new Color(46, 38, 37));
        b6.setBackground(new Color(46, 38, 37));
        b7.setBackground(new Color(46, 38, 37));
        b8.setBackground(new Color(46, 38, 37));
        b9.setBackground(new Color(46, 38, 37));
        b10.setBackground(new Color(46, 38, 37));
        b11.setBackground(new Color(46, 38, 37));
        b12.setBackground(new Color(46, 38, 37));
        b13.setBackground(new Color(46, 38, 37));
        b14.setBackground(new Color(46, 38, 37));
        b15.setBackground(new Color(46, 38, 37));
        b16.setBackground(new Color(46, 38, 37));
        b17.setBackground(new Color(46, 38, 37));
        b18.setBackground(new Color(46, 38, 37));
        b19.setBackground(new Color(46, 38, 37));
        b20.setBackground(new Color(46, 38, 37));
        b21.setBackground(new Color(46, 38, 37));
        b22.setBackground(new Color(46, 38, 37));
        b23.setBackground(new Color(46, 38, 37));
        b24.setBackground(new Color(46, 38, 37));
        b25.setBackground(new Color(46, 38, 37));
        b26.setBackground(new Color(46, 38, 37));
        b27.setBackground(new Color(46, 38, 37));
        b28.setBackground(new Color(166, 155, 103));

        b1.setFont(f3);
        b2.setFont(f3);
        b3.setFont(f3);
        b4.setFont(f3);
        b5.setFont(f3);
        b6.setFont(f3);
        b7.setFont(f3);
        b8.setFont(f3);
        b9.setFont(f3);
        b10.setFont(f3);
        b11.setFont(f3);
        b12.setFont(f3);
        b13.setFont(f3);
        b14.setFont(f3);
        b15.setFont(f3);
        b16.setFont(f3);
        b17.setFont(f3);
        b18.setFont(f3);
        b19.setFont(f3);
        b20.setFont(f3);
        b21.setFont(f3);
        b22.setFont(f3);
        b23.setFont(f3);
        b24.setFont(f3);
        b25.setFont(f3);
        b26.setFont(f3);
        b27.setFont(f3);
        b28.setFont(f3);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b21)) {
            tf.setText(tf.getText() + b21.getLabel());
        } else if (o.equals(b22)) {
            tf.setText(tf.getText() + b22.getLabel());
        } else if (o.equals(b23)) {
            tf.setText(tf.getText() + b23.getLabel());
        } else if (o.equals(b26)) {
            tf.setText(tf.getText() + b26.getLabel());
        } else if (o.equals(b27)) {
            tf.setText(tf.getText() + b27.getLabel());
        } else if (o.equals(b3)) { // MS
            MS = tf.getText();
            tf.setText("0");
        } else if (o.equals(b2)) { // MR
            tf.setText(MS);
        } else if (o.equals(b1)) { // MC
            MS = "0";
        } else if (o.equals(b5)) { // M +
            if (tf.getText().equals("")) {
                sv = "0";
            } else {
                sv = tf.getText();
            }
            sdv = Double.parseDouble(sv);
            tot = sdv + Double.parseDouble(MS);
            tf.setText(tot + "");
        } else if (o.equals(b6)) { // M -
            if (tf.getText().equals("")) {
                sv = "0";
            } else {
                sv = tf.getText();
            }
            sdv = Double.parseDouble(sv);
            tot = sdv - Double.parseDouble(MS);
            tf.setText(tot + "");
        } else if (o.equals(b4)) { // <
            String text = tf.getText();
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
                tf.setText(text);
            }
        } else if (o.equals(b7)) { // CE
            tf.setText("0");
        } else if (o.equals(b8)) { // C
            tf.setText("0");
            MS = "0";
            op = "";
        } else if (o.equals(b20)) { // -
            fv = tf.getText();
            op = b20.getLabel();
            tf.setText("");
        } else if (o.equals(b24)) { // +
            fv = tf.getText();
            op = b24.getLabel();
            tf.setText("");
        } else if (o.equals(b16)) { // ×
            fv = tf.getText();
            op = b16.getLabel();
            tf.setText("");
        } else if (o.equals(b12)) { // ÷
            fv = tf.getText();
            op = b12.getLabel();
            tf.setText("");
        } else if (o.equals(b25)) { // %
            sv = tf.getText();
            sdv = Double.parseDouble(sv) / 100;
            tf.setText(sdv + "");
        } else if (o.equals(b11)) { // √
            sv = tf.getText();
            sdv = Double.parseDouble(sv);
            tot = Math.sqrt(sdv);
            tf.setText(tot + "");
        } else if (o.equals(b10)) { // ^
            sv = tf.getText();
            sdv = Double.parseDouble(sv);
            tot = sdv * sdv;
            tf.setText(tot + "");
        } else if (o.equals(b9)) { // 1/x
            sv = tf.getText();
            sdv = Double.parseDouble(sv);
            tot = 1 / sdv;
            tf.setText(tot + "");
        } else if (o.equals(b28)) { // =
            sv = tf.getText();

            if (op != null && !op.isEmpty()) {

                if (sv.isEmpty()) {
                    sv = "0";
                } else if (fv.isEmpty()) {
                    fv = "0";
                }

                fdv = Double.parseDouble(fv);
                sdv = Double.parseDouble(sv);
                tf.setText("");

                if (op.equals("+")) {
                    tot = fdv + sdv;
                    tf.setText(tot + "");
                } else if (op.equals("-")) {
                    tot = fdv - sdv;
                    tf.setText(tot + "");
                } else if (op.equals("×")) {
                    tot = fdv * sdv;
                    tf.setText(tot + "");
                } else if (op.equals("÷")) {
                    tot = fdv / sdv;
                    tf.setText(tot + "");
                }
                tf.setText(tot + "");

            }

        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }

}

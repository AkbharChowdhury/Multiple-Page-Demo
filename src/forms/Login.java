package forms;

import classes.Helper;
import classes.Navigation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public final class Login extends JFrame implements ActionListener {
    Navigation nav = new Navigation();
    JFrame frame = new JFrame();

    JTextField carsTxt = new JTextField(3);
    JTextField vansTxt = new JTextField(3);
    JButton carsBtn = new JButton("Car");
    JButton vansBtn = new JButton("Van");
    JButton reset = new JButton("Reset");
    int cars = 0, vans = 0; // counters

    public static void main(String[] args) {
        new Login();
    }

    public Login() {
        setLayout(new BorderLayout());
        setSize(600, 140);
        setTitle("login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel top = new JPanel();

        top.add(nav.btnListMovies);
        top.add(nav.btnShowTimes);
        top.add(nav.btnPurchaseTicket);
        top.add(nav.btnShowReceipt);

        add("North", top);
        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.add(carsBtn);
        bottom.add(vansBtn);
        bottom.add(reset);
        carsBtn.addActionListener(this);
        vansBtn.addActionListener(this);
        reset.addActionListener(this);
        add("South", bottom);
        setVisible(true);
        setResizable(false);

        nav.btnListMovies.addActionListener(this::handleClick);
        nav.btnShowTimes.addActionListener(this::handleClick);
        nav.btnPurchaseTicket.addActionListener(this::handleClick);
        nav.btnShowReceipt.addActionListener(this::handleClick);

    }

    private void handleClick(ActionEvent e) {
        if (nav.buttonClick(e)){
            dispose();
        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}
package classes;

import forms.ListMovies;
import forms.Login;
import forms.ShowTimes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Navigation extends JFrame implements ActionListener {
    public JButton btnListMovies = new JButton("List Movies");
    public JButton btnShowTimes = new JButton("Show Times");
    public JButton btnPurchaseTicket = new JButton("Purchase Ticket");
    public JButton btnShowReceipt = new JButton("Show Receipt");



    public Navigation(){
        btnListMovies.addActionListener(this);
        btnShowTimes.addActionListener(this);
        btnPurchaseTicket.addActionListener(this);
        btnShowReceipt.addActionListener(this);


    }
    public boolean buttonClick(ActionEvent e){
        if (e.getSource() == btnShowTimes){
            new ShowTimes();
            return true;
        }
        if (e.getSource() == btnListMovies){
            new ListMovies();
            return true;
        }

        if (e.getSource() == btnPurchaseTicket){
            int dialogButton = JOptionPane.showConfirmDialog(null, "You must be logged in to purchase tickets or print invoices, do you want to login?", "WARNING", JOptionPane.YES_NO_OPTION);
            if (dialogButton == JOptionPane.YES_OPTION){
                new Login();
                return true;


            }
            return false;



        }

        return false;

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

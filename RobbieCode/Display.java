import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Display implements ActionListener {
    
   // private Location loc1;
   //  private Location loc1;
   // private Location loc1;
   // private Location loc1;
    private JFrame frame;
    private JPanel panel;
    private JTextField text;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private Character robbie;
    
    public Display(String a, String b, String c, String d, Character r) {
        frame = new JFrame();
        frame.setTitle("Robbie's radtastic RAMpage");
        frame.setVisible(true);
        robbie = r;
        
        panel = new JPanel();
        frame.add(panel);
        
        
        button1 = new JButton(a);
        button2 = new JButton(b);
        button3 = new JButton(c);
        button4 = new JButton(d);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        frame.pack();
        
    }
    
    public void actionPerformed(ActionEvent e) {
        buttonPressed(e);
    }
    
    public void setButtons(String a, String b, String c, String d) {
        button1.setText(a);
        button2.setText(b);
        button3.setText(c);
        button4.setText(d);
    }
    
    public void buttonPressed(ActionEvent e) {
        if(robbie.getLocation() == 0)//Start
        {
            if(e.getSource() == button1) {
                robbie.setLocation(1);            
            }
            if(e.getSource() == button2) {
                 robbie.setLocation(1);
            }
            if(e.getSource() == button3) {
                 robbie.setLocation(1);
            }
            if(e.getSource() == button4) {
                 robbie.setLocation(1);
            }
        }
        else if(robbie.getLocation() == 1)//Prolouge
        {
            if(e.getSource() == button1) {
                robbie.setLocation(2);
            }
            if(e.getSource() == button2) {
                robbie.setLocation(2);
            }
            if(e.getSource() == button3) {
                robbie.setLocation(2);
            }
            if(e.getSource() == button4) {
                robbie.setLocation(2);
            }
        }
        else if(Character.getLocation() == 2)//Robbies Cave
        {
            if(e.getSource() == button1) {
                robbie.setLocation(3);
            }
            if(e.getSource() == button2) {
                robbie.setLocation(3);
            }
            if(e.getSource() == button3) {
                robbie.setLocation(3);
            }
            if(e.getSource() == button4) {
                robbie.setLocation(3);
            }
        }
        else if(Character.getLocation() == 3)//Upper Lot
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("Go West");
            }
            if(e.getSource() == button3) {
                System.out.println("Go East");
            }
            if(e.getSource() == button4) {
                System.out.println("Look around");
            }
        }
        else if(Character.getLocation() == 4)//East Path
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        else if(Character.getLocation() == 5) //West Path
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        else if(Character.getLocation() == 6) // AutoShop Door
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        else if(Character.getLocation() == 7) // Wood Shop
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        if(Character.getLocation() == 8) // Library
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        if(Character.getLocation() == 9) // Mosaic
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        if(Character.getLocation() == 10) // AutoShop
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
        if(Character.getLocation() == 11) // Win
        {
            if(e.getSource() == button1) {
            
            }
            if(e.getSource() == button2) {
                System.out.println("ay2");
            }
            if(e.getSource() == button3) {
                System.out.println("ay3");
            }
            if(e.getSource() == button4) {
                System.out.println("ay4");
            }
        }
    }
}

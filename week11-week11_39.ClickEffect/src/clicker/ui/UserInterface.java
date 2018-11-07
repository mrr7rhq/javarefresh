package clicker.ui;


import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.*;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout= new GridLayout(2,1);
        container.setLayout(layout);
        
        JLabel label= new JLabel("0");
        container.add(label);
        JButton bt= new JButton("Click!");
        container.add(bt);
        
        PersonalCalculator pcal = new   PersonalCalculator();
        ClickListener listener=new ClickListener(pcal, label);
        bt.addActionListener(listener);
       
        
    }

    public JFrame getFrame() {
        return frame;
    }
}

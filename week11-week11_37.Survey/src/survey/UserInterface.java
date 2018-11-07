package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame= new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,300));
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
        
        
        Container container=  frame.getContentPane();
        
        
        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox boxYes=new JCheckBox("Yes!");
        JCheckBox boxNo= new JCheckBox("No!");
        container.add(boxYes);
        container.add(boxNo);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton reason =new  JRadioButton("No reason.");
        JRadioButton fun =new  JRadioButton("Because it is fun!");
        ButtonGroup bg= new ButtonGroup();
        bg.add(reason);
        bg.add(fun);
        
        container.add(reason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
       
        
        frame.pack();
        frame.setVisible(true);
        
    }


    public JFrame getFrame() {
        return frame;
    }
}


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame= new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
        //process 1 new a frame. 2 set frame dimension. 3 set frame setDefaultoperation
        // 4 frame.getcontentpane. 5 create componeents 6 frame.pack 7 set frame visible. 
        
        
    }

    private void createComponents(Container container) {
        GridLayout gLayout= new GridLayout(3,1);// gridlayout(row,colume, etc)
        container.setLayout(gLayout);
        
        JTextField resultText= new JTextField("0");
        resultText.setEnabled(false);
        container.add(resultText);
        
        JTextField input= new JTextField("0");
        container.add(input);
        
        JPanel panel4Buttons = new JPanel();
        GridLayout btLayout= new GridLayout(1,3);
        panel4Buttons.setLayout(btLayout);
        
        JButton plusButton= new JButton("+");
         panel4Buttons.add(plusButton);
         JButton minusButton= new JButton("-");
         panel4Buttons.add(minusButton);
         JButton zButton= new JButton("Z");
         zButton.setEnabled(false);
         panel4Buttons.add(zButton);
         
        container.add(panel4Buttons);
        
        ButtonsListener btListener= new ButtonsListener(resultText,input,plusButton,minusButton,zButton);
        plusButton.addActionListener(btListener);
        minusButton.addActionListener(btListener);
        zButton.addActionListener(btListener);
    }

    public JFrame getFrame() {
        return frame;
    }
}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class ButtonsListener implements ActionListener {
    private JTextField resultText;
    private JTextField input;
    private JButton btPlus;
    private JButton btMinus;
    private JButton btZ;
    private int result=0;
    
    
    public ButtonsListener(JTextField resultText,JTextField input,JButton btPlus,
            JButton btMinus,JButton btZ){
        this.btMinus=btMinus;
        this.btPlus=btPlus;
        this.btZ=btZ;
        this.input=input;
        this.resultText=resultText;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(isInteger(input.getText()) || input.getText().equals("")){
            if(e.getSource()==btPlus){
                result+=Integer.parseInt(input.getText());
                resultText.setText(""+result);
                input.setText("");
            }else if(e.getSource()== btMinus){
                result-=Integer.parseInt(input.getText());
                resultText.setText(""+result);
                input.setText("");
            }else if(e.getSource()== btZ){
                result=0;
                resultText.setText("0");
                input.setText("");
            }
        }else{
            input.setText("");
        }
        
        if(result==0){
            btZ.setEnabled(false);
        }else
            btZ.setEnabled(true);

    }
    
    boolean isInteger(String str){
        try{
            int i= Integer.parseInt(str);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
}

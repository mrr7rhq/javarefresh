
import static java.lang.Math.abs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feihua
 */
public class Calculator {
    private Reader reader;
    private int calculations=0;
    public Calculator(){
        reader= new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    private void sum(){
        System.out.print("value1: ");
        int value1=reader.readInteger();
        System.out.print("value2: ");
        int value2= reader.readInteger();
        System.out.format("sum of the values %d\n\n", value1+value2);
        calculations++;
    }
    private void difference(){
        System.out.print("value1: ");
        int value1=reader.readInteger();
        System.out.print("value2: ");
        int value2= reader.readInteger();
        System.out.format("difference of the values %d\n\n", value1-value2);
        calculations++;
    }
    private void product(){
        System.out.print("value1: ");
        int value1=reader.readInteger();
        System.out.print("value2: ");
        int value2= reader.readInteger();
        System.out.format("product of the values %d\n\n", value1*value2);
        calculations++;
    }
    private void statistics(){
        System.out.format("Calculations done %d\n", calculations);
    }
    
}

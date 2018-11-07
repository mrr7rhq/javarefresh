/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author feihua
 */
public class Cow {
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    public Cow(){
        
        name=NAMES[15 + new Random().nextInt(16)];
    }
    
    public Cow(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCapacity(){
        Random r = new Random();
        double randomValue = 15 + (40 - 15) * r.nextDouble();
        return randomValue;
    }
}

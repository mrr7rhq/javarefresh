
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author feihua
 */
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> cases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        cases = new ArrayList<Suitcase>();

    }

    public void addSuitcase(Suitcase suitcase) {
        if ((suitcase.totalWeight() + this.totalCasesWeight()) <= maxWeight) {
            cases.add(suitcase);
        }

    }

    @Override
    public String toString() {
        String result;

        switch (cases.size()) {
            case 0:
                result = "empty (" + "" + totalCasesWeight() + " kg)";
                break;
            case 1:
                result = "" + cases.size() + " suitcase (" + "" + totalCasesWeight() + " kg)";
                break;
            default:
                result = "" + cases.size() + " suitcases (" + "" + totalCasesWeight() + " kg)";
                break;
        }
        return result;
    }
    public void printThings(){
        
        for(Suitcase item:cases){
                item.printThings();
            }
        
        
    }

    public int totalCasesWeight() {
        int weight = 0;
        for (Suitcase caseCell : cases) {
            weight += caseCell.totalWeight();
        }
        return weight;
    }

    
}

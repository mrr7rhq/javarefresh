public class Reformatory {
    private int totalWeight=0;
    public int weight(Person person) {
        // return the weight of the person
        int temp=person.getWeight();
        totalWeight++;
        return temp;
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
     public int totalWeightsMeasured(){
         
        return totalWeight;
     }

}

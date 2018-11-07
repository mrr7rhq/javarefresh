
import java.util.ArrayList;

public class Menu {
    public int a=0;
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
     public void addMeal(String meal){
         if(!meals.contains(meal))
            meals.add(meal);
     }
      public void printMeals(){
          for(String cell:meals)
              System.out.println(cell);
      }
      public void clearMenu(){
          meals.clear();
      }
      

    // add the methods here
}

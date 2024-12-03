

public class Feeder2 {
   
    private int currentFood;
  
    
    public Feeder2(int theCurrentFood) {
      currentFood = theCurrentFood;
    }
  
    
    public void simulateOneDay(int numBirds) {
      double condition = Math.random();
      if (condition < 0.05) { 
          currentFood = 0; 
      } else { 
          int foodPerBird = (int)(Math.random() * 41) + 10;
          int totalFoodConsumed = foodPerBird * numBirds;
          if (totalFoodConsumed >= currentFood) {
              currentFood = 0; 
          } else {
              currentFood -= totalFoodConsumed; 
          }
      }
  }
  
  
   
    public int simulateManyDays(int numBirds, int numDays) {
      int daysWithFood = 0;
      for (int day = 0; day < numDays; day++) {
          simulateOneDay(numBirds);
          if (currentFood > 0) {
              daysWithFood++; 
          }
      }
      return daysWithFood;
  }
  
    
  
  }
  
public class CombinedTable{
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable aTableOne, SingleTable aTableTwo) {
        table1 = aTableOne;
        table2 = aTableTwo;
    }
    public boolean canSeat(int numToBeSeated){
        int totalSeats = table1.getNumSeats() + table2.getNumSeats();
        return numToBeSeated <= totalSeats - 2; 
    }
    public double getDesirability(){
        double averageViewQuality = ((table1.getViewQuality() + table2.getViewQuality()) / 2.0); 
        if (table1.getHeight() == table2.getHeight()){
            return averageViewQuality;
        } else {
            return averageViewQuality - 10;
        }
    }
}
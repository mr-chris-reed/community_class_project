// This is a class that stores data of trees
// that are in risk of falling in the greater
// Brandywine Community
public class RiskyTree
{
    // instance variables
    private boolean isPlantedByOwner;
    private int riskLevel; // 1 through 10
    private String location;
    private static int numOfTrees = 0;

    // zero argument constructor
    public RiskyTree()
    {
      this.isPlantedByOwner = true;
      this.riskLevel = 5;
      this.location = null;
      numOfTrees++;
    }

    // 3 parameter constructor
    public RiskyTree(boolean isPlantedByOwner, int riskLevel, String location)
    {
      this.isPlantedByOwner = isPlantedByOwner;
      this.riskLevel = riskLevel;
      this.location = location;
      numOfTrees++;
    }

    public boolean getIsPlantedByOwner()
    {
      return this.isPlantedByOwner; 
    }

    public void setIsPlantedByOwner(boolean isPlantedByOwner)
    {
      this.isPlantedByOwner = isPlantedByOwner;
    }
  
}
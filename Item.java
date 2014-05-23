/**
 * An item contained in a room
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class Item
{
    private String description;
    private double weight;
    private String id;
    private static int idSiguiente = 1; 
    private boolean canBeTaken;
    private boolean edible;
    private float increaseCapacity;
    
    /**
     * Constructor for objects of class Item
     * 
     * @param description The item's description
     * @param weight The item's weight
     */
    public Item(String description, double weight, boolean canBeTaken, boolean edible, float increaseCapacity)
    {
        this.id = "" + idSiguiente;
        this.idSiguiente++;

        this.description = description;
        this.weight = weight;
        this.canBeTaken = canBeTaken;
        this.edible = edible;
        this.increaseCapacity = increaseCapacity;
    }

    /**
     * Get the long description of item
     * 
     * @return     The long description of item
     */
    public String getLongDescription()
    {
        return "ID " + id + ": " + description + " (" + weight + " kg.); " + isEdible();
    }

    
    private String isEdible(){
        String isEdibleObject = null;

        if(edible){
            isEdibleObject = "Este objeto es comestible.";
        }else{
            isEdibleObject = "Este objeto no es comestible.";
        }
        return isEdibleObject;
    }

    /**
     * Devuelve el id del objeto
     * 
     * @return el id del objeto
     */
    public String getId()
    {
        return id;
    }

    /**
     * Get the item's weight
     * 
     * @return weight the item's weight in kg
     */
    public double getWeight()  
    {
        return weight;
    }  

    /**
     * Return if the item can be taken
     * 
     * @return true if the item can be taken, false otherwise
     */
    public boolean canBeTaken() {
        return canBeTaken;
    }  
}


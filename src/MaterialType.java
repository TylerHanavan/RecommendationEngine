
public class MaterialType {

	private int id;
	
	private String name;
	
	public MaterialType(int id, String name) {
		
		this.id = id;
		
		this.name = name;
		
	}
	
	/**
	 * Get the Id for this MaterialType
	 * @return The Id
	 */
	public int getId() {
		
		return this.id;
		
	}
	
	/**
	 * Get the name for this MaterialType
	 * @return The name
	 */
	public String getName() {
		
		return this.name;
		
	}
	
	/**
	 * Static method to see if two MaterialTypes are equal
	 * @param type1 The first MaterialType
	 * @param type2 The second MaterialType
	 * @return true if they are equal
	 */
	public static boolean compare(MaterialType type1, MaterialType type2) {
		
		return type1.getId() == type2.getId();
		
	}
	
}

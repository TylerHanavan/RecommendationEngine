
public class MaterialType {

	private int id;
	
	private String name;
	
	public MaterialType(int id, String name) {
		
		this.id = id;
		
		this.name = name;
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public static boolean compare(MaterialType type1, MaterialType type2) {
		
		return type1.getId() == type2.getId();
		
	}
	
}

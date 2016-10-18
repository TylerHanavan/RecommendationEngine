
public class Material {

	private MaterialType type;
	
	private int views;
	private int daysAgo;
	
	public Material(Core core, MaterialType type, int views, int daysAgo) {
		
		this.type = type;
		
		this.views = views;
		
		this.daysAgo = daysAgo;
		
		core.getResult(this);
		
	}
	
	public Material(Core core, MaterialType type, int daysAgo) {
		this(core, type, 1, daysAgo);
	}
	
	/**
	 * Get the MaterialType for this Material
	 * @return The MaterialType
	 */
	public MaterialType getMaterialType() {
		
		return this.type;
		
	}
	
	/**
	 * Get the amount of views for this material
	 * @return
	 */
	public int getViews() {
		
		return this.views;
		
	}
	
	/**
	 * Get the amount of days since this material was collected
	 */
	public int getDaysAgo() {
		
		return this.daysAgo;
		
	}
	
	/**
	 * Calculate the amount of point this material is worth
	 * @return
	 */
	public double getPoints() {
		
		return (double) this.views / (double) this.daysAgo;
		
	}
	
}

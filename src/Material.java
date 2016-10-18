
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
	
	public MaterialType getMaterialType() {
		
		return this.type;
		
	}
	
	public int getViews() {
		
		return this.views;
		
	}
	
	public int getDaysAgo() {
		
		return this.daysAgo;
		
	}
	
	public double getPoints() {
		
		return (double) this.views / (double) this.daysAgo;
		
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class Result {
	
	private MaterialType type;

	private List<Material> materials;
	
	public Result(MaterialType type) {
		this.type = type;
		this.materials = new ArrayList<Material>();
	}
	
	public void addMaterial(Material material) {
		
		this.materials.add(material);
		
	}
	
	public void printResults() {
		
		double results[] = new double[this.materials.size()];
		
		int c = -1;
		
		for(Material material : this.materials) {
			
			results[++c] = material.getPoints();
			
		}
		
		double d = 0.0D;
		
		for(double d1 : results) {
			
			d += d1;
			
		}
		
		//d /= ((double) results.length);
		
		System.out.println(this.getMaterialType().getName() + " is " + d + " points.");
		
	}
	
	public MaterialType getMaterialType() {
		
		return this.type;
		
	}
	
}

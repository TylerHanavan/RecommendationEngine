import java.util.ArrayList;
import java.util.List;

public class Result {
	
	/* The MaterialType that this Result will process */
	private MaterialType type;

	/* The list of Materials this Result will process */
	private List<Material> materials;
	
	public Result(MaterialType type) {
		this.type = type;
		this.materials = new ArrayList<Material>();
	}
	
	/**
	 * Add a Material to be processed
	 * @param material The Material to add
	 */
	public void addMaterial(Material material) {
		
		this.materials.add(material);
		
	}
	
	/**
	 * Aggregate and return sum of points of all Materials
	 * @return
	 */
	public double getPoints() {
		
		double results[] = new double[this.materials.size()];
		
		/* A counter for our loop */
		int c = -1;
		
		/* Loop through all our Materials */
		for(Material material : this.materials) {
			
			results[++c] = material.getPoints();
			
		}
		
		double d = 0.0D;
		
		for(double d1 : results)
			d += d1;
		
		return d;
		
	}
	
	/**
	 * Get MaterialType
	 * @return The MaterialType
	 */
	public MaterialType getMaterialType() {
		
		return this.type;
		
	}
	
}

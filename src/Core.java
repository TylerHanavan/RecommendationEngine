import java.util.ArrayList;
import java.util.List;

public class Core {
	
	/*
	 * Add our MaterialTypes
	 */
	static MaterialType JAVA = new MaterialType(1, "Java");
	static MaterialType PYTHON = new MaterialType(2, "Python");
	static MaterialType RUBY = new MaterialType(3, "Ruby");
	static MaterialType PHP = new MaterialType(4, "PHP");
	
	/* A list of our results */
	private List<Result> results = null;

	public Core() {
		
		results = new ArrayList<Result>();
		
		start();
	}
	
	/**
	 * Run the program. This is the second method called when the progrma starts.
	 */
	public void start() {
		
		/* Add our Materials */
		new Material(this, JAVA, 1, 3);
		new Material(this, PYTHON, 3, 2);
		new Material(this, RUBY, 10, 5);
		new Material(this, RUBY, 6, 9);
		new Material(this, PHP, 1, 1);
		new Material(this, PHP, 2, 3);
		
		/* Define a result that will store the most relevant result */
		Result most = null;
		
		/* Loop through all given results */
		for(Result result : this.results) {
			
			/* Print how relevant this result is */
			System.out.println(result.getMaterialType().getName() + " is " + result.getPoints() + " points.");
			
			if(most == null) {
				/* Set this result as most relevant if there is no current most relevant result */
				most = result;
			} else {
				if(most.getPoints() < result.getPoints()) {
					/* Set this result as most relevant if its points are higher than the current most relevant result */
					most = result;
				}
			}
			
		}
		
		/* Print our most relevant result */
		if(most != null)
			System.out.println("\n" + most.getMaterialType().getName() + " is the most relevant result for this user, with " + most.getPoints() + " points.");
		
	}
	
	public Result getResult(Material material) {
		
		for(Result result : this.results) {
			
			if(result.getMaterialType() == material.getMaterialType()) {
				result.addMaterial(material);
				return result;
			}
			
		}
		
		Result result = new Result(material.getMaterialType());
		
		result.addMaterial(material);
		
		this.results.add(result);
		
		return result;
		
	}
	
	public static void main(String args[]) {
		
		new Core();
		
	}
	
}

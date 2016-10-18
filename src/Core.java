import java.util.ArrayList;
import java.util.List;

public class Core {
	
	static MaterialType JAVA = new MaterialType(1, "Java");
	static MaterialType PYTHON = new MaterialType(2, "Python");
	static MaterialType RUBY = new MaterialType(3, "Ruby");
	static MaterialType PHP = new MaterialType(4, "PHP");
	
	private List<Result> results = null;

	public Core() {
		
		results = new ArrayList<Result>();
		
		start();
	}
	
	public void start() {
		
		new Material(this, JAVA, 1, 3);
		new Material(this, PYTHON, 3, 2);
		new Material(this, RUBY, 10, 5);
		new Material(this, RUBY, 10, 5);
		new Material(this, PHP, 1, 1);
		new Material(this, PHP, 2, 3);
		
		for(Result result : this.results) {
			
			result.printResults();
			
		}
		
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

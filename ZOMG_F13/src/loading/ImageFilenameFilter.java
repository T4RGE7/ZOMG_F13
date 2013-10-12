package loading;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class ImageFilenameFilter implements FilenameFilter {
	
	public String[] patterns;
	public final String LIST = 
			"*.png," +
			"*.gif," +
			"*.jpg," +
			"*.jpeg";
	
	public ImageFilenameFilter() {
		this.patterns = null;
		this.populatePatterns();
	}
	
	private void populatePatterns() {
		this.patterns = LIST.split(",");
	}

	@Override
	public boolean accept(File dir, String name) {
		for(String toMatch : this.patterns) {
			if(name.matches(toMatch)) {
				return true;
			}
		}
		return false;
	}
	
}

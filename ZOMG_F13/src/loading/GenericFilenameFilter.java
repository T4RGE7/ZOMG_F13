package loading;

import java.io.File;
import java.io.FilenameFilter;

public class GenericFilenameFilter implements FilenameFilter {

	private String[] patterns;

	public GenericFilenameFilter(String patterns) {
		this.patterns = new String[] { patterns };
	}

	public GenericFilenameFilter(String[] patterns) {
		this.patterns = patterns;
	}

	@Override
	public boolean accept(File dir, String name) {
		for (String toMatch : this.patterns) {
			if (name.matches(toMatch)) {
				return true;
			}
		}
		return false;
	}
}

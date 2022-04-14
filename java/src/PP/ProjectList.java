package PP;

import java.util.ArrayList;

public class ProjectList {
	
	 ProjectList p1 = new ProjectList();

	
	public static void main(String [] args) {
		ArrayList<Integer> projectList = new ArrayList<Integer>();
		projectList.add(231);
		
		
		projectList.add(324);
		projectList.set(1 ,234);
		projectList.size();
		projectList.add(555);
		for (int i = 0; i < projectList.size(); i++) {
			System.out.println(projectList.get(i));
		}
	
		System.out.println(projectList);
	}
	

}

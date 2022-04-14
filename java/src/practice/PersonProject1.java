package practice;

public class PersonProject1 {
	
	

	public static void main(String args[]) {
		
		Person person1 = new Person();
		
	    
		person1.setName("alisher");
	    person1.setphoneNumber("+998911931333");
		
		Project p1 = new Project();
		p1.setprojectId(1);
		p1.setprojectName("Cafe");
		
		person1.projects[0]=p1;
		
		Project p2 = new Project();
		p2.setprojectId(2);
		p2.setprojectName("Taken");
		person1.projects[1]=p2;
		for (int i = 0; i < person1.projects.length; i++) {
			System.out.println(person1.getName());
			System.out.println(person1.project1[i], getprojectsName);
		}
		project1 = person1.projects[0];
		project1.getPN();
		
		
	}

}

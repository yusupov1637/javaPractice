package practice;

public class PersonProject {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Alisher");

		person.setPhoneNumber("+998987655555");
		Project p1 = new Project();

		p1.setprojectId("1");

		p1.setprojectId("Cafe");

		person.projects[0] = p1;

		Project p2 = new Project();

		p2.setprojectId("2");

		p2.setprojectId("Magazin");

		person.projects[1] = p2;
		for (int i = 0; i < person.projects.length; i++) {
			System.out.println(person.getName());
			System.out.println(person.projects[i].getProjectName());
		}

	}

}

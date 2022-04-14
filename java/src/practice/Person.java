package practice;

public class Person {

	private String name;
	private String surname;
	private String jobPosition;
	private String phoneNumber;
	private String bankCard;
	private String projectsName[] = { "Cafe", "Magazin" };
	private String age;
	private String adress;
	Project1[] projects = new Project1[2];

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String[] getProjectsName() {
		return projectsName;
	}

	public void setProjectsName(String[] projectsName) {
		this.projectsName = projectsName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Project1[] getProjects() {
		return projects;
	}

	public void setProjects(Project1[] projects) {
		this.projects = projects;
	}

}

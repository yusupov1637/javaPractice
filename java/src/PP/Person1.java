package PP;


public class Person1 {
	
	String name;
	String surname;
	String jobPosition;
	String phoneNumber;
	String bankCard;
	String projectsName [] = {"Cafe" , "magazin"};
	String age;
	String adress;
    Project[] projects = new Project [2];
    
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public String getSurname() {
    	return this.surname;
    }
    public void setSurname(String surname) {
    	this.surname = surname;
    }
    public String getJobPosition() {
    	return this.jobPosition;
    }
    public void setJobPosition(String jobPosition) {
		this.jobPosition =jobPosition;
	}
    public String getPhoneNumber() {
    	return this.phoneNumber;
    }
    public void setphoneNumber(String phoneNumber) {
    	this.phoneNumber =phoneNumber;
    }
    public String getBankCard() {
    	return this.bankCard;
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
    	return this.age;
    }
    public void setAge(String age) {
    	this.age = age;
    }
    
    
}

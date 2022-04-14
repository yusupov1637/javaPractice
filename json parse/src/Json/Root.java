package Json;

import java.util.List;

public class Root {
	
	private String name;
	
	private List<People> people;
	
	public String getName() {
   return name;
	}
	public List<People> getPeople(){
		return people;

	}
	public void setName (String name) {
		this.name=name;

	}
	public void setPeople(List<People> people) {
		this.people=people;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Root{"+
				"name='"+name+'\''+
				",people="+people+
				'}';
	}


}

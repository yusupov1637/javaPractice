package strings1;

public class StringB {

	public static void main(String[] args) {
		
		StringBuilder sb =new StringBuilder();
		
		sb.append("0123456789");
		sb.delete(3, 5);
		
		System.out.println(sb);
		
		sb.replace(3, 5, "34");
		
		System.out.println(sb);
		
		sb.substring(2, 4);
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(" ");
        sb.append("aaaaa")
        .append("as")
        .append(2);
        System.out.println(sb);
        sb.insert(0, "1");
        System.out.println(sb);
        
	}

}

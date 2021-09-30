
public class App {

	public static void main(String[] args) {
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		/////// Formatting //////////////////////
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a new line");
		System.out.println("More text.");
	}

}

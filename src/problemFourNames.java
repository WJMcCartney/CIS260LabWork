public class problemFourNames {
	public static void main(String[] args) {
		String paragraph = ("Once there was a woman name:angelina: and a man name:tony: and their friend name:jane:");
		int secondColon = 0;
		for (int i=0; i < 3; i+=1) {
			int firstColon = paragraph.indexOf(":", secondColon+1);
			secondColon = paragraph.indexOf(":", firstColon+1);
			String name = paragraph.substring(firstColon+1, secondColon);
			System.out.println(name);
		}
	}
}
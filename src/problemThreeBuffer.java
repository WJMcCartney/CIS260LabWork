
public class problemThreeBuffer {
	public static void main(String[] args) {
		StringBuffer markSpeaks = new StringBuffer ("Mark speaks all time");
		boolean answer = true;
		markSpeaks.insert(10, answer);
		System.out.print(markSpeaks);
	}
}

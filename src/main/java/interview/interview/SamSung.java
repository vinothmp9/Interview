package interview.interview;

public class SamSung extends Phone  {
	@Override
		public void os() {
			// TODO Auto-generated method stub
			System.out.println("samsung os");
		}
public static void main(String[] args) {
	SamSung s=new SamSung();
	s.call();
	s.os();
	s.game();
}
}

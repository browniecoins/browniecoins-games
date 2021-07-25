package athena.play;

public class SimpleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGame tmp = new SimpleGame();
		for(int j=0;j<100;j++) {
			System.out.println(tmp.isWinner());
		}
	}
	public boolean isWinner() {
		
		int min = 2;
		int max = 3;
		
		int hmin = 2;
		int hmax = 3;
		
		int player = min + (int)(Math.random() * ((max - min) + 1)); 
		int house = hmin + (int)(Math.random() * ((hmax - hmin) + 1)); 
		System.out.print(player);
		System.out.print(house);
		if(house==player)return true;
		return false;
	}
}

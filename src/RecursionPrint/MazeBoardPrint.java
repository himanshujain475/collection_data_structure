package RecursionPrint;

public class MazeBoardPrint {
	
	static void printMazeBoard(int cr,int cc,int er, int ec, String abc) {
		if(cr == er && cc==ec) {
			System.out.println(abc);
			return;
		}
		if(cr>er) {
			return;
		}
		if(cc>ec) {
			return;
		}
		printMazeBoard(cr+1,cc,er,ec,abc+"H");

		printMazeBoard(cr,cc+1,er,ec,abc+"V");
	}
	
	public static void main(String[] args) {
		
		printMazeBoard(0,0,2,2,"");
		
	}

}

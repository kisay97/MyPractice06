package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao{
	private static final List<Board> list = new ArrayList<Board>();
	
	public BoardDao(){
		Board boards[] = new Board[3];
		for (int i = 0; i < boards.length; i++) {
			boards[i] = new Board();
			boards[i].setTitle("제목" + (i+1));
			boards[i].setContent("내용" + (i+1));
			list.add(boards[i]);
		}		
	}
	
	public static List<Board> getBoardList(){
		return list;
	}
}

package application.Service;

import java.util.List;

import application.DAO.BoardDAO;
import application.DTO.Board;

public class BoardServiceImpl implements BoardService {

	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<Board> list() {
		List<Board> boardList = boardDAO.list();
		return boardList;
	}

	@Override
	public Board select(int no) {
		Board board = boardDAO.select(no);
		return board;
	}

	@Override
	public int insert(Board board) {
		int result = boardDAO.insert(board);
		if( result > 0 ) System.out.println("insert data succeeded");
		else System.err.println("insert data failed");
		return result;
	}

	@Override
	public int update(Board board) {
		int result = boardDAO.update(board);
		if( result > 0 ) System.out.println("update data succeeded");
		else System.err.println("update data failed");
		return result;
	}

	@Override
	public int delete(int no) {
		int result = boardDAO.delete(no);
		if( result > 0 ) System.out.println("delete data succeeded");
		else System.err.println("delete data failed");
		return result;
	}

}







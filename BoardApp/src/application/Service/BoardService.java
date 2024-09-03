package application.Service;

import java.util.List;

import application.DTO.Board;

public interface BoardService {

	List<Board> list();
	Board select(int no);
	int insert(Board board);
	int update(Board board);
	int delete(int no);
	
}

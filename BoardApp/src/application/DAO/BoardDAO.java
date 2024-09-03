package application.DAO;

import java.util.ArrayList;
import java.util.List;

import application.DTO.Board;

public class BoardDAO extends JDBC {
	
	public List<Board> list() {
		List<Board> boardList = new ArrayList<Board>();
		
		String sql = " SELECT *"
				   + " FROM board ";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while( rs.next() ) {
				Board board = new Board();
				board.setNo( rs.getInt("no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
				board.setView( rs.getInt("view") );
				boardList.add(board);
			}
			
		} catch (Exception e) {
			System.err.println("list failed");
		}
		return boardList;
	}
	
	public Board select(int no) {
		Board board = new Board();
		String sql = " SELECT * "
				   + " FROM board "
				   + " WHERE no = ? ";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no);
			rs = psmt.executeQuery();
			
			if( rs.next() ) {
				board.setNo( rs.getInt("no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setRegDate( rs.getTimestamp("reg_date") );
				board.setUpdDate( rs.getTimestamp("upd_date") );
				board.setView( rs.getInt("view") );
			}
		} catch (Exception e) {
			System.err.println("select failed");
		}
		return board;
	}
	
	
	public int insert(Board board) {
		int result = 0;
		
		String sql = " INSERT INTO board( title, writer, content )"
				   + " VALUES ( ?, ?, ? ) ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getTitle() );
			psmt.setString(2, board.getWriter() );
			psmt.setString(3, board.getContent() );
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("create faild");
		}
		return result;
	}
	
	public int update(Board board) {
		int result = 0;
		
		String sql = " UPDATE board"
				   + "    SET title = ? "
				   + "		 ,writer = ?"
				   + "		 ,content = ?"
				   + "		 ,upd_date = now() "
				   + " WHERE no = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getTitle() );
			psmt.setString(2, board.getWriter() );
			psmt.setString(3, board.getContent() );
			psmt.setInt(4, board.getNo() );
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("update faild");
		}
		return result;
	}
	
	public int delete(int no) {
		int result = 0;
		
		String sql = " DELETE FROM board"
				   + " WHERE no = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no );
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("delete faild");
		}
		return result;
	}
	
	
	public int view(int no) {
		int result = 0;
		
		String sql = " UPDATE board"
				   + "    SET view = view + 1 "
				   + "		 ,upd_date = now() "
				   + " WHERE no = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no );
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("update view faild");
		}
		return result;
	}
	
	

}











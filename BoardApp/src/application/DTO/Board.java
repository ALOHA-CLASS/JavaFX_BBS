package application.DTO;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Board {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	private int view;
	
	
	public Board() {
		
	}

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = new Date();
		this.updDate = new Date();
		this.view = 0;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}
	
	public String getDate() {
		Date regDate = getRegDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String date = sdf.format(regDate);
		return date;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + ", view=" + view + "]";
	}
	
}







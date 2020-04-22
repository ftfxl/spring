package cn.edu.scujcc.model;

import java.time.LocalDateTime;



public class Comment {
	
	private String author;
		
	
	private String content;
	
	
	private LocalDateTime dt;
	
	
	private int star;
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getDt() {
		return dt;
	}
	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
}

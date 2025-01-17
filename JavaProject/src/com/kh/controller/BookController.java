package com.kh.controller;

import com.kh.vo.Book;

// controller의 역할 : vo객체를 이용해서 기능을 수행해주는 역할
public class BookController {
	private Book[] bookList = new Book[100];

	public BookController() {
		super();
		bookList[0] = new Book("아프니까 청춘이다.", "조석현", "인문", 25000);
		bookList[1] = new Book("집에 가고싶다.", "너두", "기타", 27000);
		bookList[2] = new Book("아낌없이 주는 나무.", "아이언", "인문", 2000);
		bookList[3] = new Book("역삼에서 살아남기.", "김요담", "의료", 29000);
	}
	
	public void insertBook(Book bk) {
		// bookList에 bk저장
		// 가장 앞쪽에 비어있는 공간() = null 을 찾아서 bk 저장
		
		for(int i=0; i<bookList.length; i++ ) {
			if(bookList[i] == null) {
				bookList[i] = bk;
				break;
			}
		}
	}
	
	public Book[] getBookList() {
		return this.bookList.clone();
	}
	
	//keyword가 제목에 포함되어있는 도서 목록 반환
	public Book[] searchBook(String keyword) {
		Book[] searchBook = new Book[this.bookList.length];
		int index = 0;
		
		for(int i=0; i<this.bookList.length; i++) {
			if(bookList[i] == null ) {
				break;
			} else if(bookList[i].getTitle().contains(keyword)) { //contains 포함
				searchBook[index++] = bookList[i];
				//index++;
			}
		}
	
		return searchBook;
	}
	
	//해당 인덱스의 도서가 있으면 true 없으면 false
	public boolean isBook(int index) {
		//index 배열의 길이보다 작아야 한다.0~99사이
		// this.bookList[index] != null
		
		if(index >= 0 && index <= bookList.length && bookList[index] != null) {
			return true;
		} else {
			return false;
		}
	
	}
	
	public void updateBook(int index, Book b) { //해당 인덱스에 있는거를 바꾼다.
		this.bookList[index] = b;
	}
	
	public Book[] deleteBook(String delete) {
		Book[] deleteBook = new Book[this.bookList.length];
		
		for(int i=0; i<this.bookList.length; i++) {
			if(bookList[i].getTitle().equals(delete)) {
				bookList[i] = null;
				return bookList;
			} 
		}
		return null;
	}
}

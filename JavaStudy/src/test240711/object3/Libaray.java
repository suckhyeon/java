package test240711.object3;

import java.util.Scanner;

public class Libaray {
	private Scanner sc = new Scanner(System.in);
	private Book[] bArr = new Book[10];

	public void menu() {
		int menu = 0;
	
		while(menu != 9) {
			System.out.println("===도서관리 프로그램===");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서검색");
			System.out.println("4. 도서삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				this.addBook();
				break;
			case 2 :
				this.printBookList();
				break;
			case 3 :
				this.searchBook();
				break;
			case 4 :
				this.printBookList();
				this.deletBook();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하였습니다.");
					}	
				}
			}	
	public void addBook() {

		System.out.print("제목 : ");
		String name = sc.nextLine();
		
		System.out.print("장르 : ");
		String jang = sc.next();
		
		System.out.print("저자 : ");
		String str = sc.next();
		
		System.out.print("책번호 : ");
		int num = sc.nextInt();
		
		//Book tmpBook = new Book(name, jang, str, num);
		
		for(int i=0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(name, jang, str, num);
				System.out.println("책을 등록하였습니다.");
				System.out.println(bArr[i].toString());
				break;
			} else if(i == (bArr.length-1)) {  //마지막 인덱스까지 전부 확인한 후
				System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
			}
		}
	}
	
	public void printBookList() {
		System.out.println("=====등록 도서목록=====");
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				break;
			}
			System.out.println(bArr[i].toString());
		}
	}

	public void searchBook() {
		System.out.println("=====도서 검색======");
		System.out.print("검색할 책 이름을 입력 : ");
		String target = sc.next();
		
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] != null) { //null을 발견하면 뒤에 데이터는 null이므로 반복문 탈출
				break;
			} else if(target.equals(bArr[i].getName())) { // 동일한 제목 발견시 출력후 반복문 탈출
			System.out.println(bArr[i].toString());
			break;
			}
		}
	}
	
	public void deletBook() {
		for(int i=0; i<bArr.length; i++) {
			System.out.println("삭제할 도서의 번호 입력 : ");
			int n = sc.nextInt();
			if(bArr[i] == null) {
				System.out.println("삭제할 도서의 번호를 찾지 못하였습니다.");
				break;
			} else if(n == bArr[i].getNum()) {
				System.out.println("삭제 데이터 : " + bArr[i].toString());
				//삭제할 위치부터 마지막위치까지 모든 값을 한칸씩 앞으로 당김
				for(int j=i; j < bArr.length -1; j++) {
					bArr[j] = bArr[j+1];
				}
				//마지막 값에 null 대입
				bArr[bArr.length -1] = null;
			} 
		}
	}







}


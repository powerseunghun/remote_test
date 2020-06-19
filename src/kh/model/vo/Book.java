package kh.model.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Book implements java.io.Serializable {
	private String title;
	private int price;
	
	public Book() {}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	public void fileSave(String fileName) {
		File file = new File(fileName);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			Book Sample = new Book("자바를 정복하자", 35000);
			oos.writeObject(Sample);
//			oos.writeObject(this);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바를 잡아라", 30000));
		bookList.add(new Book("오라클 정복", 35000));
		bookList.add(new Book("웹표준 2.0", 27500));
		bookList.add(new Book("자바 Servlet/JSP", 28000));
		bookList.add(new Book("ajax 사용법", 15000));
		
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	public void fileLoad(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book read = (Book) ois.readObject();
			System.out.println(read.getTitle());
			System.out.println(read.getPrice());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Book b = new Book();
//		b.fileSave("Book.dat");
//		b.fileLoad("book.dat");
		
		b.fileSave();
		
	}
}

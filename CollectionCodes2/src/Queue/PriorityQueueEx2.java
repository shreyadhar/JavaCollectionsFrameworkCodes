package Queue;
import java.util.*;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Book> pqbook= new PriorityQueue<Book>();
		Book b1= new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2= new Book(233,"Operating System","Galvin","Wiley",6);
		Book b3= new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b4= new Book(421, "DBMS","Korth", "MGH",7);
		
		pqbook.add(b1);

		pqbook.add(b2);
		pqbook.add(b3);
		pqbook.add(b4);
		
		System.out.println("Traversing through the queue: ");
		for(Book b: pqbook)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		pqbook.remove();
		System.out.println("Traversing through the queue after calling remove method: ");
		for(Book b: pqbook)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}

class Book implements Comparable<Book>
{
		int id;  
		String name,author,publisher;  
		int quantity;  
		public Book(int id, String name, String author, String publisher, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
	}

	
public int compareTo(Book b)
{
	if(id>b.id)
		return 1;
	
	else if(id<b.id)
		return -1;
	else return 0;
}
}

package IteratorPatternQuiita;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(4);
		
		//要素を入れる
        bookShelf.appendBook(new Book("Git Hub"));
        bookShelf.appendBook(new Book("Qiita"));
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Iterator pattern"));
        
        //イテレータを使う
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
	}

}

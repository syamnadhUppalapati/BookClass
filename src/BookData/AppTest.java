package BookData;

public class AppTest {
	public static void main(String[] args) {
        Author Aau=new Author("Rohit","rohitgunjal547@gmail.com",'M');
        BookModel ob= new BookModel("Mahabharat",Aau,1200);
        System.out.println(ob);
    }
}

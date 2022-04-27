package BookData;

public class BookModel
{	
	String Name;
    Author author;
    double price;
    int qty;
    BookModel(String Name, Author author,double price ){
        this.Name=Name;
        this.price=price;
        this.author=author;
    }
    BookModel(String Name,String Author,double price ,int qty){
        this.Name=Name;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return Name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Books[" +
                "Name='" + Name + '\'' +
                ", obj=" + author.toString() +
                ", price=" + price+" rs"+
                ", qty=" + qty +
                ']';
    }
    
}
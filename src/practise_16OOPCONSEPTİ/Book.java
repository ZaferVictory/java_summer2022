package practise_16OOPCONSEPTİ;

public class Book {
    public String name;
    public int pageNumber;
    public String auther;
    public String publisher;
    public  double price;

    public Book(String name, int pageNumber, String auther, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.auther = auther;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book1=new Book();
        book1.name="Şeker Portakalı";
        book1.auther="Jose Mauro de Vasconcelos";
        book1.pageNumber=180;
        book1.price=25;
        book1.publisher="Can Yayınları";

        Book book2=new Book("kiraz mevsimi", 145,"mirac","abc yayınları",75);
    }
}

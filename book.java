class Books{
    String title ;
    String author;
    int price;
    void displayBook(){
        System.out.println("title is "+title);
        System.out.println("author is "+author);
        System.out.println("price is "+price);
    }
}

public class book {
    public static void main(String[] args){
        Books b1 = new Books();
        b1.title = "java ";
        b1.author = "ayush";
        b1.price = 500;
        b1.displayBook();

    }
}

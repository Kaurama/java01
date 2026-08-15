package day22;

public class Books {
    String title ;
    String author;
    Books() {
        title = "buku bercerita";
        author= "unknown";
    }
    Books(String judul, String author){
        title = judul;
        this.author = author;
    }
}
 class main{
    public static void main(String[] args) {
        Books s1 = new Books();
        Books s2 = new Books(
                " unknown",
                "Ronald"
        );
        System.out.println(s1.title);
        System.out.println(s2.title);
    }
}



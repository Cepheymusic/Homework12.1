public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Иван", "Тургенев");
        Book idiot = new Book("Идиот", author1,1868);
        Book mumu = new Book("Му-му", author2, 1852);
        mumu.setAge(1860);
        System.out.println("mumu = " + mumu + author1);
        System.out.println("idiot = " + idiot + author2);
    }
}




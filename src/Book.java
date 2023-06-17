public class Book {
    private String name;
    private Author author;
    private int age;
    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
        }
    public String getName() {
        return this.name;
        }
    public Author getAuthor() {
        return this.author;
        }
    public int getAge() {
        return this.age;
        }
    public void setAge(int age) {

        this.age = age;
        }
    public String toString() {
        return "Название книги: " + this.name + ", год: " + this.age;
    }
    @Override
    public boolean equals(Object books) {
        if (this.getClass() != books.getClass()) {
            return false;
        }
        Book mumu = (Book) books;
        return name.equals(mumu.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}


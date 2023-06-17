public class Author {
    private String name;
    private String lastName;
    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return "Автор: " + this.name + " " + this.lastName;
    }
    @Override
    public boolean equals(Object authors) {
        if (this.getClass() != authors.getClass()) {
            return false;
        }
        Author author2 = (Author) authors;
        return name.equals(author2.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}

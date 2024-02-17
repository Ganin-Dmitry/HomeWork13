public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return this.name + this.surname;
    }
    @Override
    public int hashCode () {
        return java.util.Objects.hash(name);
    }

    public boolean equals(Author author2) {
        if (this.getClass() != author2.getClass()) {
            return false;
        }
        return this.getName().equals(author2.getName()) && this.getSurname().equals(author2.getSurname());
    }
}
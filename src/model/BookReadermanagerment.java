package model;

public class BookReadermanagerment {
    private Book books;
    private Reader readers;
    private int numberOfBorrow;//số lượng mượn
    private String State;// Trạng thái khi mượn
    private int total;//toàn bộ

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public Reader getReaders() {
        return readers;
    }

    public void setReaders(Reader readers) {
        this.readers = readers;
    }

    public int getNumberOfBorrow() {
        return numberOfBorrow;
    }

    public void setNumberOfBorrow(int numberOfBorrow) {
        this.numberOfBorrow = numberOfBorrow;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public BookReadermanagerment(Book books, Reader readers, int numberOfBorrow, String state, int total) {
        this.books = books;
        this.readers = readers;
        this.numberOfBorrow = numberOfBorrow;
        this.State = state;
        this.total = total;
    }

    @Override
    public String toString() {
        return "BookReadermanagerment{" +
                "books=" + books +
                ", readers=" + readers +
                ", numberOfBorrow=" + numberOfBorrow +
                ", State='" + State + '\'' +
                ", total=" + total +
                '}';
    }
}

package com.bilgeadam.lesson014;

public class AdminService {

    public void createBook() {
        String bookName = InputUtil.getStringValue("Kitap İsmini Girin");
        String authorName = InputUtil.getStringValue("Yazar İsmi");
        String publisher = InputUtil.getStringValue("Yayın Evi");
        double price = InputUtil.getDoubleValue("Kitap Ücreti");
        String categoryName = InputUtil.getStringValue("Category ismi");

        Category category = new Category(categoryName);

        Book book = new Book(bookName, authorName, publisher, price, category);

        DataBase.library.getBookList().add(book);
        System.out.println("Kitap Eklendi");
    }

    public void findAllBooks() {
        for (Book book : DataBase.library.getBookList()) {
            if (book.getStatus() == Status.ACTIVE) {
                System.out.println(book);
            }
        }
    }

    public void findBookByAuthorName() {
        String authorName = InputUtil.getStringValue("Yazar İsmi");

        for (Book book : DataBase.library.getBookList()) {
            if (book.getAuthorName().equalsIgnoreCase(authorName)) {
                System.out.println(book);
            }
        }
    }

    public void deleteById() {
        findAllBooks();
        String id = InputUtil.getStringValue("Silmek için id ");

        Integer value = findIndexByBook(id);
        if (value != null) {
            DataBase.library.getBookList().remove((int) value);
        }

    }

    private Integer findIndexByBook(String id) {
        for (int i = 0; i < DataBase.library.getBookList().size(); i++) {
            if (DataBase.library.getBookList().get(i).getId().equals(id)) {
                return i;
            }
        }
        System.out.println("Kitap bulunamadı");
        return null;
    }

    public void changeStatusToDeleted() {
        findAllBooks();
        String id = InputUtil.getStringValue("Silmek için id ");

        Book book = findById(id);
        if (book != null) {
            book.setStatus(Status.DELETED);
        }
    }

    private Book findById(String id) {
        for (Book book : DataBase.library.getBookList()) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        System.out.println("Kitap bulunamadı");
        return null;
    }

    public void discountForBook() {
        findAllBooks();
        String id = InputUtil.getStringValue("Hangi kitaba indirim yapcaksınız");
        double discountPercantage = InputUtil.getDoubleValue("% lik olarak");

        Book book = findById(id);
        if (book != null) {
            book.setPrice(((100 - discountPercantage) * book.getPrice()) / 100);
        }


    }
}


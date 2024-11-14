package com.group.library.dto.book.request;

public class BookLoanRequest {
    private String userName;
    private String bookName;

    public BookLoanRequest() {
    }

    public String getUserName() {
        return this.userName;
    }

    public String getBookName() {
        return this.bookName;
    }
}

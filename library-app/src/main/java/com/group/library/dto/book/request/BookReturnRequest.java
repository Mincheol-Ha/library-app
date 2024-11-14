package com.group.library.dto.book.request;

public class BookReturnRequest {
    private String userName;
    private String bookName;

    public BookReturnRequest() {
    }

    public String getUserName() {
        return this.userName;
    }

    public String getBookName() {
        return this.bookName;
    }
}
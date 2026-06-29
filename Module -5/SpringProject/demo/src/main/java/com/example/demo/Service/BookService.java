package com.example.demo.Service;

import com.example.demo.Repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void displayService() {
        System.out.println("Book Service is Working");
        repository.displayRepository();
    }
}
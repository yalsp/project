package com.peocess.demo;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name ="book")
public class BookEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String bookname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}





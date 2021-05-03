package com.peocess.dao;

import com.peocess.demo.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {





    Optional<BookEntity> findById(Long id);

    BookEntity findTopByBookname(String bookname);


}

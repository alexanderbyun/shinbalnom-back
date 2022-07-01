package com.shinbalnom;

import com.shinbalnom.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends CrudRepository<Sneaker, Integer> {

}

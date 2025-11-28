package com.example.cashcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.annotation.Id;

interface CashCardRepository extends CrudRepository<CashCard, Long> {
}
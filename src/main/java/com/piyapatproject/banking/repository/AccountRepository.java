package com.piyapatproject.banking.repository;

import com.piyapatproject.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {


}

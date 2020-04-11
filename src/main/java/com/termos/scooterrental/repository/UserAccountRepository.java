package com.termos.scooterrental.repository;

import com.termos.scooterrental.model.UserAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
    List<UserAccount> findByOwnerEmail(String ownerEmail);
}

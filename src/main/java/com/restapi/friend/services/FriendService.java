package com.restapi.friend.services;

import com.restapi.friend.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {

    Iterable<Friend> findByFirstNameAndLastName(String firstName, String LastName);
    Iterable<Friend> findByFirstName(String firstName);
    Iterable<Friend> findByLastName(String LastName);

}

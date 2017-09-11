package com.cms.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cms.domain.User;
import com.cms.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User, Long> {

  User findByUserName(String userName);

  @Modifying
  @Query(value = "Update User u set u.status = 1 where u.userId = :userId")
  void updateUserStatusByUserId(@Param("userId") long userId);

  @Query(value = "from User u where u.name = :name")
  User getUserbyEmail(@Param("name") String name);

  @Query(value = "from User u where u.name = :name and userId != :userId")
  User getOtherUserbyEmail(@Param("name") String name, @Param("userId") long userId);
  
  @Query(value = "from User u where u.userName = :userName and userId != :userId")
  User getOtherUserbyUserName(@Param("userName") String userName, @Param("userId") long userId);
}

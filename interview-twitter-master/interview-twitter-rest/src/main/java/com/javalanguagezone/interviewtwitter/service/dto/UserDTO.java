package com.javalanguagezone.interviewtwitter.service.dto;

import com.javalanguagezone.interviewtwitter.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
public class UserDTO {
  private Long id;
  private String username;
  private String fullName;
  private Long numOfTweets;
  private Long numOfFollowers;
  private Long numOfFollowingUsers;
  //display user overview on profile page (number of tweets, number of followers, number of users following)

  public UserDTO(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.fullName = user.getFullName();
    this.numOfFollowers = user.getNumberOfFollowers();
    this.numOfFollowingUsers = user.getNumberOfFollowings();
  }
}

package com.ssafy.gumison.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Climbing {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "climbing_id")
  private Long id;

  @Column(nullable = false)
  private String climbingName;

  private String address;

  private String phoneNumber;
  
  private String imgUrl;
}

package com.ssafy.gumison.api.response;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SolutionListItem {
  private Long id;
  private String tier;
  private String climbingName;
  private String level;
  private int cnt;
  private LocalDate date;
}

package com_set;

import lombok.Builder;
import lombok.Data;


//@Getter
//@Setter
//@NoArgsConstructor // 아래꺼랑 같이 못 씀
//@RequiredArgsConstructor // 위에꺼랑 같이 못 씀
//@EqualsAndHashCode
//@ToString

@Data   // @Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @EqualsAndHashCode @ToString
@Builder

public class Member {

   private String id;
   private String name;
   private final String age;
}
package com.narek;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Room {

    private Integer number;

    private Integer floor;

    private String name;

}

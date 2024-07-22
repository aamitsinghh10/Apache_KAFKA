package net.springboot_kafka.java_springboot_kafka.Entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;
}

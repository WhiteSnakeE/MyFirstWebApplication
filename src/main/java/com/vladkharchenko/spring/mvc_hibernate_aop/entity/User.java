package com.vladkharchenko.spring.mvc_hibernate_aop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int id;

    @Column( name = "name")
    private String name;

    @Column( name = "surname")
    private String surname;

    @Column( name = "email")
    private String email;

}

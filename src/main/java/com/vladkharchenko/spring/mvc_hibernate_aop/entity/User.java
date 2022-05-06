package com.vladkharchenko.spring.mvc_hibernate_aop.entity;
import com.vladkharchenko.spring.mvc_hibernate_aop.questions.Questions;
import com.vladkharchenko.spring.mvc_hibernate_aop.validation.CheckEmail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int id;
    @Column( name = "name")
    @Size(max = 14,min = 2,message = "Your name must be more than 1 and less than 15")
//    @Pattern(regexp = "^A-Za-z+$", message = "please use only english symbols")
    private String name;
    @Size(max = 14,min = 2,message = "Your name must be more than 1 and less than 15")
//    @Pattern(regexp = "^A-Za-z+$", message = "please use only english symbols")
    @Column( name = "surname")
    private String surname;
    @CheckEmail()
    @Column( name = "email")
    private String email;
    @Column( name = "result")
    private int result = 0;


}

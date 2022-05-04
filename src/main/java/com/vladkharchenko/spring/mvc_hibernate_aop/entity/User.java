package com.vladkharchenko.spring.mvc_hibernate_aop.entity;
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
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private int id;

    @Column( name = "name")
    @Size(max = 14,min = 2,message = "Your name must be more than 1 and less than 15")
    private String name;

    @Size(max = 14,min = 2,message = "Your name must be more than 1 and less than 15")
    @Column( name = "surname")
    private String surname;

    @CheckEmail()
    @Column( name = "email")
    private String email;

}

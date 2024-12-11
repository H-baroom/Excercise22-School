package com.example.excercise22relation1w8.Model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(25) not null")
    @NotEmpty(message = "name not valid")
    @Size(max = 25)
    private String name;

    @Column(columnDefinition = "int not null")
    @Positive(message = "age not valid")
    @Min(value = 18)
    private Integer age;

    @NotEmpty(message = "email not valid")
    @Email(message = "email not valid")
    @Column(columnDefinition = "varchar(40) not null")
    @Size(max = 40)
    private String email;

    @Column(columnDefinition = "int not null")
    @Positive(message = "salary not valid")
    private Integer salary;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;

}

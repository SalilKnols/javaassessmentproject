package com.knoldus.javastudio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "InternTable")
public class Intern {

    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "Name")
    private String name;

    @Column(name = "email")
    private String email;
}

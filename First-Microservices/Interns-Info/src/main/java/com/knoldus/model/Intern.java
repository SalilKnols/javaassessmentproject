package com.knoldus.model;

import jakarta.persistence.Entity;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Intern {
    private Long internId;
    private String name;
    private String email;
    private String workExperience;
    private String department;
}

package com.knoldus.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(
        name = "Intern_info",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email_address"
        )
)
public class Intern {
    @Id
    @SequenceGenerator(
            name = "intern_sequence",
            sequenceName = "intern_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="intern_sequence"
    )
    private Long internId;
    private String name;
    @Column(
            insertable = true,
            name = "email_address",
            nullable = false
    )
    private String email;
    private String workExperience;
    private String department;
}

package com.knoldus.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Mentor {

    @Id
    @SequenceGenerator(
            name = "mentor_sequence",
            sequenceName = "mentor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="mentor_sequence"
    )
    private Long mentorId;
    private String name;
    private String email;
    private String workExperience;
    private String department;
}

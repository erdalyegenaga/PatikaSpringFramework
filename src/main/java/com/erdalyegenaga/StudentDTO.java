package com.erdalyegenaga;

import lombok.*;

// DATA TRANSFER OBJECT (DTO)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Long studentId;
    private String studentName;
    private String studentSurname;

}

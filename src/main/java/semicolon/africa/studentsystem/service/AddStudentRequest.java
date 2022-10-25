package semicolon.africa.studentsystem.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequest {
    private String firstName;
    private String lastName;
}

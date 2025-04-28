package edu.lab.secureweb.student;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/*
  @author   neyron
  @project   security
  @class  Student
  @version  1.0.0 
  @since 29.03.2025 - 00.09
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student extends AuditMetaData{
    @Id
    private String id;
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student book)) {
            return false;
        }
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

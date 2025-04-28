package edu.lab.secureweb.student;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/*
  @author   neyron
  @project   secureweb
  @class  AuditMetaData
  @version  1.0.0 
  @since 19.04.2025 - 20.04
*/
@NoArgsConstructor
@Data
public class AuditMetaData {

    @CreatedDate
    private LocalDateTime createdDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedBy;

}

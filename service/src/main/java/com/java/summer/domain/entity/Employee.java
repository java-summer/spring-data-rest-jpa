package com.java.summer.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table (name = "employee")
public class Employee {

    @NotNull
    @Id
    @GeneratedValue (generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    @Type (type = "uuid-char")
    @Column (columnDefinition = "VARCHAR(36)", name = "id",nullable=false,
             updatable=false)
    private UUID id;

    @Column (name = "last_modified_user",nullable=false)
    private String lastModifiedUser;

    @Column (name = "last_modified_dtm", columnDefinition = "timestamp",nullable=false)
    private Date lastModifiedDateTime;

    @Version
    private Long version;

    @Column (name = "first_name",nullable=false)
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "sex")
    private String sex;

    @Column (name = "age")
    private Integer age;


    @PrePersist
    protected void onCreate() {
        lastModifiedDateTime = new Date();
        lastModifiedUser = "Admin";
    }

    @PreUpdate
    protected void onUpdate() {
        lastModifiedDateTime = new Date();
    }


}

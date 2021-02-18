package com.demo.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "todo")
public class TodoItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String taskName;

    private boolean done;

    @CreatedDate
    private LocalDateTime createdDate;
}

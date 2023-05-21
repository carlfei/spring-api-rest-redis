package org.example.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    private String id_curso;
    private String password;
    @ManyToOne
    @JoinColumn(name = "tabla_cruce")
    private Curso curso;
}
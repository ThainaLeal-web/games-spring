package application.model;

import java.security.Identity;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistenceColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataformas")
public class plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
}

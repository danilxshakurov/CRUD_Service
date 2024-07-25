package ru.shakur.crudservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shakur.crudservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

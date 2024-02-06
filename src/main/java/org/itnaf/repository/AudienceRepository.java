package org.itnaf.repository;

import org.itnaf.model.Audience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepository extends JpaRepository<Audience, String> {
    Audience findByName(String name);
}

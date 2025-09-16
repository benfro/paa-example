package com.redpill.demo.audithub.persistence.audit.adapters.outbound;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<JPAAuditEntity, Long> {
}

package com.redpill.demo.audithub.persistence.audit.ports.outbound;

import com.redpill.demo.audithub.persistence.audit.adapters.outbound.JPAAuditEntity;

public interface PersistAuditBackend {

    Long persist(JPAAuditEntity template);
}

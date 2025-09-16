package com.redpill.demo.audithub.persistence.audit.ports.inbound;

import com.redpill.demo.audithub.persistence.audit.AuditTemplate;

public interface PersistAudit {

    Long persist(AuditTemplate template);

}

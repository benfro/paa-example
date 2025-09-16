package com.redpill.demo.audithub.persistence.audit.adapters.outbound;

import com.redpill.demo.audithub.persistence.audit.AuditTemplate;
import com.redpill.demo.audithub.persistence.audit.AuditedAction;
import com.redpill.demo.audithub.persistence.audit.DBAudit;
import com.redpill.demo.audithub.persistence.audit.ports.outbound.FetchAllBackend;
import com.redpill.demo.audithub.persistence.audit.ports.outbound.PersistAuditBackend;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BackendAdapter implements PersistAuditBackend, FetchAllBackend {

    private final AuditRepository auditRepository;

    @Override
    public List<JPAAuditEntity> fetchAll() {
        return auditRepository.findAll();
    }

    @Override
    public Long persist(JPAAuditEntity template) {
        return 0L;
    }

    public static DBAudit transform(JPAAuditEntity entity) {
        return DBAudit.builder()
                .id(entity.getId())
                .action(AuditedAction.fromString(entity.getAction()))
                .personId(entity.getPersonId())
                .resource(entity.getResource())
                .build();
    }

    public static JPAAuditEntity transform(AuditTemplate entity) {
        return JPAAuditEntity.builder()
                .action(entity.action().name())
                .personId(entity.personId())
                .resource(entity.resource())
                .build();
    }
}

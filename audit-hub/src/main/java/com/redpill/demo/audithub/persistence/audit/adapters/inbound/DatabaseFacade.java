package com.redpill.demo.audithub.persistence.audit.adapters.inbound;

import com.redpill.demo.audithub.persistence.audit.AuditTemplate;
import com.redpill.demo.audithub.persistence.audit.DBAudit;
import com.redpill.demo.audithub.persistence.audit.adapters.outbound.BackendAdapter;
import com.redpill.demo.audithub.persistence.audit.ports.inbound.FetchAll;
import com.redpill.demo.audithub.persistence.audit.ports.inbound.PersistAudit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("auditDatabaseFacade")
@RequiredArgsConstructor
public class DatabaseFacade implements FetchAll, PersistAudit {

    private final BackendAdapter backendAdapter;

    @Override
    public List<DBAudit> fetchAll() {
        return backendAdapter.fetchAll().stream().map(BackendAdapter::transform).toList();
    }

    @Override
    public Long persist(AuditTemplate template) {
        return backendAdapter.persist(BackendAdapter.transform(template));
    }
}

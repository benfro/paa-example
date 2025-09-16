package com.redpill.demo.audithub.persistence.audit.ports.outbound;

import com.redpill.demo.audithub.persistence.audit.adapters.outbound.JPAAuditEntity;

import java.util.List;

public interface FetchAllBackend {

    List<JPAAuditEntity> fetchAll();
}

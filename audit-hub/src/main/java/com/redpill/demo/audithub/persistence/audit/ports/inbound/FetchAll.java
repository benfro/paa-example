package com.redpill.demo.audithub.persistence.audit.ports.inbound;

import com.redpill.demo.audithub.persistence.audit.DBAudit;

import java.util.List;

public interface FetchAll {

    List<DBAudit> fetchAll();
}

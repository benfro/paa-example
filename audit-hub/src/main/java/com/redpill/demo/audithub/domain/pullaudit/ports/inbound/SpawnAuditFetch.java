package com.redpill.demo.audithub.domain.pullaudit.ports.inbound;

public interface SpawnAuditFetch {

    interface Param {
        boolean isNotifyQueue();
    }

    void run(SpawnAuditFetch.Param param);
}

package com.redpill.demo.audithub.domain.pullaudit.application.adapters.inbound;

import com.redpill.demo.audithub.domain.pullaudit.ports.inbound.SpawnAuditFetch;
import lombok.RequiredArgsConstructor;


public record SpawnAuditFlowParam(boolean notifyQueue) implements SpawnAuditFetch.Param {

    @Override
    public boolean isNotifyQueue() {
        return notifyQueue;
    }
}

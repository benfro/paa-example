package com.redpill.demo.audithub.persistence.audit;

import lombok.Builder;
import lombok.With;

import java.util.UUID;

@Builder
public record AuditTemplate(
        @With AuditedAction action,
        UUID personId,
        @With String resource) {

}

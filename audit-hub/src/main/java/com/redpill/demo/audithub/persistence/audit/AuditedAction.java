package com.redpill.demo.audithub.persistence.audit;

public enum AuditedAction {
    CREATE,
    UPDATE,
    DELETE,
    RETRIEVE;

    public static AuditedAction fromString(String action) {
        return AuditedAction.valueOf(action.toUpperCase());
    }
}

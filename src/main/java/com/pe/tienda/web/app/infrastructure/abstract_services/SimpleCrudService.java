package com.pe.tienda.web.app.infrastructure.abstract_services;

import org.springframework.http.ResponseEntity;

public interface SimpleCrudService<RQ, RS,ID>{

    RS create(RQ rq);
    RS update(RQ rq , ID id);
    ResponseEntity<Void> delete(ID id);
}

package com.lionhuynh.service;

import com.lionhuynh.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastnameLike(String lastName);
}

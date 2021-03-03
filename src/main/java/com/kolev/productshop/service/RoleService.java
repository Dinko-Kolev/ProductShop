package com.kolev.productshop.service;

import com.kolev.productshop.domain.models.service.RoleServiceModel;

import java.util.Set;

public interface RoleService {

    void seedRolesInDb();


    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String authority);
}

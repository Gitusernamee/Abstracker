package com.pfa.abstracker.enumeration;

import java.util.Set;

//public enum Role {
//    ROLE_ADMIN(Set.of(
//            Permission.ADMIN_READ,
//            Permission.ADMIN_CREATE,
//            Permission.ADMIN_UPDATE,
//            Permission.ADMIN_DELETE
//    )),
//    ROLE_SURVEILLANT(Set.of(
//            Permission.SURVEILLANT_READ,
//            Permission.SURVEILLANT_CREATE
//    )),
//    ROLE_PROF(Set.of(
//            Permission.PROF_READ,
//            Permission.PROF_CREATE,
//            Permission.PROF_UPDATE
//    )),
//    ROLE_ETUDIANT(Set.of(
//            Permission.ETUDIANT_READ
//    ));
//
//    private final Set<Permission> permissions;
//
//    Role(Set<Permission> permissions) {
//        this.permissions = permissions;
//    }
//
//    public Set<Permission> getPermissions() {
//        return permissions;
//    }
//}
public enum Role {
    ROLE_SURVEILLANT,
    ROLE_PROF,
    ROLE_ETUDIANT
}

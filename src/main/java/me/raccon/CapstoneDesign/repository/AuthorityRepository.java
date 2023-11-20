package me.raccon.CapstoneDesign.repository;

import me.raccon.CapstoneDesign.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
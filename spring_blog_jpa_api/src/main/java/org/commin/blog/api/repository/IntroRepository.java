package org.commin.blog.api.repository;

import org.commin.blog.api.dto.Intro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntroRepository extends JpaRepository<Intro, Long> {

}

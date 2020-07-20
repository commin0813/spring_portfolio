package org.commin.blog.api.service.ifs;

import org.commin.blog.api.controller.ifs.CrudInterface;
import org.commin.blog.api.dto.network.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<Req, Res, Entity> implements CrudInterface<Req, Res> {

	@Autowired
	protected JpaRepository<Entity, Long> baseRepository;

}

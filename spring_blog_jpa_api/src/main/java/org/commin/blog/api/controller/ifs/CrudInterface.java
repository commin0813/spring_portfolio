package org.commin.blog.api.controller.ifs;

import java.util.List;

import org.commin.blog.api.dto.network.Header;

public interface CrudInterface<Req, Res> {

	Header<Res> create(Header<Req> request);

	Header<Res> read(Long id);

	Header<List<Res>> list();

	Header<Res> update(Header<Req> request);

	Header delete(Long id);

}

package org.commin.blog.api.controller;

import java.util.List;

import org.commin.blog.api.controller.ifs.CrudInterface;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestIntro;
import org.commin.blog.api.dto.network.response.ResponseIntro;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroController implements CrudInterface<RequestIntro, ResponseIntro> {

	@Override
	public Header<ResponseIntro> create(Header<RequestIntro> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<ResponseIntro> read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<List<ResponseIntro>> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header<ResponseIntro> update(Header<RequestIntro> request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package org.commin.blog.api.service;

import java.util.List;

import org.commin.blog.api.dto.Intro;

import org.commin.blog.api.dto.network.response.ResponseIntro;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestIntro;

import org.commin.blog.api.service.ifs.BaseService;

public class IntroService extends BaseService<RequestIntro, ResponseIntro, Intro> {

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

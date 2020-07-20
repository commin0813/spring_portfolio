package org.commin.blog.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.commin.blog.api.dto.Intro;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestIntro;
import org.commin.blog.api.dto.network.request.RequestSkill;
import org.commin.blog.api.dto.network.response.ResponseIntro;
import org.commin.blog.api.dto.network.response.ResponseSkill;
import org.commin.blog.api.service.ifs.BaseService;
import org.springframework.stereotype.Service;

@Service
public class IntroService extends BaseService<RequestIntro, ResponseIntro, Intro> {

	@Override
	public Header<ResponseIntro> create(Header<RequestIntro> request) {
		return Optional.ofNullable(request.getData()).map(body -> {
			Intro intro = Intro.builder()//
					.title(body.getTitle()).content(body.getContent()).photoUri(body.getPhotoUri()).build();
			return intro;
		}).map(newIntro -> {
			return baseRepository.save(newIntro);
		}).map(savedIntro -> {
			return response(savedIntro);
		}).orElseGet(() -> Header.ERROR("저장에 실패하였습니다."));
	}

	@Override
	public Header<ResponseIntro> read(Long id) {
		return baseRepository.findById(id).map(selectedIntro -> {
			return response(selectedIntro);
		}).orElseGet(() -> Header.ERROR("조회에 실패하였습니다."));
	}

	@Override
	public Header<List<ResponseIntro>> list() {
		List<ResponseIntro> list = baseRepository.findAll().stream().map(intro -> response_(intro)).collect(Collectors.toList());
		return Header.OK(list);
	}

	@Override
	@Transactional
	public Header<ResponseIntro> update(Header<RequestIntro> request) {
		RequestIntro requestIntro = request.getData();

		return baseRepository.findById(requestIntro.getId())//
				.map(selectedIntro -> {
					selectedIntro.setTitle(requestIntro.getTitle());
					selectedIntro.setContent(requestIntro.getContent());
					selectedIntro.setPhotoUri(requestIntro.getPhotoUri());
					return selectedIntro;
				}).map(updatedIntro -> {
					return response(updatedIntro);
				}).orElseGet(() -> Header.ERROR("업데이트에 실패하였습니다."));
	}

	@Override
	public Header delete(Long id) {
		return baseRepository.findById(id).map(selectedIntro -> {
			baseRepository.delete(selectedIntro);
			return Header.OK();
		}).orElseGet(() -> Header.ERROR("삭제에 실패하였습니다."));
	}

	public Header<ResponseIntro> response(Intro item) {

		ResponseIntro body = ResponseIntro.builder()//
				.id(item.getId())//
				.title(item.getTitle()).content(item.getContent()).photoUri(item.getPhotoUri()).createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();

		return Header.OK(body);
	}

	public ResponseIntro response_(Intro item) {

		ResponseIntro body = ResponseIntro.builder()//
				.id(item.getId())//
				.title(item.getTitle()).content(item.getContent()).photoUri(item.getPhotoUri()).createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();

		return body;
	}

}

package org.commin.blog.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.commin.blog.api.dto.Skill;
import org.commin.blog.api.dto.enumclass.SkillType;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestSkill;
import org.commin.blog.api.dto.network.response.ResponseSkill;
import org.commin.blog.api.service.ifs.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SkillService extends BaseService<RequestSkill, ResponseSkill, Skill> {

	@Override
	@Transactional
	public Header<ResponseSkill> create(Header<RequestSkill> request) {
		return Optional.ofNullable(request.getData()).map(body -> {
			Skill skill = Skill.builder()//
					.imageUri(body.getImageUri())//
					.skillName(body.getSkillName())//
					.skillType(body.getSkillType() == null ? SkillType.LANGUAGE : body.getSkillType()).build();
			return skill;
		}).map(newSkill -> {
			return baseRepository.save(newSkill);
		}).map(savedSkill -> {
			return response(savedSkill);
		}).orElseGet(() -> Header.ERROR("저장에 실패하였습니다."));
	}

	@Override
	public Header<ResponseSkill> read(Long id) {
		return baseRepository.findById(id).map(selectedSkill -> {
			return response(selectedSkill);
		}).orElseGet(() -> Header.ERROR("조회에 실패하였습니다."));
	}

	@Override
	@Transactional
	public Header<ResponseSkill> update(Header<RequestSkill> request) {
		RequestSkill requestSkill = request.getData();

		return baseRepository.findById(requestSkill.getId())//
				.map(selectedSkill -> {
					selectedSkill.setImageUri(requestSkill.getImageUri());
					selectedSkill.setSkillName(requestSkill.getSkillName());
					selectedSkill.setSkillType(requestSkill.getSkillType() == null ? SkillType.LANGUAGE : requestSkill.getSkillType());
					return selectedSkill;
				}).map(updatedSkill -> {
					return response(updatedSkill);
				}).orElseGet(() -> Header.ERROR("업데이트에 실패하였습니다."));
	}

	@Override
	public Header delete(Long id) {
		return baseRepository.findById(id).map(selectedSkill -> {
			baseRepository.delete(selectedSkill);
			return Header.OK();
		}).orElseGet(() -> Header.ERROR("삭제에 실패하였습니다."));
	}

	@Override
	public Header<List<ResponseSkill>> list() {
		List<ResponseSkill> list = baseRepository.findAll().stream().map(skill -> response_(skill)).collect(Collectors.toList());
		return Header.OK(list);
	}

	public Header<List<ResponseSkill>> list(SkillType skillType) {
		List<ResponseSkill> list = baseRepository.findAll().stream().filter(s -> s.getSkillType() == skillType).map(skill -> response_(skill)).collect(Collectors.toList());
		return Header.OK(list);
	}

	public Header<ResponseSkill> response(Skill item) {

		ResponseSkill body = ResponseSkill.builder()//
				.id(item.getId())//
				.imageUri(item.getImageUri())//
				.skillName(item.getSkillName())//
				.skillType(item.getSkillType())//
				.createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();

		return Header.OK(body);
	}

	public ResponseSkill response_(Skill item) {

		ResponseSkill body = ResponseSkill.builder()//
				.id(item.getId())//
				.imageUri(item.getImageUri())//
				.skillName(item.getSkillName())//
				.skillType(item.getSkillType())//
				.createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();

		return body;
	}

}

package org.commin.blog.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.commin.blog.api.dto.Intro;
import org.commin.blog.api.dto.Project;
import org.commin.blog.api.dto.Skill;
import org.commin.blog.api.dto.network.Header;
import org.commin.blog.api.dto.network.request.RequestProject;
import org.commin.blog.api.dto.network.request.RequestSkill;
import org.commin.blog.api.dto.network.response.ResponseIntro;
import org.commin.blog.api.dto.network.response.ResponseProject;
import org.commin.blog.api.dto.network.response.ResponseSkill;
import org.commin.blog.api.service.ifs.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends BaseService<RequestProject, ResponseProject, Project> {

	@Override
	@Transactional
	public Header<ResponseProject> create(Header<RequestProject> request) {
		return Optional.ofNullable(request.getData()).map(body -> {
			Project project = Project.builder()//
					.startDateString(body.getStartDateString()).endDateString(body.getEndDateString()).projectName(body.getProjectName()).projectDesc(body.getProjectDesc()).projectImageUri(body.getProjectImageUri()).build();
			return project;
		}).map(newProject -> {
			return baseRepository.save(newProject);
		}).map(savedProject -> {
			return response(savedProject);
		}).orElseGet(() -> Header.ERROR("저장에 실패하였습니다."));
	}

	@Override
	public Header<ResponseProject> read(Long id) {
		return baseRepository.findById(id).map(selectedProject -> {
			return response(selectedProject);
		}).orElseGet(() -> Header.ERROR("조회에 실패하였습니다."));
	}

	@Override
	public Header<List<ResponseProject>> list() {
		List<ResponseProject> list = baseRepository.findAll().stream().map(project -> response_(project)).collect(Collectors.toList());
		return Header.OK(list);
	}

	@Override
	@Transactional
	public Header<ResponseProject> update(Header<RequestProject> request) {
		RequestProject requestProject = request.getData();

		return baseRepository.findById(requestProject.getId())//
				.map(selectedProject -> {
					selectedProject.setStartDateString(requestProject.getStartDateString());
					selectedProject.setEndDateString(requestProject.getEndDateString());
					selectedProject.setProjectName(requestProject.getProjectName());
					selectedProject.setProjectDesc(requestProject.getProjectDesc());
					selectedProject.setProjectImageUri(requestProject.getProjectImageUri());
					return selectedProject;
				}).map(updatedProject -> {
					return response(updatedProject);
				}).orElseGet(() -> Header.ERROR("업데이트에 실패하였습니다."));
	}

	@Override
	public Header delete(Long id) {
		return baseRepository.findById(id).map(selectedProject -> {
			baseRepository.delete(selectedProject);
			return Header.OK();
		}).orElseGet(() -> Header.ERROR("삭제에 실패하였습니다."));
	}

	public Header<ResponseProject> response(Project item) {

		ResponseProject body = ResponseProject.builder()//
				.id(item.getId())//
				.startDateString(item.getStartDateString())
				.endDateString(item.getEndDateString())
				.projectName(item.getProjectName())
				.projectDesc(item.getProjectDesc())
				.projectImageUri(item.getProjectImageUri())
				.createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();

		return Header.OK(body);
	}

	public ResponseProject response_(Project item) {
		ResponseProject body = ResponseProject.builder()//
				.id(item.getId())//
				.startDateString(item.getStartDateString())
				.endDateString(item.getEndDateString())
				.projectName(item.getProjectName())
				.projectDesc(item.getProjectDesc())
				.projectImageUri(item.getProjectImageUri())
				.createDate(item.getCreateDate())//
				.updateDate(item.getUpdateDate()).build();
		return body;
	}

}

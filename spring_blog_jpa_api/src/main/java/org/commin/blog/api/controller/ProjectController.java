package org.commin.blog.api.controller;

import org.commin.blog.api.dto.Project;
import org.commin.blog.api.dto.network.request.RequestProject;
import org.commin.blog.api.dto.network.response.ResponseProject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController extends CrudController<RequestProject, ResponseProject, Project> {

}

package org.commin.blog.api.controller;

import org.commin.blog.api.dto.Intro;
import org.commin.blog.api.dto.network.request.RequestIntro;
import org.commin.blog.api.dto.network.response.ResponseIntro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/intro")
public class IntroController extends CrudController<RequestIntro, ResponseIntro, Intro> {

}

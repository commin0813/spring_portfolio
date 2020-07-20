package org.commin.blog.api.dto.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestIntro {
	private Long id;
	private String title;
	private String content;
	private String photoUri;
}

package org.commin.blog.api.dto.network.response;

import java.sql.Timestamp;

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
public class ResponseIntro {
	private Long id;
	private String title;
	private String content;
	private String photoUri;
	private Timestamp createDate;
	private Timestamp updateDate;
}

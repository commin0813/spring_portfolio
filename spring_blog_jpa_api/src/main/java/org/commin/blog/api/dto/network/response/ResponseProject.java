package org.commin.blog.api.dto.network.response;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Lob;

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
public class ResponseProject {
	private Long id;
	private String startDateString;
	private String endDateString;
	private String projectName;
	private String projectDesc;
	private String projectImageUri;
	private Timestamp createDate;
	private Timestamp updateDate;
}

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
public class ResponseSkill {
	private Long id;
	private String imageUri;
	private String skillName;
	private Timestamp createDate;
	private Timestamp updateDate;
}

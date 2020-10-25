package org.commin.blog.api.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 8)
	private String startDateString;
	@Column(nullable = false, length = 8)
	private String endDateString;
	@Column(nullable = false, length = 150)
	private String projectName;
	@Column(nullable = false, length = 200)
	private String projectDesc;

	@Lob
	private String projectImageUri;

	@CreationTimestamp
	private Timestamp createDate;

	@UpdateTimestamp
	private Timestamp updateDate;

}

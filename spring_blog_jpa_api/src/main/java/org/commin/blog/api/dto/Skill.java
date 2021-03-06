package org.commin.blog.api.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.commin.blog.api.dto.enumclass.SkillType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Lob
	private String imageUri;

	@Column(nullable = false, length = 100)
	private String skillName;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private SkillType skillType;

	@CreationTimestamp
	private Timestamp createDate;

	@UpdateTimestamp
	private Timestamp updateDate;
}

package com.karadayi.librarymanagement.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import java.time.OffsetDateTime;

import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Book extends AbstractEntity {
	
	private int pageCount;

	@GeneratedValue( generator = "custom-uuid" )
	@GenericGenerator(
		name = "custom-uuid",
		strategy = "org.hibernate.id.UUIDGenerator",
		parameters = {
			@Parameter(
					name = "uuid_gen_strategy_class",
					value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
				)  
		}
	)
	@Type(type="pg-uuid")
	private UUID userUuid;	
	
	private boolean published;
	
	private OffsetDateTime publishedAt; 
	
	@CreationTimestamp
	private OffsetDateTime createdAt;//OffsetDateTime yerine Instant ve @CreationTimestamp kullansak nasil olur
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID",nullable = false)
	private Author author;
}

package com.karadayi.librarymanagement.entities;



import java.util.HashSet;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.*;




@EqualsAndHashCode(callSuper = true, exclude = {"publishedbooks"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Author extends AbstractEntity {
	
	
	@OneToMany(mappedBy = "author",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Book> publishedbooks; 
	
	
	
	

}

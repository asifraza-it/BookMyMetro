package com.upmrc.domain;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Entity
@Data
@ToString
@NoArgsConstructor
@Table

public class StationDetail {
	
	@Id   //for primarykey we use id annotaion
	int id;
	String stationName;
	int idPrev;
	int idNext;

}

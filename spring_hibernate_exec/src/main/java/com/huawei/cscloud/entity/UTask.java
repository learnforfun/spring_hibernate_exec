package com.huawei.cscloud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "utask")
public class UTask {
	private long id;
	
	private String createtime;

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="utask_id")  
	@SequenceGenerator(name="utask_id", sequenceName="seq_utask_id") 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

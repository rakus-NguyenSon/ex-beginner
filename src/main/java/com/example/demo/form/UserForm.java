package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class UserForm {

	@NotBlank(message = "名前は必須です")
	private String name;
	
	@NotNull(message = "年齢は必須です")
	@Range(min=0, max=150, message = "年齢は０から１５０まで入力してください")
	private Integer age;
	
	@NotBlank(message = "コメントが必須です")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}

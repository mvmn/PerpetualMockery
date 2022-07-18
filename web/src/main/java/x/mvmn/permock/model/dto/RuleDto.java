package x.mvmn.permock.model.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RuleDto {
	@NotBlank
	private String ruleText;
}

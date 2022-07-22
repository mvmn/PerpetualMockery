package x.mvmn.permock.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RuleViewDto extends RuleDto {
	private Long id;
}

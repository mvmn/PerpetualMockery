package x.mvmn.permock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import x.mvmn.permock.model.dto.RuleDto;
import x.mvmn.permock.model.dto.RuleViewDto;
import x.mvmn.permock.persistence.entity.RuleEntity;

@Mapper(componentModel = "spring")
public interface RuleMapper {

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "serialized", ignore = true)
	@Mapping(target = "textRaw", source = "ruleText")
	RuleEntity map(RuleDto dto);

	@Mapping(target = "ruleText", source = "textRaw")
	RuleDto map(RuleEntity entity);

	@Mapping(target = "ruleText", source = "textRaw")
	RuleViewDto mapToViewDto(RuleEntity entity);
}

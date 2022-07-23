package x.mvmn.permock.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import x.mvmn.permock.exception.NotFound;
import x.mvmn.permock.mapper.RuleMapper;
import x.mvmn.permock.model.dto.RuleDto;
import x.mvmn.permock.model.dto.RuleViewDto;
import x.mvmn.permock.model.rules.MockRule;
import x.mvmn.permock.persistence.entity.RuleEntity;
import x.mvmn.permock.persistence.repository.RuleRepository;
import x.mvmn.permock.service.RuleParsingService;

@RestController
@RequestMapping("/api/rules")
public class RulesController {
	@Autowired
	private RuleMapper ruleMapper;

	@Autowired
	private RuleParsingService ruleParsingService;

	@Autowired
	private RuleRepository ruleRepository;

	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping
	public List<RuleViewDto> list() {
		return ruleRepository.findAll().stream().map(ruleMapper::mapToViewDto).collect(Collectors.toList());
	}

	@GetMapping("{ruleId}")
	public Optional<RuleViewDto> get(@PathVariable("ruleId") Long ruleId) {
		return ruleRepository.findById(ruleId).map(ruleMapper::mapToViewDto);
	}

	@PostMapping
	public RuleViewDto create(@RequestBody @Validated RuleDto rule) {
		RuleEntity ruleEntity = ruleMapper.map(rule);
		ruleEntity.setSerialized(parseAndSerialize(rule.getRuleText()));
		return ruleMapper.mapToViewDto(ruleRepository.save(ruleEntity));
	}

	@DeleteMapping("{ruleId}")
	public void delete(@PathVariable("ruleId") Long ruleId) {
		ruleRepository.deleteById(ruleId);
	}

	@PutMapping("{ruleId}")
	public void update(@PathVariable("ruleId") Long ruleId, @RequestBody @Validated RuleDto rule) {
		RuleEntity ruleEntity = ruleRepository.findById(ruleId)
				.orElseThrow(() -> new NotFound("Rule not found by id " + ruleId));
		ruleEntity.setSerialized(parseAndSerialize(rule.getRuleText()));
		ruleEntity.setTextRaw(rule.getRuleText());
		ruleEntity.setPriority(rule.getPriority());
		ruleRepository.save(ruleEntity);
	}

	protected String parseAndSerialize(String text) {
		try {
			MockRule ruleModel = ruleParsingService.parse(text);
			System.out.println("---\n" + ruleModel + "\n---");
			String serialized = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ruleModel);
			System.out.println("---\n" + serialized + "\n---");
			return serialized;
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Rule model serialization failed", e);
		}
	}
}

package x.mvmn.permock.controller;

import java.util.Optional;

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

import x.mvmn.permock.mapper.RuleMapper;
import x.mvmn.permock.model.dto.RuleDto;
import x.mvmn.permock.persistence.repository.RuleRepository;
import x.mvmn.permock.xtext.service.XtextService;

@RestController
@RequestMapping("/api/rules")
public class RulesController {
	@Autowired
	private RuleMapper ruleMapper;

	@Autowired
	private XtextService xtextService;

	@Autowired
	private RuleRepository ruleRepository;

	@GetMapping("{ruleId}")
	public Optional<RuleDto> get(@PathVariable("ruleId") Long ruleId) {
		return ruleRepository.findById(ruleId).map(ruleMapper::map);
	}

	@PostMapping
	public RuleDto create(@RequestBody @Validated RuleDto rule) {
		System.out.println(xtextService.parse(rule.getRuleText()));
		return ruleMapper.map(ruleRepository.save(ruleMapper.map(rule)));
	}

	@DeleteMapping("{ruleId}")
	public void delete(@PathVariable("ruleId") Long ruleId) {
		ruleRepository.deleteById(ruleId);
	}

	@PutMapping("{ruleId}")
	public void update(@PathVariable("ruleId") Long ruleId, @RequestBody @Validated RuleDto rule) {

	}
}

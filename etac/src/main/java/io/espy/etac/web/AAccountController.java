package io.espy.etac.web;

import io.espy.etac.model.AAccount;
import io.espy.etac.service.AAccountService;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AAccountController {

	@Autowired
	AAccountService aAccountService;
	private static final Logger logger = LoggerFactory
			.getLogger(AAccountController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/account/listAll", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("find all AAccount entries");

		List<AAccount> aAccountList = aAccountService.findAll();
		logger.info("found");

		model.addAttribute("aAccountList", aAccountList);

		return "aaccount";
	}
}

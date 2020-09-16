package cap.curso.jpa.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cap.curso.jpa.business.services.JPAUsuarioService;

@Controller
public class JpaController
{

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private JPAUsuarioService usuarioManager;

	@RequestMapping(value = "/")
	public ModelAndView handleRequest(ModelAndView modelAndView)
	{

		modelAndView.addObject("usuarios", usuarioManager.getOrdenados());
		modelAndView.setViewName("home");
		return modelAndView;
	}
}

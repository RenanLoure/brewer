package Com.ProjetoRenan.brewer.control;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import Com.ProjetoRenan.brewer.model.cerveja;


@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo(cerveja cerveja) {
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrarCerveja(@Valid cerveja cerveja ,BindingResult result, Model model, RedirectAttributes attributes ) {
		if (result.hasErrors()) {
			return novo(cerveja);
			
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso");
		System.out.println(">> sku: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
		
	
	    } 
		
	@RequestMapping("/cervejas/cadastro")
	public String cadastro() {
		return "cerveja/cadastro-produto";
	}
}

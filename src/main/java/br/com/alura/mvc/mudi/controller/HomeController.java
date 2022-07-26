package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Mini jiló");
		pedido.setDataDaEntrega(LocalDate.now());
		pedido.setUrlProduto("https://www.magazineluiza.com.br/jilo-mini-em-conserva-pote-grande-estucchi-saboardi/p/fb103f1kj6/cj/smnt/?&seller_id=armazemcanastra&utm_source=google&utm_medium=pla&utm_campaign=&partner_id=68284&&&utm_source=google&utm_medium=pla&utm_campaign=&partner_id=58950&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd4QCacfg4WbE-XtnILJsNVdfPCzqIm3f_b4nlCGfmNPg1QvPrPNfJ4aAl_4EALw_wcB&gclsrc=aw.ds");
		pedido.setUrlImagem("https://a-static.mlcdn.com.br/800x560/jilo-mini-em-conserva-pote-grande-estucchi-saboardi/armazemcanastra/15814953194/d70d149393ac6f822456c26f3aacde22.jpg");
		pedido.setDescricao("Jiló Mini em Conserva - Pote Grande\n"
				+ "***OBS: COMO SE TRATA DE UM PRODUTO FRÁGIL, NÃO RECOMENDAMOS QUE SEJA SELECIONADO MAIS DE 2 UNIDADES POR PEDIDO, CONTAMOS COM SUA COMPREENSÃO***\n"
				+ "\n"
				+ "Mini jiló em conserva - pote 3kg(DRENADO 1,8KG)\n"
				+ "\n"
				+ "Ingredientes: Jiló, vinagre, sal e especiarias.\n"
				+ "Validade: 1 ano\n"
				+ "Não contém glúten");
		pedido.setValorNegociado(new BigDecimal("50"));
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

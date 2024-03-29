package be.ehb.products.Controller;


import be.ehb.products.model.Product;
import be.ehb.products.model.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {

    @Autowired
        ProductDao dao;

    @ModelAttribute(value = "all")
        public Iterable<Product> findAll(){
        return dao.findAll();
    }
    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
        public String showIndex(ModelMap map){
        return "index";

    }
}

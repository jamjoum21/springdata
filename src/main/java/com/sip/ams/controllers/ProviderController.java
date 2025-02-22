package com.sip.ams.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

import java.util.List;

import javax.validation.Valid;
@Controller
@RequestMapping("/provider/")

public class ProviderController {
	/*
	@Autowired
	private final ProviderRepository providerRepository;
	
	
    public ProviderController(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    
    @GetMapping("list")
    //@ResponseBody
    public String listProviders(Model model) {
    	
    	
    	List<Provider> lp = (List<Provider>) providerRepository.findAll();
    	if(lp.size()==0) lp = null;
        model.addAttribute("providers", lp);       
        return "provider/listProviders";
        
       
    }
    
    @GetMapping("add")
    public String showAddProviderForm(Model model) {
    	Provider provider = new Provider();// object dont la valeur des attributs par defaut
   
    	model.addAttribute("provider", provider);
        return "provider/addProvider";
    }
    
    @PostMapping("add")
    public String addProvider(@Valid Provider provider, BindingResult result) {
        if (result.hasErrors()) {
            return "provider/addProvider";
        }
        providerRepository.save(provider);
        return "redirect:list";
    }

    
    @GetMapping("delete/{id}")
    public String deleteProvider(@PathVariable("id") long id, Model model) {

        Provider provider = providerRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid provider Id:" + id));

        providerRepository.delete(provider);

        return "redirect:../list";
    }
    
    
    @GetMapping("edit/{id}")
    public String showProviderFormToUpdate(@PathVariable("id") long id, Model model) {
        Provider provider = providerRepository.findById(id)
            .orElseThrow(()->new IllegalArgumentException("Invalid provider Id:" + id));
        
        model.addAttribute("provider", provider);
        
        return "provider/updateProvider";
    }


    
    @PostMapping("update")
    public String updateProvider(@Valid Provider provider, BindingResult result) {
    	if (result.hasErrors()) {
            return "provider/updateProvider";
        }
    	
    	providerRepository.save(provider);
    	return"redirect:list";
    	
    }*/
}

package com.spring.codeblog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;

@RestController
public class CodeblogController {
	
	@Autowired
	CodeblogService codeblogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	//returns post and view (renderized html page) wtffffff
	public ModelAndView getPosts() {
		String viewName = "posts";
		ModelAndView mv = new ModelAndView(viewName);
		List<Post> posts = codeblogService.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
	
	@GetMapping(value="/posts/{id}")	
	//returns post details
	public ModelAndView getPostsDetails(@PathVariable("id") long id) {
		String postDetails = "postDetails";
		ModelAndView mv = new ModelAndView(postDetails);
		Post post = codeblogService.findById(id);
		mv.addObject("post", post);
		return mv;
	}
	
	@RequestMapping(value = "/newpost", method = RequestMethod.GET)
	//returns post creation html
	public String getPostForm() {
		return "postform";
	}
		
	
	@RequestMapping(value="/newpost", method = RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
            return "redirect:/newpost";
        }
        post.setData(LocalDate.now());
        codeblogService.save(post);
        return "redirect:/posts";
    }
	
	
	
	
	
	
	
	
	

}

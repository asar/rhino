package controllers;

import play.mvc.*;
import play.data.validation.*;

import models.*;

public class Application extends Controller {
    

    public static void index() {
        render();
    }
 

    public static void add(){

     render() ;

    }
 
    public static void addProduct(@Valid Product product){

	if(validation.hasErrors()){
	index();

        }
	else{
	product.create();
	flash.success(product.name + " -- Added to Selltics");
	add();
	}

   }



}

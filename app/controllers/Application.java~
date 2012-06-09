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

    	System.out.println(">>>>>>>> Book's normal name" + product.name);
	System.out.println(">>>>>>>> subCategory" + product.subCategory);
	System.out.println(">>>>>>>> Rent" + product.rent);

	if(validation.hasErrors()){
	//render() ;

        }
	product.create();
	flash.success(product.name + " -- Added to Selltics");
	add();
	

   }



}

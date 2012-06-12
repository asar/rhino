package models;


import siena.*;
//import play.data.validation.*;

import siena.Json.*;



public class Product extends Model {

@Id(Generator.AUTO_INCREMENT)
@Column("ID")
public Long ID ;

@Max(20) @NotNull
public String category ;

@Max(20) @NotNull
public String subCategory ;

@Max(20) @NotNull
public String name ;

@Max(10) @NotNull
public String dateTill ;

@Max(10) @NotNull
public double rent ;


public String genre ;

@Max(50) @NotNull
public String anyKnownFaults ;


public Product(String category ,String subCategory ,String name ,String dateTill ,double rent ,String genre ,String anyKnownFaults){

this.category = category ;
this.subCategory = subCategory ;
this.name = name ;
this.dateTill = dateTill ;
this.rent = rent ;
this.genre = genre ;
this.anyKnownFaults = anyKnownFaults ;

}



public static Query<Product> all() {
        	return Model.all(Product.class);
        }

}


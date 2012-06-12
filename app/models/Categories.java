package models;


import siena.*;
import play.data.validation.*;
import javax.persistence.*;




@Table("Categories")
public class Categories extends Model {

@Id(Generator.AUTO_INCREMENT)
@Column("catID")
public Long catID ;

@Max(10) @NotNull
@Column("parentId")
public String parentId ;


@Max(10) @NotNull
@Column("catName")
public String catName ;

@Column("catDesc")
public String catDesc ;


public Categories(String catID ,String parentId ,String catName ,String catDesc){

this.catID = catID ;
this.parentId = parentId ;
this.catName = catName ;
this.catDesc = catDesc ;

}


public String toString() {

        return "Category name = " + catName + " and Parent ID is = " + parentId;

    }


public static Query<Categories> all() {
        	return Model.all(Categories.class);
        }




}

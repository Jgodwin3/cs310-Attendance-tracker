/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas_sp2018;

/**
 *
 * @author odell
 */
public class Tas_Sp2018 {
       public class Badge{
           private String description;
	   private String id;
	
	   public Badge(){
		description = "";
		id = "";
	}
	   public Badge(String description, String id){
		this.description = description;
		this.id = id;
	}
	
	   public String getDescription() {return description;}
	   public String getId() {return id;}


	   public void setDescription(String description) {return this.description;}
	   public void setId(String id) {return this.id;}


	   @Override
	   public String toString(){
		return "#" + getId() + " (" + getDescription() + ")";
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
}

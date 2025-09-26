 enum Season{

	    SUMMER("Hot"),
	    COLD("Cold"),
	    SPRING("Warm");

	    private String description;

	    Season(String description)
	    {
	    	 this.description=description;
	    }

	    public String getDescription()
	    {
	    	return description;
	    }
}


class Test{

	public static void main(String[] args) {
		

		 String seasonDay = "summer";
         Season season = Season.valueOf(seasonDay);
         System.out.println("season :"+season);
		 
		  // for(Season season:Season.values())
		  // {
		  // 	 System.out.println(season  + " is " +  season.getDescription());
		  // }
	}
}